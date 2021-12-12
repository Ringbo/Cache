diff --git a/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java b/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
index 9cb4226..fc5a96d 100644
--- a/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
+++ b/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
@@ -929,7 +929,8 @@
             return;
           }
 
-          if (ourXWindowIDEA94683FocusBug && isFocused() && !myRequestFocus && prevOwner != null) {
+          if (ourXWindowIDEA94683FocusBug && isFocused() && !myRequestFocus && prevOwner != null && 
+              Registry.is("actionSystem.xWindow.remove.focus.from.nonFocusable.popups")) {
             IdeFocusManager.getInstance(myProject).requestFocus(prevOwner, false);
           }
 
