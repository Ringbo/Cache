diff --git a/app/PdeEditorConsole.java b/app/PdeEditorConsole.java
index 910be29..b9f2d20 100644
--- a/app/PdeEditorConsole.java
+++ b/app/PdeEditorConsole.java
@@ -93,7 +93,7 @@
     Color fgColorOut = PdeBase.getColor("editor.console.fgcolor.output", 
                                         new Color(0xcc, 0xcc, 0xbb));
     Color fgColorErr = PdeBase.getColor("editor.console.fgcolor.error", 
-                                        new Color(0xff, 0xcc, 0x00));
+                                        new Color(0xff, 0x30, 0x00));
     Font font = PdeBase.getFont("editor.console.font", 
                                 new Font("Monospaced", Font.PLAIN, 11));
 
