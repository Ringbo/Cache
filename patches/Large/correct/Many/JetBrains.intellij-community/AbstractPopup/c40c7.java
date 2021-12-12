diff --git a/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java b/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
index 2cd3d10..2bea127 100644
--- a/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
+++ b/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
@@ -958,7 +958,7 @@
       if (visible) {
         myPopup.show();
         final JWindow window = getPopupWindow();
-        if (window != null) {
+        if (window != null && myRestoreWindowSize != null) {
           window.setSize(myRestoreWindowSize);
           myRestoreWindowSize = null;
         }
