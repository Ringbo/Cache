diff --git a/platform/platform-impl/src/com/intellij/ide/actions/Switcher.java b/platform/platform-impl/src/com/intellij/ide/actions/Switcher.java
index ab311c0..dcfa87f 100644
--- a/platform/platform-impl/src/com/intellij/ide/actions/Switcher.java
+++ b/platform/platform-impl/src/com/intellij/ide/actions/Switcher.java
@@ -533,7 +533,7 @@
     }
 
     void navigate() {
-      myPopup.cancel();
+      myPopup.closeOk(null);
       final Object value = getSelectedList().getSelectedValue();
       if (value instanceof ToolWindow) {
         ((ToolWindow)value).activate(null, true, true);
