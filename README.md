<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Windows Process Monitor Plugin</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
    <meta content="Scroll Wiki Publisher" name="generator"/>
    <link type="text/css" rel="stylesheet" href="css/blueprint/liquid.css" media="screen, projection"/>
    <link type="text/css" rel="stylesheet" href="css/blueprint/print.css" media="print"/>
    <link type="text/css" rel="stylesheet" href="css/content-style.css" media="screen, projection, print"/>
    <link type="text/css" rel="stylesheet" href="css/screen.css" media="screen, projection"/>
    <link type="text/css" rel="stylesheet" href="css/print.css" media="print"/>
</head>
<body>
                <h1>Windows Process Monitor Plugin</h1>
    <div class="section-2"  id="73400852_WindowsProcessMonitorPlugin-Overview"  >
        <h2>Overview</h2>
    <p>
            <img src="images_community/download/attachments/73400852/icon.png" alt="images_community/download/attachments/73400852/icon.png" class="confluence-embedded-image image-center" />
            </p>
    <p>
The plugin is querying the specified process on the given host(s) using the Windows tasklist command.<br/>The tasklist command allows a user to get information on applications and services with their process ID for all tasks running on a server. The plugin formats its output to return the count.    </p>
    <p>
            <img src="images_community/download/attachments/73400852/Windows_Process_Monitor_Dashboard.jpg" alt="images_community/download/attachments/73400852/Windows_Process_Monitor_Dashboard.jpg" class="confluence-embedded-image" />
            </p>
    </div>
    <div class="section-2"  id="73400852_WindowsProcessMonitorPlugin-PluginDetails"  >
        <h2>Plugin Details</h2>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
Plug-In Versions    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<a href="attachments_73334948_1_com.dynatrace.diagnostics.plugins.WindowsProcessStatusPlugin_1.0.0.jar">Windows Process Monitor Plugin 1.0.0</a> (compatible with dynaTrace 3.5.2+)    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Author    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Derek Abing    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
License    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<a href="attachments_5275722_2_dynaTraceBSD.txt">dynaTrace BSD</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Support    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<a href="https://community/display/DL/Support+Levels#SupportLevels-Community">Not Supported </a><br/>If you have any questions or suggestions for these plugins, please add a comment to this page, use our <a href="https://community.dynatrace.com/community/pages/viewpage.action?pageId=46628918">forum</a>, or drop us an email at <a href="mailto:community@dynatrace.com">community@dynatrace.com</a>!    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Known Problems    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Release History    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
2012-03-05 Initial Release    </p>
            </td>
        </tr>
</tbody>        </table>
            </div>
    </div>
    <div class="section-2"  id="73400852_WindowsProcessMonitorPlugin-ProvidedMeasures"  >
        <h2>Provided Measures</h2>
<ul class=" "><li class=" ">    <p>
<strong class=" ">ProcessCount</strong>: Returns count of running processes matching the configured identifier.    </p>
</li></ul>    </div>
    <div class="section-2"  id="73400852_WindowsProcessMonitorPlugin-Configuration"  >
        <h2>Configuration</h2>
    <div class="tablewrap">
        <table>
<thead class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
Name    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Value    </p>
            </td>
        </tr>
</thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
Process    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
The identifier of the process to monitor. (the filename, e.g. java.exe)    </p>
            </td>
        </tr>
</tbody>        </table>
            </div>
    <p>
Since the plugin is using the tasklist command, this means that the logon account configured for the dynaTrace collector needs to have appropriate access to the host(s) you want to monitor (typically Administrator access to the server). A good way to test this is to log into the collector with the account it is running as, open a command prompt and execute a tasklist command to the remote server you want to monitor.    </p>
    </div>
    <div class="section-2"  id="73400852_WindowsProcessMonitorPlugin-Installation"  >
        <h2>Installation</h2>
    <p>
Import the Plugin into the dynaTrace Server. For details how to do this please refer to the <a href="https://community.dynatrace.com/community/display/DOCDT41/Manage+and+Develop+Plugins#ManageandDevelopPlugins-ManageandDevelopPlugins">dynaTrace  documentation</a>.    </p>
    </div>
            </div>
        </div>
        <div class="footer">
        </div>
    </div>
</body>
</html>
