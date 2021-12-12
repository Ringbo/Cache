diff --git a/datavec-spark/src/main/java/org/datavec/spark/transform/reduce/MapToPairForReducerFunction.java b/datavec-spark/src/main/java/org/datavec/spark/transform/reduce/MapToPairForReducerFunction.java
index e6ef115..5a65ec8 100644
--- a/datavec-spark/src/main/java/org/datavec/spark/transform/reduce/MapToPairForReducerFunction.java
+++ b/datavec-spark/src/main/java/org/datavec/spark/transform/reduce/MapToPairForReducerFunction.java
@@ -33,7 +33,7 @@
 
     @Override
     public Tuple2<String, List<Writable>> call(List<Writable> writables) throws Exception {
-        List<String> keyColumns = reducer.getKeyColumnsSet();
+        List<String> keyColumns = reducer.getKeyColumns();
         Schema schema = reducer.getInputSchema();
         String key;
         if(keyColumns.size() == 1) key = writables.get(schema.getIndexOfColumn(keyColumns.get(0))).toString();
