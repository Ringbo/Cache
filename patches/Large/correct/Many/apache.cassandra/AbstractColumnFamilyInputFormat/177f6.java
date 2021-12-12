diff --git a/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java b/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java
index d687183..148c08a 100644
--- a/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java
+++ b/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java
@@ -215,7 +215,7 @@
                                     partitioner.preservesOrder() ?
                                             subrange.getStart().toString().substring(2) : subrange.getStart().toString(),
                                     partitioner.preservesOrder() ?
-                                            subrange.getEnd().toString().substring(2) : subrange.getStart().toString(),
+                                            subrange.getEnd().toString().substring(2) : subrange.getEnd().toString(),
                                     subSplits.get(subSplit),
                                     endpoints);
 
