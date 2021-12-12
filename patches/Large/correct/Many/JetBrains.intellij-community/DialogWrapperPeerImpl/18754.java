diff --git a/platform-impl/src/com/intellij/openapi/ui/impl/DialogWrapperPeerImpl.java b/platform-impl/src/com/intellij/openapi/ui/impl/DialogWrapperPeerImpl.java
index ff72498..8b36c9c 100644
--- a/platform-impl/src/com/intellij/openapi/ui/impl/DialogWrapperPeerImpl.java
+++ b/platform-impl/src/com/intellij/openapi/ui/impl/DialogWrapperPeerImpl.java
@@ -539,7 +539,7 @@
       addWindowListener(new WindowAdapter() {
         public void windowActivated(final WindowEvent e) {
           final DialogWrapper wrapper = getDialogWrapper();
-          if (wrapper != null) {
+          if (wrapper != null && myFocusTrackback != null) {
             myFocusTrackback.registerFocusComponent(new FocusTrackback.ComponentQuery() {
               public Component getComponent() {
                 return wrapper.getPreferredFocusedComponent();
