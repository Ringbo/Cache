diff --git a/controller/src/main/java/org/apache/ambari/controller/HeartbeatHandler.java b/controller/src/main/java/org/apache/ambari/controller/HeartbeatHandler.java
index 46e4137..d038f4a 100644
--- a/controller/src/main/java/org/apache/ambari/controller/HeartbeatHandler.java
+++ b/controller/src/main/java/org/apache/ambari/controller/HeartbeatHandler.java
@@ -100,11 +100,13 @@
           .getStateMachineClusterInstance(desiredClusterId);
       
       //get the list of uninstall actions
-      //create a map from component/role to 'started' for easy lookup later
+      //also, create a map from component/role to 'started' & 'installed' 
+      //for easy lookup later
       allActions = 
           inspectAgentState(heartbeat, cluster, componentStates, clusterFsm);
 
-      checkActionResults(cluster, clusterFsm, heartbeat, allActions);
+      //check/create the special actions (like safemode check)
+      checkAndCreateActions(cluster, clusterFsm, heartbeat, allActions);
       
       //Install software for roles like gateways (note that client role 
       //start/stops are not tracked through FSM).
@@ -246,12 +248,9 @@
     return id;
   }
   
-  private void checkActionResults(Cluster cluster,
+  private void checkAndCreateActions(Cluster cluster,
       ClusterFSM clusterFsm, HeartBeat heartbeat, List<Action> allActions)
           throws IOException {
-    //this method should check things like number of retries (based on 
-    //action-IDs) etc. this method should note issues like too many failures 
-    //starting a role, etc.
     for (ServiceFSM service : clusterFsm.getServices()) {
       //see whether the service is in the STARTED state, and if so,
       //check whether there is any action-result that indicates success
@@ -307,7 +306,7 @@
         for (String service : services) {
           ComponentPlugin plugin = 
               cluster.getComponentDefinition(service);
-          if (components.isInstalled(service, "CLIENT")) {
+          if (!components.isInstalled(service, "CLIENT")) {
             Action action = plugin.install(cluster.getName(), "CLIENT"); //TODO:this needs to be resolved
             addAction(action,actions);
             action = plugin.configure(cluster.getName(), "CLIENT"); //TODO:this needs to be resolved
