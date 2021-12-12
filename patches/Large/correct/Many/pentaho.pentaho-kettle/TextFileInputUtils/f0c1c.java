diff --git a/engine/src/org/pentaho/di/trans/steps/fileinput/text/TextFileInputUtils.java b/engine/src/org/pentaho/di/trans/steps/fileinput/text/TextFileInputUtils.java
index 2fb31c4..086e8ea 100644
--- a/engine/src/org/pentaho/di/trans/steps/fileinput/text/TextFileInputUtils.java
+++ b/engine/src/org/pentaho/di/trans/steps/fileinput/text/TextFileInputUtils.java
@@ -520,7 +520,7 @@
       throw new KettleException( BaseMessages.getString( PKG, "TextFileInput.Log.Error.ErrorConvertingLineText" ), e );
     }
 
-    if ( passThruFields != null ) {
+    if ( r != null && passThruFields != null ) {
       // Simply add all fields from source files step
       for ( int i = 0; i < nrPassThruFields; i++ ) {
         r[i] = passThruFields[i];
