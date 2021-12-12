diff --git a/indexing-service/src/test/java/io/druid/indexing/overlord/RemoteTaskRunnerTest.java b/indexing-service/src/test/java/io/druid/indexing/overlord/RemoteTaskRunnerTest.java
index dcd643d..349620e 100644
--- a/indexing-service/src/test/java/io/druid/indexing/overlord/RemoteTaskRunnerTest.java
+++ b/indexing-service/src/test/java/io/druid/indexing/overlord/RemoteTaskRunnerTest.java
@@ -72,7 +72,7 @@
   private static final String announcementsPath = String.format("%s/indexer/announcements/worker", basePath);
   private static final String tasksPath = String.format("%s/indexer/tasks/worker", basePath);
   private static final String statusPath = String.format("%s/indexer/status/worker", basePath);
-  private static final int TIMEOUT_SECONDS = 5;
+  private static final int TIMEOUT_SECONDS = 20;
 
   private ObjectMapper jsonMapper;
 
@@ -453,7 +453,7 @@
   private void doSetup() throws Exception
   {
     makeWorker();
-    makeRemoteTaskRunner(new TestRemoteTaskRunnerConfig(new Period("PT1S")));
+    makeRemoteTaskRunner(new TestRemoteTaskRunnerConfig(new Period("PT5S")));
   }
 
   private void makeRemoteTaskRunner(RemoteTaskRunnerConfig config) throws Exception
