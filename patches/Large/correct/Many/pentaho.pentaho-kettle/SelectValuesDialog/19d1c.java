diff --git a/src-ui/org/pentaho/di/ui/trans/steps/selectvalues/SelectValuesDialog.java b/src-ui/org/pentaho/di/ui/trans/steps/selectvalues/SelectValuesDialog.java
index db1729c..7130196 100644
--- a/src-ui/org/pentaho/di/ui/trans/steps/selectvalues/SelectValuesDialog.java
+++ b/src-ui/org/pentaho/di/ui/trans/steps/selectvalues/SelectValuesDialog.java
@@ -667,7 +667,7 @@
 
 		for (int i=0;i<nrmeta;i++)
 		{
-			SelectMetadataChange change = new SelectMetadataChange();
+			SelectMetadataChange change = new SelectMetadataChange(input);
 			input.getMeta()[i] = change;
 			
 			TableItem item = wMeta.getNonEmpty(i);
