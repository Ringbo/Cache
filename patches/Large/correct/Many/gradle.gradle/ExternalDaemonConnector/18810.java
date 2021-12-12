diff --git a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/ExternalDaemonConnector.java b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/ExternalDaemonConnector.java
index 4043cf1..16ed516 100644
--- a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/ExternalDaemonConnector.java
+++ b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/ExternalDaemonConnector.java
@@ -40,11 +40,11 @@
         this(userHomeDir, DaemonIdleTimeout.DEFAULT_IDLE_TIMEOUT, DEFAULT_CONNECT_TIMEOUT);
     }
 
-    ExternalDaemonConnector(File userHomeDir, int idleTimeout) {
+    public ExternalDaemonConnector(File userHomeDir, int idleTimeout) {
         this(userHomeDir, idleTimeout, DEFAULT_CONNECT_TIMEOUT);
     }
 
-    ExternalDaemonConnector(File userHomeDir, int idleTimeout, int connectTimeout) {
+    public ExternalDaemonConnector(File userHomeDir, int idleTimeout, int connectTimeout) {
         super(new PersistentDaemonRegistry(userHomeDir), connectTimeout);
         this.idleTimeout = idleTimeout;
         this.userHomeDir = userHomeDir;
