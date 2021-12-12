diff --git a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/DaemonClient.java b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/DaemonClient.java
index b229526..4f3e631 100644
--- a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/DaemonClient.java
+++ b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/DaemonClient.java
@@ -236,7 +236,7 @@
         LOGGER.error(diagnostics.describe());
         if (cancellationToken.isCancellationRequested()) {
             LOGGER.error("Daemon was stopped to handle build cancel request.");
-            throw new BuildCancelledException("Build interrupted");
+            throw new BuildCancelledException();
         }
 
         throw new DaemonDisappearedException();
