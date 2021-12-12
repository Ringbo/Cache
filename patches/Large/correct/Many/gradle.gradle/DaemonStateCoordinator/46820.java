diff --git a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonStateCoordinator.java b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonStateCoordinator.java
index 167e380..2ab646b 100644
--- a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonStateCoordinator.java
+++ b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonStateCoordinator.java
@@ -169,7 +169,12 @@
         lock.lock();
         try {
             if (currentCommandExecution != null) { // daemon is busy
-                LOGGER.warn("onStartCommand({}) called while currentCommandExecution = {}", execution, currentCommandExecution);
+                /*
+                    This is not particularly abnormal as daemon can become busy between a particular client connecting to it and then
+                    sending a command. The UpdateDaemonStateAndHandleBusyDaemon command action will send back a DaemonBusy result
+                    to the client which will then just try another daemon, making this a non-error condition.
+                */
+                LOGGER.debug("onStartCommand({}) called while currentCommandExecution = {}", execution, currentCommandExecution);
                 return currentCommandExecution;
             } else {
                 LOGGER.debug("onStartCommand({}) called after {} mins of idle", execution, getIdleMinutes());
