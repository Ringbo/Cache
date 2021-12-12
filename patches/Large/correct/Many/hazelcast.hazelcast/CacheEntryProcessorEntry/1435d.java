diff --git a/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheEntryProcessorEntry.java b/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheEntryProcessorEntry.java
index 858fe22..4c9f1e2 100644
--- a/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheEntryProcessorEntry.java
+++ b/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheEntryProcessorEntry.java
@@ -148,7 +148,7 @@
                 cacheRecordStore.updateRecordWithExpiry(keyData, value, record, expiryPolicy, now, false);
                 if (isStatisticsEnabled) {
                     statistics.increaseCachePuts(1);
-                    statistics.addGetTimeNano(System.nanoTime() - start);
+                    statistics.addGetTimeNanos(System.nanoTime() - start);
                 }
                 break;
             case REMOVE:
@@ -157,7 +157,7 @@
             case CREATE:
                 if (isStatisticsEnabled) {
                     statistics.increaseCachePuts(1);
-                    statistics.addGetTimeNano(System.nanoTime() - start);
+                    statistics.addGetTimeNanos(System.nanoTime() - start);
                 }
                 cacheRecordStore.createRecordWithExpiry(keyData, value, expiryPolicy, now, false);
                 break;
