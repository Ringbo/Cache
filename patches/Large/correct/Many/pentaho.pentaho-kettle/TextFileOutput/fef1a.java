diff --git a/src/org/pentaho/di/trans/steps/textfileoutput/TextFileOutput.java b/src/org/pentaho/di/trans/steps/textfileoutput/TextFileOutput.java
index 392bb28..05b9400 100644
--- a/src/org/pentaho/di/trans/steps/textfileoutput/TextFileOutput.java
+++ b/src/org/pentaho/di/trans/steps/textfileoutput/TextFileOutput.java
@@ -325,7 +325,7 @@
     		{
     			List<Integer> enclosures = null;
     			
-        		if (v.isString() && meta.isEnclosureForced())
+        		if (v.isString() && meta.isEnclosureForced() && !meta.isPadded())
         		{
         			data.writer.write(data.binaryEnclosure);
         			
@@ -356,7 +356,7 @@
         			}
         		}
         		
-        		if (v.isString() && meta.isEnclosureForced())
+        		if (v.isString() && meta.isEnclosureForced() && !meta.isPadded())
         		{
         			data.writer.write(data.binaryEnclosure);
         		}
