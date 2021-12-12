diff --git a/src/java/org/apache/cassandra/locator/YamlFileNetworkTopologySnitch.java b/src/java/org/apache/cassandra/locator/YamlFileNetworkTopologySnitch.java
index 99ab792..3237979 100644
--- a/src/java/org/apache/cassandra/locator/YamlFileNetworkTopologySnitch.java
+++ b/src/java/org/apache/cassandra/locator/YamlFileNetworkTopologySnitch.java
@@ -367,11 +367,11 @@
         if (es == null)
             return;
         final VersionedValue vv = es.getApplicationState(ApplicationState.INTERNAL_IP);
-        if ((vv != null && !vv.value.equals(localNodeData.dcLocalAddress.toString()))
+        if ((vv != null && !vv.value.equals(localNodeData.dcLocalAddress.getHostAddress()))
             || vv == null)
         {
             Gossiper.instance.addLocalApplicationState(ApplicationState.INTERNAL_IP,
-                StorageService.instance.valueFactory.internalIP(localNodeData.dcLocalAddress.toString()));
+                StorageService.instance.valueFactory.internalIP(localNodeData.dcLocalAddress.getHostAddress()));
         }
     }
 
