diff --git a/minicluster/src/main/java/alluxio/multi/process/MultiProcessCluster.java b/minicluster/src/main/java/alluxio/multi/process/MultiProcessCluster.java
index 21b0b59..4ab50b0 100644
--- a/minicluster/src/main/java/alluxio/multi/process/MultiProcessCluster.java
+++ b/minicluster/src/main/java/alluxio/multi/process/MultiProcessCluster.java
@@ -299,21 +299,21 @@
   /**
    * @return return the list of master addresses
    */
-  public List<MasterNetAddress> getMasterAddresses() {
+  public synchronized List<MasterNetAddress> getMasterAddresses() {
     return mMasterAddresses;
   }
 
   /**
    * Stops the Zookeeper cluster.
    */
-  public void stopZk() throws IOException {
+  public synchronized void stopZk() throws IOException {
     mCuratorServer.stop();
   }
 
   /**
    * Restarts the Zookeeper cluster.
    */
-  public void restartZk() throws Exception {
+  public synchronized void restartZk() throws Exception {
     Preconditions.checkNotNull(mCuratorServer, "mCuratorServer");
     mCuratorServer.restart();
   }
