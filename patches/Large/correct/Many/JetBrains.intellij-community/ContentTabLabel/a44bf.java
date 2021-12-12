diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ContentTabLabel.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ContentTabLabel.java
index cf6d400..18a2634 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ContentTabLabel.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ContentTabLabel.java
@@ -182,7 +182,7 @@
     else {
       if (additionalIcon.stream().anyMatch(icon -> icon.getAvailable())) {
         setHorizontalAlignment(SwingConstants.LEFT);
-        setBorder(JBUI.Borders.empty(0, 12, 0, 7));
+        setBorder(JBUI.Borders.empty(0, 12, 0, 3));
       }
       else {
         setHorizontalAlignment(SwingConstants.CENTER);
