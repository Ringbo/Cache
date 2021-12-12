diff --git a/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheReplicationOperation.java b/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheReplicationOperation.java
index 4fa28f8..7c336d7 100644
--- a/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheReplicationOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheReplicationOperation.java
@@ -99,7 +99,7 @@
                 Data key = next.getKey();
                 CacheRecord record = next.getValue();
                 iter.remove();
-                cache.setRecord(key, record);
+                cache.putRecord(key, record);
             }
         }
         data.clear();
