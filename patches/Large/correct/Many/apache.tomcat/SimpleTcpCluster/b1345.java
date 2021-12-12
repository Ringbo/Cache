diff --git a/java/org/apache/catalina/ha/tcp/SimpleTcpCluster.java b/java/org/apache/catalina/ha/tcp/SimpleTcpCluster.java
index 04f139d..6a68259 100644
--- a/java/org/apache/catalina/ha/tcp/SimpleTcpCluster.java
+++ b/java/org/apache/catalina/ha/tcp/SimpleTcpCluster.java
@@ -553,7 +553,7 @@
     }
 
     protected void checkDefaults() {
-        if ( clusterListeners.size() == 0 ) {
+        if ( clusterListeners.size() == 0 && managerTemplate instanceof DeltaManager ) {
             addClusterListener(new ClusterSessionListener());
         }
         if ( valves.size() == 0 ) {
