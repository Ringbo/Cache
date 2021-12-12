diff --git a/action-system/impl/com/intellij/openapi/keymap/impl/IdeKeyEventDispatcher.java b/action-system/impl/com/intellij/openapi/keymap/impl/IdeKeyEventDispatcher.java
index d9ff5ab..5c359d9 100644
--- a/action-system/impl/com/intellij/openapi/keymap/impl/IdeKeyEventDispatcher.java
+++ b/action-system/impl/com/intellij/openapi/keymap/impl/IdeKeyEventDispatcher.java
@@ -291,7 +291,7 @@
   }
 
   private boolean hasMnemonicInWindow(Component focusOwner, int keyCode) {
-    if (keyCode == KeyEvent.VK_ALT) return false; // Optimization
+    if (keyCode == KeyEvent.VK_ALT || keyCode == 0) return false; // Optimization
     final Container container = getContainer(focusOwner);
     return hasMnemonic(container, keyCode);
   }
