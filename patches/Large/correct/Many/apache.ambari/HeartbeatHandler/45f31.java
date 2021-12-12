diff --git a/controller/src/main/java/org/apache/ambari/controller/HeartbeatHandler.java b/controller/src/main/java/org/apache/ambari/controller/HeartbeatHandler.java
index 90ff66b..ce42c94 100644
--- a/controller/src/main/java/org/apache/ambari/controller/HeartbeatHandler.java
+++ b/controller/src/main/java/org/apache/ambari/controller/HeartbeatHandler.java
@@ -95,7 +95,7 @@
       StartedComponentServers componentServers = new StartedComponentServers();
       for (ServerStatus status : roleStatuses) {
         componentServers.roleServerStarted(status.getComponent(), 
-            status.getServerName());
+            status.getRole());
       }
 
       //get the state machine reference to the cluster
