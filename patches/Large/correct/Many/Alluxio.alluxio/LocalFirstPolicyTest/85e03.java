diff --git a/core/client/fs/src/test/java/alluxio/client/file/policy/LocalFirstPolicyTest.java b/core/client/fs/src/test/java/alluxio/client/file/policy/LocalFirstPolicyTest.java
index 18db2f3..48d5df4 100644
--- a/core/client/fs/src/test/java/alluxio/client/file/policy/LocalFirstPolicyTest.java
+++ b/core/client/fs/src/test/java/alluxio/client/file/policy/LocalFirstPolicyTest.java
@@ -81,7 +81,7 @@
   }
 
   @Test
-  public void chooseClosestTier() {
+  public void chooseClosestTier() throws Exception {
     List<BlockWorkerInfo> workers = new ArrayList<>();
     workers.add(worker(Constants.GB, "node2", "rack3"));
     workers.add(worker(Constants.GB, "node3", "rack2"));
