diff --git a/platform/platform-api/src/com/intellij/openapi/ui/Messages.java b/platform/platform-api/src/com/intellij/openapi/ui/Messages.java
index 35909e5..58f2d11 100644
--- a/platform/platform-api/src/com/intellij/openapi/ui/Messages.java
+++ b/platform/platform-api/src/com/intellij/openapi/ui/Messages.java
@@ -110,7 +110,7 @@
   }
 
   public static int showDialog(Component parent, String message, String title, String[] options, int defaultOptionIndex, Icon icon) {
-    return showDialog(parent, message, title, options, defaultOptionIndex, icon);
+    return showDialog(parent, message, title, options, defaultOptionIndex, defaultOptionIndex, icon);
   }
 
   public static int showDialog(Component parent, String message, String title, String[] options, int defaultOptionIndex, int focusedOptionIndex, Icon icon) {
