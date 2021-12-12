diff --git a/h2o-core/src/main/java/hex/Model.java b/h2o-core/src/main/java/hex/Model.java
index b850b92..79a039c 100755
--- a/h2o-core/src/main/java/hex/Model.java
+++ b/h2o-core/src/main/java/hex/Model.java
@@ -365,7 +365,7 @@
     return mm;
   }
 
-  static void incrementModelMetrics(Output out, Key k) {
+  synchronized static void incrementModelMetrics(Output out, Key k) {
     for (Key key : out._model_metrics)
       if (k.equals(key)) return;
     out._model_metrics = Arrays.copyOf(out._model_metrics, out._model_metrics.length + 1);
