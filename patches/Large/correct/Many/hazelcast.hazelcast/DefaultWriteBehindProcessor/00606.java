diff --git a/hazelcast/src/main/java/com/hazelcast/map/impl/mapstore/writebehind/DefaultWriteBehindProcessor.java b/hazelcast/src/main/java/com/hazelcast/map/impl/mapstore/writebehind/DefaultWriteBehindProcessor.java
index e65552e..3ed843f 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/impl/mapstore/writebehind/DefaultWriteBehindProcessor.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/impl/mapstore/writebehind/DefaultWriteBehindProcessor.java
@@ -64,7 +64,7 @@
         if (writeBatchSize > 1) {
             failMap = doStoreUsingBatchSize(delayedEntries);
         } else {
-            failMap = processInternal((List) delayedEntries);
+            failMap = processInternal(delayedEntries);
         }
         return failMap;
     }
@@ -342,11 +342,11 @@
      * @param sortedDelayedEntries entries to be stored.
      * @return not-stored entries per partition.
      */
-    private Map<Integer, List<DelayedEntry>> doStoreUsingBatchSize(Collection<DelayedEntry> sortedDelayedEntries) {
+    private Map<Integer, List<DelayedEntry>> doStoreUsingBatchSize(List<DelayedEntry> sortedDelayedEntries) {
         final Map<Integer, List<DelayedEntry>> failsPerPartition = new HashMap<Integer, List<DelayedEntry>>();
         int page = 0;
         List<DelayedEntry> delayedEntryList;
-        while ((delayedEntryList = getBatchChunk((List) sortedDelayedEntries, writeBatchSize, page++)) != null) {
+        while ((delayedEntryList = getBatchChunk(sortedDelayedEntries, writeBatchSize, page++)) != null) {
             final Map<Integer, List<DelayedEntry>> fails = processInternal(delayedEntryList);
             final Set<Map.Entry<Integer, List<DelayedEntry>>> entries = fails.entrySet();
             for (Map.Entry<Integer, List<DelayedEntry>> entry : entries) {
