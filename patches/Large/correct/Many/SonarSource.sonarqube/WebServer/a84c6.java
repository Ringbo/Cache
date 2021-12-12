diff --git a/server/sonar-server/src/main/java/org/sonar/server/app/WebServer.java b/server/sonar-server/src/main/java/org/sonar/server/app/WebServer.java
index 4284eac..5565212 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/app/WebServer.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/app/WebServer.java
@@ -59,7 +59,7 @@
   /**
    * Can't be started as is. Needs to be bootstrapped by sonar-application
    */
-  public static void main(String[] args) throws Exception {
+  public static void main(String[] args) {
     ProcessEntryPoint entryPoint = ProcessEntryPoint.createForArguments(args);
     Props props = entryPoint.getProps();
     new WebServerProcessLogging().configure(props);
