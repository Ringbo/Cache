diff --git a/src/edu/stanford/nlp/parser/dvparser/AverageDVModels.java b/src/edu/stanford/nlp/parser/dvparser/AverageDVModels.java
index 385f665..e02b0a0 100644
--- a/src/edu/stanford/nlp/parser/dvparser/AverageDVModels.java
+++ b/src/edu/stanford/nlp/parser/dvparser/AverageDVModels.java
@@ -46,7 +46,7 @@
   }
 
   public static TwoDimensionalMap<String, String, SimpleMatrix> averageBinaryMatrices(List<TwoDimensionalMap<String, String, SimpleMatrix>> maps) {
-    TwoDimensionalMap<String, String, SimpleMatrix> averages = new TwoDimensionalMap<String, String, SimpleMatrix>();
+    TwoDimensionalMap<String, String, SimpleMatrix> averages = TwoDimensionalMap.treeMap();
     for (Pair<String, String> binary : getBinaryMatrixNames(maps)) {
       int count = 0;
       SimpleMatrix matrix = null;
@@ -69,7 +69,7 @@
   }
 
   public static Map<String, SimpleMatrix> averageUnaryMatrices(List<Map<String, SimpleMatrix>> maps) {
-    Map<String, SimpleMatrix> averages = Generics.newHashMap();
+    Map<String, SimpleMatrix> averages = Generics.newTreeMap();
     for (String name : getUnaryMatrixNames(maps)) {
       int count = 0;
       SimpleMatrix matrix = null;
