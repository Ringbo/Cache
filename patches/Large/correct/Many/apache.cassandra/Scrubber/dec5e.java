diff --git a/src/java/org/apache/cassandra/db/compaction/Scrubber.java b/src/java/org/apache/cassandra/db/compaction/Scrubber.java
index faf7e60..b014d0b 100644
--- a/src/java/org/apache/cassandra/db/compaction/Scrubber.java
+++ b/src/java/org/apache/cassandra/db/compaction/Scrubber.java
@@ -177,7 +177,7 @@
                     }
                     else
                     {
-                        if (prevRow != null && acrComparator.compare(prevRow, compactedRow) > 0)
+                        if (prevRow != null && acrComparator.compare(prevRow, compactedRow) >= 0)
                         {
                             outOfOrderRows.add(compactedRow);
                             outputHandler.warn(String.format("Out of order row detected (%s found after %s)", compactedRow.key, prevRow.key));
