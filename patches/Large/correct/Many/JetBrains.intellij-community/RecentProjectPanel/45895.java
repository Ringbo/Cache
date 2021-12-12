diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/welcomeScreen/RecentProjectPanel.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/welcomeScreen/RecentProjectPanel.java
index bbeba91..94b5b32 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/welcomeScreen/RecentProjectPanel.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/welcomeScreen/RecentProjectPanel.java
@@ -352,7 +352,7 @@
 
       FontMetrics fm = pathLabel.getFontMetrics(pathLabel.getFont());
       int maxWidth = RecentProjectPanel.this.getWidth() - JBUI.scale(40);
-      if (fm.stringWidth(fullText) > maxWidth) {
+      if (maxWidth > 0 && fm.stringWidth(fullText) > maxWidth) {
         int left = 1; int right = 1;
         int center = fullText.length() / 2;
         String s = fullText.substring(0, center - left) + "..." + fullText.substring(center + right);
