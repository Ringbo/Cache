diff --git a/h2o-automl/src/main/java/ai/h2o/automl/AutoML.java b/h2o-automl/src/main/java/ai/h2o/automl/AutoML.java
index e3c8631..8616ff7 100644
--- a/h2o-automl/src/main/java/ai/h2o/automl/AutoML.java
+++ b/h2o-automl/src/main/java/ai/h2o/automl/AutoML.java
@@ -93,7 +93,7 @@
     void remove(Algo algo) {
       List<Work> filtered = new ArrayList<>(allocations.length);
       for (Work alloc : allocations) {
-        if (algo.equals(alloc.algo)) {
+        if (!algo.equals(alloc.algo)) {
           filtered.add(alloc);
         }
       }
