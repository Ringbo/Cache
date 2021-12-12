diff --git a/FiltersPlugin/src/org/gephi/filters/plugin/attribute/AttributeEqualBuilder.java b/FiltersPlugin/src/org/gephi/filters/plugin/attribute/AttributeEqualBuilder.java
index 6959489..46ed8d7 100644
--- a/FiltersPlugin/src/org/gephi/filters/plugin/attribute/AttributeEqualBuilder.java
+++ b/FiltersPlugin/src/org/gephi/filters/plugin/attribute/AttributeEqualBuilder.java
@@ -281,7 +281,7 @@
             }
             Object[] valuesArray = vals.toArray();
             min = AttributeUtils.getDefault().getMin(column, valuesArray);
-            max = AttributeUtils.getDefault().getMin(column, valuesArray);
+            max = AttributeUtils.getDefault().getMax(column, valuesArray);
         }
 
         public String getName() {
