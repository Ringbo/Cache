diff --git a/minicluster/src/main/java/alluxio/master/AbstractLocalAlluxioCluster.java b/minicluster/src/main/java/alluxio/master/AbstractLocalAlluxioCluster.java
index 7d3c12c..1380180 100644
--- a/minicluster/src/main/java/alluxio/master/AbstractLocalAlluxioCluster.java
+++ b/minicluster/src/main/java/alluxio/master/AbstractLocalAlluxioCluster.java
@@ -389,7 +389,7 @@
    */
   protected void runWorker() throws IOException, ConnectionFailedException {
     mWorker = new DefaultAlluxioWorker();
-    Whitebox.setInternalState(AlluxioWorker.class, "sAlluxioWorker", mWorker);
+    Whitebox.setInternalState(DefaultAlluxioWorker.class, "sAlluxioWorker", mWorker);
 
     Runnable runWorker = new Runnable() {
       @Override
