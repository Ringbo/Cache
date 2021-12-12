diff --git a/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java b/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
index 19b823b..b3537d9 100644
--- a/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
+++ b/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
@@ -917,6 +917,7 @@
         }
       });
     } else {
+      //noinspection SSBasedInspection
       SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
@@ -925,7 +926,7 @@
             return;
           }
 
-          if (ourXWindowIDEA94683FocusBug && isFocused() && !myRequestFocus && prevOwner != null) {
+          if (false && ourXWindowIDEA94683FocusBug && isFocused() && !myRequestFocus && prevOwner != null) {
             IdeFocusManager.getInstance(myProject).requestFocus(prevOwner, false);
           }
 
