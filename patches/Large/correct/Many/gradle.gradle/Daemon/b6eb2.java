diff --git a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/Daemon.java b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/Daemon.java
index ce8dbdf..78f1796 100644
--- a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/Daemon.java
+++ b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/Daemon.java
@@ -110,7 +110,7 @@
                             try {
                                 command = (Command) connection.receive();
                                 LOGGER.info("Daemon (pid: {}) received command: {}", daemonContext.getPid(), command);
-                            } catch (RuntimeException e) {
+                            } catch (Throwable e) {
                                 String message = String.format("Unable to receive command from connection: '%s'", connection);
                                 LOGGER.warn(message + ". Dispatching the failure to the daemon client...", e);
                                 connection.dispatch(new DaemonFailure(new RuntimeException(message, e)));
@@ -121,7 +121,7 @@
                             try {
                                 LOGGER.debug(DaemonMessages.STARTED_EXECUTING_COMMAND + command + " with connection: " + connection + ".");
                                 commandExecuter.executeCommand(connection, command, daemonContext, stateCoordinator);
-                            } catch (RuntimeException e) {
+                            } catch (Throwable e) {
                                 String message = String.format("Uncaught exception when executing command: '%s' from connection: '%s'.", command, connection);
                                 LOGGER.warn(message + ". Dispatching the failure to the daemon client...", e);
                                 connection.dispatch(new DaemonFailure(new RuntimeException(message, e)));
