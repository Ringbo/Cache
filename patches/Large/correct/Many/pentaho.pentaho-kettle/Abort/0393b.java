diff --git a/src/org/pentaho/di/trans/steps/abort/Abort.java b/src/org/pentaho/di/trans/steps/abort/Abort.java
index a471c28..af1493d 100644
--- a/src/org/pentaho/di/trans/steps/abort/Abort.java
+++ b/src/org/pentaho/di/trans/steps/abort/Abort.java
@@ -83,12 +83,12 @@
         	   //
         	   // Here we abort!!
         	   //
-        	   logMinimal(BaseMessages.getString(PKG, "Abort.Log.Wrote.AbortRow", Long.toString(nrInputRows), getInputRowMeta().getString(r)) );
+        	   logError(BaseMessages.getString(PKG, "Abort.Log.Wrote.AbortRow", Long.toString(nrInputRows), getInputRowMeta().getString(r)) );
         		
         	   String message = environmentSubstitute(meta.getMessage());
         	   if ( message == null || message.length() == 0 )
         	   {
-        		   logMinimal(BaseMessages.getString(PKG, "Abort.Log.DefaultAbortMessage", "" + nrInputRows));
+        		   logError(BaseMessages.getString(PKG, "Abort.Log.DefaultAbortMessage", "" + nrInputRows));
         	   }
         	   else
         	   {
