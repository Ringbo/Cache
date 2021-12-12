diff --git a/src/org/pentaho/di/trans/steps/abort/Abort.java b/src/org/pentaho/di/trans/steps/abort/Abort.java
index af1493d..504516c 100644
--- a/src/org/pentaho/di/trans/steps/abort/Abort.java
+++ b/src/org/pentaho/di/trans/steps/abort/Abort.java
@@ -92,7 +92,7 @@
         	   }
         	   else
         	   {
-        		   logMinimal(message);
+        		   logError(message);
         	   }
                setErrors(1);
                stopAll();        	   
