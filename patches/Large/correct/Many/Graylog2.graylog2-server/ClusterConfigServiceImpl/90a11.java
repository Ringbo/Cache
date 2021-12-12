diff --git a/graylog2-server/src/main/java/org/graylog2/cluster/ClusterConfigServiceImpl.java b/graylog2-server/src/main/java/org/graylog2/cluster/ClusterConfigServiceImpl.java
index feb2a7d..7b3bd69 100644
--- a/graylog2-server/src/main/java/org/graylog2/cluster/ClusterConfigServiceImpl.java
+++ b/graylog2-server/src/main/java/org/graylog2/cluster/ClusterConfigServiceImpl.java
@@ -93,7 +93,7 @@
         try {
             return objectMapper.convertValue(payload, type);
         } catch (IllegalArgumentException e) {
-            LOG.debug("Error while deserializing payload", e);
+            LOG.error("Error while deserializing payload", e);
             return null;
         }
     }
