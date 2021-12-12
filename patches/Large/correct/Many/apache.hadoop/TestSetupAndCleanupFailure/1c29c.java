diff --git a/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/TestSetupAndCleanupFailure.java b/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/TestSetupAndCleanupFailure.java
index 07706b1..2c4d999 100644
--- a/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/TestSetupAndCleanupFailure.java
+++ b/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/TestSetupAndCleanupFailure.java
@@ -149,7 +149,7 @@
   private void testSetupAndCleanupKill(MiniMRCluster mr, 
                                        MiniDFSCluster dfs, 
                                        boolean commandLineKill) 
-  throws IOException {
+  throws Exception {
     // launch job with waiting setup/cleanup
     RunningJob job = launchJobWithWaitingSetupAndCleanup(mr);
     
@@ -223,7 +223,7 @@
   // Also Tests the command-line kill for setup/cleanup attempts. 
   // tests the setup/cleanup attempts getting killed if 
   // they were running on a lost tracker
-  public void testWithDFS() throws IOException {
+  public void testWithDFS() throws Exception {
     MiniDFSCluster dfs = null;
     MiniMRCluster mr = null;
     FileSystem fileSys = null;
