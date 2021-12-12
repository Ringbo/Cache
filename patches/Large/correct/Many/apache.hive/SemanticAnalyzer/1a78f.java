diff --git a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
index 0e7e82b..876c28c 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/parse/SemanticAnalyzer.java
@@ -3081,7 +3081,7 @@
     // them
     for (String destination : dests) {
 
-      getReduceValuesForReduceSinkNoMapAgg(parseInfo, dest, reduceSinkInputRowResolver,
+      getReduceValuesForReduceSinkNoMapAgg(parseInfo, destination, reduceSinkInputRowResolver,
           reduceSinkOutputRowResolver, outputValueColumnNames, reduceValues);
 
       // Need to pass all of the columns used in the where clauses as reduce values
