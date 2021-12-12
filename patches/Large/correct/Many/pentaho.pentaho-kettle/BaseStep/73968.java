diff --git a/src/be/ibridge/kettle/trans/step/BaseStep.java b/src/be/ibridge/kettle/trans/step/BaseStep.java
index 9371b39..a9eb233 100644
--- a/src/be/ibridge/kettle/trans/step/BaseStep.java
+++ b/src/be/ibridge/kettle/trans/step/BaseStep.java
@@ -1214,7 +1214,7 @@
         // First check the number of fields
         if (referenceRow.size() != row.size())
         {
-            throw new KettleRowException(Messages.getString("BaseStep.SafeMode.Exception.Varying", Const.CR, ""+referenceRow.size(), ""+row.size(), row.toString()));
+            throw new KettleRowException(Messages.getString("BaseStep.SafeMode.Exception.VaryingSize", ""+referenceRow.size(), ""+row.size(), row.toString()));
         }
         else
         {
@@ -1226,12 +1226,12 @@
 
                 if (!referenceValue.getName().equalsIgnoreCase(compareValue.getName()))
                 {
-                    throw new KettleRowException(Messages.getString("BaseStep.SafeMode.Exception.MixingLayout", ""+(i+1), Const.CR, referenceValue.getName()+" "+referenceValue.toStringMeta(), compareValue.getName()+" " +compareValue.toStringMeta()));
+                    throw new KettleRowException(Messages.getString("BaseStep.SafeMode.Exception.MixingLayout", ""+(i+1), referenceValue.getName()+" "+referenceValue.toStringMeta(), compareValue.getName()+" "+compareValue.toStringMeta()));
                 }
 
                 if (referenceValue.getType()!=compareValue.getType())
                 {
-                    throw new KettleRowException(Messages.getString("BaseStep.SafeMode.Exception.MixingTypes", ""+(i+1), Const.CR, referenceValue.getName()+" "+referenceValue.toStringMeta(), compareValue.getName()+" " +compareValue.toStringMeta()));               
+                    throw new KettleRowException(Messages.getString("BaseStep.SafeMode.Exception.MixingTypes", ""+(i+1), referenceValue.getName()+" "+referenceValue.toStringMeta(), compareValue.getName()+" "+compareValue.toStringMeta()));               
                 }
             }
         }
