diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/fetchers/CSVDataFetcher.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/fetchers/CSVDataFetcher.java
index c852f2d..cf4aa61 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/fetchers/CSVDataFetcher.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/fetchers/CSVDataFetcher.java
@@ -114,10 +114,10 @@
 
         List<DataSet> l = new ArrayList<>();
         for(int i = 0; i < rowLabels.size(); i++) {
-            l.add(new DataSet(features.get(i),MatrixUtil.toOutcomeVector(rowLabels.get(i),rowLabels.size())));
+            l.add(new DataSet(features.get(i),MatrixUtil.toOutcomeVector(rowLabels.get(i),labels.size())));
         }
 
-        this.numOutcomes = rowLabels.size();
+        this.numOutcomes = labels.size();
         all = DataSet.merge(l);
 
 
