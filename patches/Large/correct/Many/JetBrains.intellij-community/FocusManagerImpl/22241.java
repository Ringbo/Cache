diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/FocusManagerImpl.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/FocusManagerImpl.java
index 0d1ec1c..edee5c2 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/FocusManagerImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/FocusManagerImpl.java
@@ -341,7 +341,7 @@
   }
 
   public void doWhenFocusSettlesDown(@NotNull final Runnable runnable) {
-    UIUtil.invokeAndWaitIfNeeded(new Runnable() {
+    UIUtil.invokeLaterIfNeeded(new Runnable() {
       @Override
       public void run() {
         if (myRunContext != null) {
