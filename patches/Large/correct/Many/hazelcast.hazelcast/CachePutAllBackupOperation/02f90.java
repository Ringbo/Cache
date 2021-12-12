diff --git a/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CachePutAllBackupOperation.java b/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CachePutAllBackupOperation.java
index 28029f5..1693c76 100644
--- a/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CachePutAllBackupOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CachePutAllBackupOperation.java
@@ -90,7 +90,7 @@
             final CacheWanEventPublisher publisher = service.getCacheWanEventPublisher();
             final CacheEntryView<Data, Data> view = CacheEntryViews.createDefaultEntryView(
                     key, toData(record.getValue()), record);
-            publisher.publishWanReplicationUpdate(name, view);
+            publisher.publishWanReplicationUpdateBackup(name, view);
         }
     }
 
