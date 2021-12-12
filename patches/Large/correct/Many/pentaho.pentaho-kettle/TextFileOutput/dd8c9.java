diff --git a/src/org/pentaho/di/trans/steps/textfileoutput/TextFileOutput.java b/src/org/pentaho/di/trans/steps/textfileoutput/TextFileOutput.java
index d86a469..73ad1d9 100644
--- a/src/org/pentaho/di/trans/steps/textfileoutput/TextFileOutput.java
+++ b/src/org/pentaho/di/trans/steps/textfileoutput/TextFileOutput.java
@@ -310,7 +310,7 @@
                     throw new KettleValueException("Unable to convert String to Binary with specified string encoding ["+v.getStringEncoding()+"]", e);
                 }
             }
-        	if( length > string.length() ) 
+        	if( length > string.length() && meta.isPadded()) 
         	{
         		// we need to pad this
         		
