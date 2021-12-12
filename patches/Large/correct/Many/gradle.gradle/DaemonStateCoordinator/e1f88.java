diff --git a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonStateCoordinator.java b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonStateCoordinator.java
index 4937999..cde7db8 100644
--- a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonStateCoordinator.java
+++ b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/DaemonStateCoordinator.java
@@ -135,7 +135,7 @@
     public void stop() {
         lock.lock();
         try {
-            LOGGER.debug("Stop requested. The daemon is running a build: " + isRunning());
+            LOGGER.debug("Stop requested. The daemon is running a build: " + isBusy());
             stopped = true;
             onStop.run();
             condition.signalAll();
