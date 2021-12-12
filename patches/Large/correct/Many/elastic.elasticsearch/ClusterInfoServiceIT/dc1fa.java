diff --git a/core/src/test/java/org/elasticsearch/cluster/ClusterInfoServiceIT.java b/core/src/test/java/org/elasticsearch/cluster/ClusterInfoServiceIT.java
index 017d261..6368e5a 100644
--- a/core/src/test/java/org/elasticsearch/cluster/ClusterInfoServiceIT.java
+++ b/core/src/test/java/org/elasticsearch/cluster/ClusterInfoServiceIT.java
@@ -146,7 +146,7 @@
         return Settings.builder()
                 // manual collection or upon cluster forming.
                 .put(InternalClusterInfoService.INTERNAL_CLUSTER_INFO_TIMEOUT, "1s")
-                .putArray("plugin.types", Plugin.class.getName(), MockTransportService.TestPlugin.class.getName())
+                .putArray("plugin.types", TestPlugin.class.getName(), MockTransportService.TestPlugin.class.getName())
                 .build();
     }
 
