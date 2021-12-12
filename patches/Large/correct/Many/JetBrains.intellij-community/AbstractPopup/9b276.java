diff --git a/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java b/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
index 6a69914..759cbee 100644
--- a/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
+++ b/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
@@ -1048,7 +1048,7 @@
         removeActivity();
         return;
       }
-      if ((myPreferredFocusedComponent instanceof JButton || myPreferredFocusedComponent instanceof JTextField) && myFocusable) {
+      if ((myPreferredFocusedComponent instanceof AbstractButton || myPreferredFocusedComponent instanceof JTextField) && myFocusable) {
         IJSwingUtilities.moveMousePointerOn(myPreferredFocusedComponent);
       }
 
