package wp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.dynatrace.diagnostics.pdk.PluginEnvironment;
import com.dynatrace.diagnostics.pdk.Status;

public class WindowsProcessMonitor {

	private static final String CONFIG_PROCESS = "Process";
	
	private boolean matchRuleSuccess;
	private String CMD = "tasklist";
	private String param = "/S";
	private String server = null;
	private String param2 = "/fi";
	private String param3 = "\"imagename eq";
	private String processName = null; 
	private String param4 = "\"";
	private int count = 0;
	
	private static final Logger log = Logger.getLogger(WindowsProcessMonitor.class.getName());

	protected Status setup(PluginEnvironment env) throws Exception {
		Status result = new Status(Status.StatusCode.Success);
        String host = env.getHost().getAddress();
		String process = env.getConfigString(CONFIG_PROCESS);
		
			if (process != null && host != null) {
				server = host;
				System.out.println(server);
				processName = process;
				System.out.println(process);
			}
			
		return result;
	}

	protected Status execute(PluginEnvironment env) throws Exception {
		Status result = new Status(Status.StatusCode.Success);

		String output = executeCommand(CMD, param, server, param2, param3, processName, param4, result);

		if (log.isLoggable(Level.FINE)) log.fine("Command output was: " + output);
        System.out.println(output);
		
		matchRuleSuccess = false;
		if (output != null) {
			count = output.split(processName).length -1;
				result.setMessage("Process Count is: " + Integer.toString(count));
				matchRuleSuccess = true;
			}
			else {
			    result = new Status(Status.StatusCode.PartialSuccess);
				result.setMessage("0");
				matchRuleSuccess = false;
			}
		
		System.out.println("Here's the process count: " + count);
		return result;
		
	}
	
	protected boolean isMatchRuleSuccess() {
		return matchRuleSuccess;
	}

	protected int returnProcessCount() {
		return count;

}
	protected void teardown(PluginEnvironment env) throws Exception {
	}

	private String executeCommand(String CMD, String param, String server, String param2, String param3, String process, String param4, Status status) {

		String[] command = {"tasklist","/S",server,"/fi","\"imagename eq " + process + "\""};

		
		String inputstream = "";
		String line = "";
		System.out.println(Arrays.toString(command));
		
		try {
		Runtime rt = Runtime.getRuntime();
		Process execute = rt.exec(command);
		System.out.println(line);
		BufferedReader BR = new BufferedReader(new InputStreamReader(execute.getInputStream()));

		while ((line = BR.readLine()) != null){
			inputstream += line;
			System.out.println(line);
			}
		execute.destroy();
		}
		catch (Throwable t) {
			t.printStackTrace();
		}
		return inputstream;
	}
	
}
