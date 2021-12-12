diff --git a/core/client/fs/src/test/java/alluxio/client/file/policy/LocalFirstAvoidEvictionPolicyTest.java b/core/client/fs/src/test/java/alluxio/client/file/policy/LocalFirstAvoidEvictionPolicyTest.java
index 9bb1562..b10143e 100644
--- a/core/client/fs/src/test/java/alluxio/client/file/policy/LocalFirstAvoidEvictionPolicyTest.java
+++ b/core/client/fs/src/test/java/alluxio/client/file/policy/LocalFirstAvoidEvictionPolicyTest.java
@@ -34,7 +34,7 @@
 public class LocalFirstAvoidEvictionPolicyTest {
 
   @Test
-  public void chooseClosestTierAvoidEviction() {
+  public void chooseClosestTierAvoidEviction() throws Exception {
     List<BlockWorkerInfo> workers = new ArrayList<>();
     workers.add(worker(Constants.GB, Constants.MB, "node2", "rack3"));
     workers.add(worker(Constants.GB, 0, "node3", "rack2"));
