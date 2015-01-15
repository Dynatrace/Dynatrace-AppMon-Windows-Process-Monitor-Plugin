package wp;

import java.util.Collection;

import com.dynatrace.diagnostics.pdk.Monitor;
import com.dynatrace.diagnostics.pdk.MonitorEnvironment;
import com.dynatrace.diagnostics.pdk.MonitorMeasure;
import com.dynatrace.diagnostics.pdk.Status;

public class WPMonitor extends WindowsProcessMonitor implements Monitor {

	private static final String METRIC_GROUP = "Windows Process Status Monitor";
	private static final String MSR_PROCESS_COUNT = "ProcessCount";
	
	@Override
	public Status setup(MonitorEnvironment env) throws Exception {
		return super.setup(env);
	}

	@Override
	public Status execute(MonitorEnvironment env) throws Exception {
		Status result = super.execute(env);

		Collection<MonitorMeasure> measures;
		if ((measures = env.getMonitorMeasures(METRIC_GROUP, MSR_PROCESS_COUNT)) != null) {
			for (MonitorMeasure measure : measures)
				measure.setValue(returnProcessCount());
		}

		return result;
	}

	@Override
	public void teardown(MonitorEnvironment env) throws Exception {
		super.teardown(env);
	}

}
