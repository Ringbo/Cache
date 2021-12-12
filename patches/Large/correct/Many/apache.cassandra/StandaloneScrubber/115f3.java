diff --git a/src/java/org/apache/cassandra/tools/StandaloneScrubber.java b/src/java/org/apache/cassandra/tools/StandaloneScrubber.java
index 0ac6a80..e3a15b9 100644
--- a/src/java/org/apache/cassandra/tools/StandaloneScrubber.java
+++ b/src/java/org/apache/cassandra/tools/StandaloneScrubber.java
@@ -179,7 +179,7 @@
             {
                 SSTableReader current = iter.next();
 
-                if (previous.last.compareTo(current.first) > 0)
+                if (previous.last.compareTo(current.first) >= 0)
                 {
                     System.err.println(String.format("At level %d, %s [%s, %s] overlaps %s [%s, %s]", i,
                                                      previous, previous.first, previous.last,
