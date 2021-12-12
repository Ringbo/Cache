diff --git a/platform-impl/src/com/intellij/openapi/ui/impl/DialogWrapperPeerImpl.java b/platform-impl/src/com/intellij/openapi/ui/impl/DialogWrapperPeerImpl.java
index bdaec61..1305994 100644
--- a/platform-impl/src/com/intellij/openapi/ui/impl/DialogWrapperPeerImpl.java
+++ b/platform-impl/src/com/intellij/openapi/ui/impl/DialogWrapperPeerImpl.java
@@ -546,7 +546,7 @@
 
     private void disposeFocusTrackbackIfNoChildWindowFocused(@Nullable IdeFocusManager focusManager) {
       final DialogWrapper wrapper = myDialogWrapper.get();
-      if (wrapper == null) {
+      if (wrapper == null || !wrapper.isShowing()) {
         myFocusTrackback.dispose();
         return;
       }
