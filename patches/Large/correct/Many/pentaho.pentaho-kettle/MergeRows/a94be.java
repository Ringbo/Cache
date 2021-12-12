diff --git a/src/be/ibridge/kettle/trans/step/mergerows/MergeRows.java b/src/be/ibridge/kettle/trans/step/mergerows/MergeRows.java
index 4a1bc4f..82c38c1 100644
--- a/src/be/ibridge/kettle/trans/step/mergerows/MergeRows.java
+++ b/src/be/ibridge/kettle/trans/step/mergerows/MergeRows.java
@@ -149,7 +149,7 @@
                 {
                     data.two.addValue(VALUE_NEW);
                     putRow(data.two);
-                    data.two=getRowFrom(meta.getReferenceStepName());
+                    data.two=getRowFrom(meta.getCompareStepName());
                 }
             }
         }
