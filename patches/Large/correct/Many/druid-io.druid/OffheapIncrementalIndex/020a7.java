diff --git a/processing/src/main/java/io/druid/segment/incremental/OffheapIncrementalIndex.java b/processing/src/main/java/io/druid/segment/incremental/OffheapIncrementalIndex.java
index dffdd2d..a7c850b 100644
--- a/processing/src/main/java/io/druid/segment/incremental/OffheapIncrementalIndex.java
+++ b/processing/src/main/java/io/druid/segment/incremental/OffheapIncrementalIndex.java
@@ -187,7 +187,7 @@
     synchronized (this) {
       if (!facts.containsKey(key)) {
         if (!canAppendRow(false)) {
-          throw new IndexSizeExceededException(getOutOfRowsReason());
+          throw new IndexSizeExceededException("%s", getOutOfRowsReason());
         }
       }
       rowOffset = totalAggSize * numEntries.get();
