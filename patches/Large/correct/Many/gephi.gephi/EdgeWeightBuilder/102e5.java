diff --git a/FiltersPlugin/src/org/gephi/filters/plugin/edge/EdgeWeightBuilder.java b/FiltersPlugin/src/org/gephi/filters/plugin/edge/EdgeWeightBuilder.java
index 1259668..00711e7 100644
--- a/FiltersPlugin/src/org/gephi/filters/plugin/edge/EdgeWeightBuilder.java
+++ b/FiltersPlugin/src/org/gephi/filters/plugin/edge/EdgeWeightBuilder.java
@@ -122,7 +122,7 @@
                 refreshRange();
                 return weights;
             } else {
-                return values.toArray(new Integer[0]);
+                return values.toArray(new Float[0]);
             }
         }
 
