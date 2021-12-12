diff --git a/h2o-core/src/main/java/hex/ModelMetrics.java b/h2o-core/src/main/java/hex/ModelMetrics.java
index 0af01bf..0526bf4 100755
--- a/h2o-core/src/main/java/hex/ModelMetrics.java
+++ b/h2o-core/src/main/java/hex/ModelMetrics.java
@@ -121,7 +121,7 @@
     public int compare(Key<Model> key1, Key<Model> key2) {
       double c1 = getMetricFromModel(key1, _sort_by);
       double c2 = getMetricFromModel(key2, _sort_by);
-      return decreasing ? Double.compare(c2, c1) : Double.compare(c2, c1);
+      return decreasing ? Double.compare(c2, c1) : Double.compare(c1, c2);
     }
   }
 
