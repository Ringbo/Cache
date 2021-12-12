diff --git a/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java b/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java
index 6a1062d..f6f6cca 100644
--- a/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java
+++ b/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java
@@ -119,7 +119,7 @@
             String sessionTTL = getParam("session-ttl-seconds");
             if (sessionTTL != null) {
                 MapConfig mapConfig = hzConfig.getMapConfig(clusterMapName);
-                mapConfig.setTimeToLiveSeconds(Integer.valueOf(sessionTTL));
+                mapConfig.setTimeToLiveSeconds(Integer.parseInt(sessionTTL));
                 hzConfig.addMapConfig(mapConfig);
             }
         } catch (UnsupportedOperationException ignored) {
