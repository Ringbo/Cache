diff --git a/src/java/org/apache/cassandra/db/filter/SliceQueryFilter.java b/src/java/org/apache/cassandra/db/filter/SliceQueryFilter.java
index 9d5b705..65925b1 100644
--- a/src/java/org/apache/cassandra/db/filter/SliceQueryFilter.java
+++ b/src/java/org/apache/cassandra/db/filter/SliceQueryFilter.java
@@ -184,7 +184,7 @@
             }
             else if (slice.includes(cmp, newStart))
             {
-                if (!reversed && sliceIncludesStatics(slice, cfm) && !newStart.equals(ByteBufferUtil.EMPTY_BYTE_BUFFER))
+                if (!reversed && sliceIncludesStatics(slice, cfm) && !newStart.isEmpty())
                     newSlices.add(new ColumnSlice(Composites.EMPTY, cfm.comparator.staticPrefix().end()));
 
                 newSlices.add(new ColumnSlice(newStart, slice.finish));
