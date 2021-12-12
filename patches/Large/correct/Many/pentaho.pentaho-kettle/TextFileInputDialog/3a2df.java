diff --git a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
index a5a67dc..6757854 100644
--- a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
@@ -1728,8 +1728,7 @@
         wErrorSComp.setMinWidth(bounds.width);
         wErrorSComp.setMinHeight(bounds.height);
 
-        
-        wErrorTab.setControl(wErrorComp);
+        wErrorTab.setControl(wErrorSComp);
 
 
         /////////////////////////////////////////////////////////////
