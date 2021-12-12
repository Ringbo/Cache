diff --git a/src/java/org/apache/cassandra/utils/IntervalTree.java b/src/java/org/apache/cassandra/utils/IntervalTree.java
index 7ccc75f..ec8e166 100644
--- a/src/java/org/apache/cassandra/utils/IntervalTree.java
+++ b/src/java/org/apache/cassandra/utils/IntervalTree.java
@@ -251,7 +251,7 @@
                     allEndpoints.add(interval.min);
                     allEndpoints.add(interval.max);
                 }
-                if (comparator == null)
+                if (comparator != null)
                     Collections.sort(allEndpoints, comparator);
                 else
                     Collections.sort((List<Comparable>)allEndpoints);
