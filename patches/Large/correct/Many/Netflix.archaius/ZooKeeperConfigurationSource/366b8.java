diff --git a/archaius-zookeeper/src/main/java/com/netflix/config/source/ZooKeeperConfigurationSource.java b/archaius-zookeeper/src/main/java/com/netflix/config/source/ZooKeeperConfigurationSource.java
index 7009724..b004120 100644
--- a/archaius-zookeeper/src/main/java/com/netflix/config/source/ZooKeeperConfigurationSource.java
+++ b/archaius-zookeeper/src/main/java/com/netflix/config/source/ZooKeeperConfigurationSource.java
@@ -227,7 +227,7 @@
         try {
             Closeables.close(pathChildrenCache, true);
         } catch (IOException exc) {
-            logger.warn("IOException should not have been thrown.", exc);
+            logger.error("IOException should not have been thrown.", exc);
         }
     }
 }
