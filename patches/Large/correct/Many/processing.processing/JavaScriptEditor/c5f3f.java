diff --git a/app/src/processing/mode/javascript/JavaScriptEditor.java b/app/src/processing/mode/javascript/JavaScriptEditor.java
index 17e5a5d..92bb2ae 100644
--- a/app/src/processing/mode/javascript/JavaScriptEditor.java
+++ b/app/src/processing/mode/javascript/JavaScriptEditor.java
@@ -459,13 +459,13 @@
     } else if (immediately) {
       handleSave();
 	  statusEmpty();
-	  startServer( getExportFolder() );
+	  handleStartServer();
     } else {
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {
             handleSave();
 			statusEmpty();
-			startServer( getExportFolder() );
+			handleStartServer();
           }
         });
     }
