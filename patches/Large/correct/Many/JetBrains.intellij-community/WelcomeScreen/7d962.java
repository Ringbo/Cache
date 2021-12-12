diff --git a/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java b/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java
index 78233c8..7dcf0e9 100644
--- a/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java
+++ b/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java
@@ -53,7 +53,7 @@
   private static final int COLUMNS_IN_MAIN = 2;
   private static final int PLUGIN_DSC_MAX_WIDTH = 180;
   private static final int PLUGIN_NAME_MAX_WIDTH = 180;
-  private static final int MAX_TOOLTIP_WIDTH = 300;
+  private static final int MAX_TOOLTIP_WIDTH = 400;
 
   private static final Dimension ACTION_BUTTON_SIZE = new Dimension(78, 78);
   private static final Dimension PLUGIN_LOGO_SIZE = new Dimension(16, 16);
@@ -530,7 +530,7 @@
       int lengthLeft = string.length();
       int rows = maxRows;
       if (rows == 0) {
-        rows = string.length() / maxIdxPerLine + 1;
+        rows = string.length() / maxIdxPerLine + 2;
       }
 
       while (lengthLeft > maxIdxPerLine && rows > 1) {
@@ -553,7 +553,7 @@
         if (prefix.equals("")) break;
       }
       if (suffix.length() > maxIdxPerLine) {
-        suffix = suffix.substring(0, maxIdxPerLine - 2) + "...";
+        suffix = suffix.substring(0, maxIdxPerLine - 3) + "...";
       }
       modifiedString = prefix + suffix;
     }
