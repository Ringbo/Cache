diff --git a/ui/impl/com/intellij/openapi/wm/impl/WindowManagerImpl.java b/ui/impl/com/intellij/openapi/wm/impl/WindowManagerImpl.java
index 57c4dd3..71427b9 100644
--- a/ui/impl/com/intellij/openapi/wm/impl/WindowManagerImpl.java
+++ b/ui/impl/com/intellij/openapi/wm/impl/WindowManagerImpl.java
@@ -238,7 +238,7 @@
 
   public void resetWindow(final Window window) {
     try {
-      if (!isAlphaModeEnabled(window)) return;
+      if (!isAlphaModeSupported()) return;
 
       WindowUtils.setWindowMask(window, (Shape)null);
       setAlphaMode(window, 0f);
