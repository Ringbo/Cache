diff --git a/platform/util/src/com/intellij/util/ui/UIUtil.java b/platform/util/src/com/intellij/util/ui/UIUtil.java
index 276fc87..d4b112d 100644
--- a/platform/util/src/com/intellij/util/ui/UIUtil.java
+++ b/platform/util/src/com/intellij/util/ui/UIUtil.java
@@ -2536,7 +2536,7 @@
   }
   //Escape error-prone HTML data (if any) when we use it in renderers, see IDEA-170768
   public static Object htmlInjectionGuard(Object toRender) {
-    if (toRender instanceof String && ((String)toRender).toLowerCase().startsWith("<html>")) {
+    if (toRender instanceof String && ((String)toRender).toLowerCase(Locale.US).startsWith("<html>")) {
       toRender = "<html>" + StringUtil.escapeXml((String)toRender);
     }
     return toRender;
