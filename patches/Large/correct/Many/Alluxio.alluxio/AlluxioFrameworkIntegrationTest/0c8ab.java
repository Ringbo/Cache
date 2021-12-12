diff --git a/examples/src/main/java/alluxio/cli/AlluxioFrameworkIntegrationTest.java b/examples/src/main/java/alluxio/cli/AlluxioFrameworkIntegrationTest.java
index db32d70..24572f2 100644
--- a/examples/src/main/java/alluxio/cli/AlluxioFrameworkIntegrationTest.java
+++ b/examples/src/main/java/alluxio/cli/AlluxioFrameworkIntegrationTest.java
@@ -127,7 +127,7 @@
   private void startAlluxioFramework(Map<String, String> extraEnv) {
     String startScript = PathUtils.concatPath(Configuration.get(PropertyKey.HOME),
         "integration", "bin", "alluxio-mesos.sh");
-    ProcessBuilder pb = new ProcessBuilder(startScript, mMesosAddress, "-w");
+    ProcessBuilder pb = new ProcessBuilder(startScript, mMesosAddress);
     Map<String, String> env = pb.environment();
     env.putAll(extraEnv);
     try {
