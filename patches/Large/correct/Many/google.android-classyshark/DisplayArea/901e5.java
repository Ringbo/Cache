diff --git a/ClassySharkWS/src/com/google/classyshark/ui/panel/displayarea/DisplayArea.java b/ClassySharkWS/src/com/google/classyshark/ui/panel/displayarea/DisplayArea.java
index dc2fbaf..fdc02e4 100644
--- a/ClassySharkWS/src/com/google/classyshark/ui/panel/displayarea/DisplayArea.java
+++ b/ClassySharkWS/src/com/google/classyshark/ui/panel/displayarea/DisplayArea.java
@@ -324,7 +324,7 @@
 
         try {
             StyleConstants.setForeground(style, ColorScheme.FOREGROUND_YELLOW);
-            StyleConstants.setFontSize(style, 16);
+            StyleConstants.setFontSize(style, 13);
             StyleConstants.setFontFamily(style, "Menlo");
 
             doc.insertString(doc.getLength(), SharkBG.SHARKEY, style);
