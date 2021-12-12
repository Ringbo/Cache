diff --git a/src/java/org/apache/cassandra/db/compaction/Scrubber.java b/src/java/org/apache/cassandra/db/compaction/Scrubber.java
index 314a873..ac8862f 100644
--- a/src/java/org/apache/cassandra/db/compaction/Scrubber.java
+++ b/src/java/org/apache/cassandra/db/compaction/Scrubber.java
@@ -175,7 +175,7 @@
                     }
                     else
                     {
-                        if (prevRow != null && acrComparator.compare(prevRow, compactedRow) > 0)
+                        if (prevRow != null && acrComparator.compare(prevRow, compactedRow) >= 0)
                         {
                             outOfOrderRows.add(compactedRow);
                             outputHandler.warn(String.format("Out of order row detected (%s found after %s)", compactedRow.key, prevRow.key));
