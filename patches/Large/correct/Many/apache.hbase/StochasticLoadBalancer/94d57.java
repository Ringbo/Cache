diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/master/balancer/StochasticLoadBalancer.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/master/balancer/StochasticLoadBalancer.java
index bc60e8f..9d8c7cb 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/master/balancer/StochasticLoadBalancer.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/master/balancer/StochasticLoadBalancer.java
@@ -185,7 +185,7 @@
   }
 
   @Override
-  public void setClusterStatus(ClusterStatus st) {
+  public synchronized void setClusterStatus(ClusterStatus st) {
     super.setClusterStatus(st);
     updateRegionLoad();
     for(CostFromRegionLoadFunction cost : regionLoadFunctions) {
@@ -194,7 +194,7 @@
   }
 
   @Override
-  public void setMasterServices(MasterServices masterServices) {
+  public synchronized void setMasterServices(MasterServices masterServices) {
     super.setMasterServices(masterServices);
     this.localityCost.setServices(masterServices);
     this.localityCandidateGenerator.setServices(masterServices);
@@ -202,7 +202,7 @@
   }
 
   @Override
-  protected boolean areSomeRegionReplicasColocated(Cluster c) {
+  protected synchronized boolean areSomeRegionReplicasColocated(Cluster c) {
     regionReplicaHostCostFunction.init(c);
     if (regionReplicaHostCostFunction.cost() > 0) return true;
     regionReplicaRackCostFunction.init(c);
@@ -215,7 +215,8 @@
    * should always approach the optimal state given enough steps.
    */
   @Override
-  public List<RegionPlan> balanceCluster(Map<ServerName, List<HRegionInfo>> clusterState) {
+  public synchronized List<RegionPlan> balanceCluster(Map<ServerName,
+    List<HRegionInfo>> clusterState) {
     List<RegionPlan> plans = balanceMasterRegions(clusterState);
     if (plans != null || clusterState == null || clusterState.size() <= 1) {
       return plans;
