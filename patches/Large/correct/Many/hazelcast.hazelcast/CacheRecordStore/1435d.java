diff --git a/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheRecordStore.java b/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheRecordStore.java
index f3ece18..3c2b618 100644
--- a/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheRecordStore.java
+++ b/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheRecordStore.java
@@ -188,7 +188,7 @@
         if (isStatisticsEnabled()) {
             if (isPutSucceed) {
                 statistics.increaseCachePuts(1);
-                statistics.addPutTimeNano(System.nanoTime() - start);
+                statistics.addPutTimeNanos(System.nanoTime() - start);
             }
             if (getValue) {
                 if (oldValueNull) {
@@ -196,7 +196,7 @@
                 } else {
                     statistics.increaseCacheHits(1);
                 }
-                statistics.addGetTimeNano(System.nanoTime() - start);
+                statistics.addGetTimeNanos(System.nanoTime() - start);
             }
         }
     }
@@ -230,7 +230,7 @@
         }
         if (result && isStatisticsEnabled()) {
             statistics.increaseCachePuts(1);
-            statistics.addPutTimeNano(System.nanoTime() - start);
+            statistics.addPutTimeNanos(System.nanoTime() - start);
         }
         return result;
     }
@@ -252,11 +252,11 @@
             deleteRecord(key);
         }
         if (isStatisticsEnabled()) {
-            statistics.addGetTimeNano(System.nanoTime() - start);
+            statistics.addGetTimeNanos(System.nanoTime() - start);
             if (result != null) {
                 statistics.increaseCacheHits(1);
                 statistics.increaseCacheRemovals(1);
-                statistics.addRemoveTimeNano(System.nanoTime() - start);
+                statistics.addRemoveTimeNanos(System.nanoTime() - start);
             } else {
                 statistics.increaseCacheMisses(1);
             }
@@ -281,7 +281,7 @@
         }
         if (result && isStatisticsEnabled()) {
             statistics.increaseCacheRemovals(1);
-            statistics.addRemoveTimeNano(System.nanoTime() - start);
+            statistics.addRemoveTimeNanos(System.nanoTime() - start);
         }
         return result;
     }
@@ -315,7 +315,7 @@
         }
         if (result && isStatisticsEnabled()) {
             statistics.increaseCacheRemovals(1);
-            statistics.addRemoveTimeNano(System.nanoTime() - start);
+            statistics.addRemoveTimeNanos(System.nanoTime() - start);
             if (hitCount == 1) {
                 statistics.increaseCacheHits(hitCount);
             } else {
@@ -357,11 +357,11 @@
             result = updateRecordWithExpiry(key, value, record, localExpiryPolicy, now, false);
         }
         if (isStatisticsEnabled()) {
-            statistics.addGetTimeNano(System.nanoTime() - start);
+            statistics.addGetTimeNanos(System.nanoTime() - start);
             if (result) {
                 statistics.increaseCachePuts(1);
                 statistics.increaseCacheHits(1);
-                statistics.addPutTimeNano(System.nanoTime() - start);
+                statistics.addPutTimeNanos(System.nanoTime() - start);
             } else {
                 statistics.increaseCacheMisses(1);
             }
@@ -400,9 +400,9 @@
         if (isStatisticsEnabled()) {
             if (result) {
                 statistics.increaseCachePuts(1);
-                statistics.addPutTimeNano(System.nanoTime() - start);
+                statistics.addPutTimeNanos(System.nanoTime() - start);
             }
-            statistics.addGetTimeNano(System.nanoTime() - start);
+            statistics.addGetTimeNanos(System.nanoTime() - start);
             if (isHit) {
                 statistics.increaseCacheHits(1);
             } else {
@@ -428,11 +428,11 @@
             updateRecordWithExpiry(key, value, record, localExpiryPolicy, now, false);
         }
         if (isStatisticsEnabled()) {
-            statistics.addGetTimeNano(System.nanoTime() - start);
+            statistics.addGetTimeNanos(System.nanoTime() - start);
             if (result != null) {
                 statistics.increaseCacheHits(1);
                 statistics.increaseCachePuts(1);
-                statistics.addPutTimeNano(System.nanoTime() - start);
+                statistics.addPutTimeNanos(System.nanoTime() - start);
             } else {
                 statistics.increaseCacheMisses(1);
             }
@@ -587,7 +587,7 @@
             }
         }
         if (isStatisticsEnabled()) {
-            statistics.addGetTimeNano(System.nanoTime() - start);
+            statistics.addGetTimeNanos(System.nanoTime() - start);
         }
         CacheEntryProcessorEntry entry = new CacheEntryProcessorEntry(key, record, this, now);
         final Object process = entryProcessor.process(entry, arguments);
