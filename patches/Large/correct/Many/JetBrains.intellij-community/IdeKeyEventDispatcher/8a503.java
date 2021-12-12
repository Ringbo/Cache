diff --git a/platform/platform-impl/src/com/intellij/openapi/keymap/impl/IdeKeyEventDispatcher.java b/platform/platform-impl/src/com/intellij/openapi/keymap/impl/IdeKeyEventDispatcher.java
index ed9185a..202999b 100644
--- a/platform/platform-impl/src/com/intellij/openapi/keymap/impl/IdeKeyEventDispatcher.java
+++ b/platform/platform-impl/src/com/intellij/openapi/keymap/impl/IdeKeyEventDispatcher.java
@@ -173,7 +173,7 @@
       return false;
     }
     if (focusOwner instanceof JTextComponent && ((JTextComponent)focusOwner).isEditable()) {
-      if (e.getKeyChar() != KeyEvent.CHAR_UNDEFINED && e.getKeyChar() != KeyEvent.VK_ESCAPE) {
+      if (e.getKeyChar() != KeyEvent.CHAR_UNDEFINED && e.getKeyCode() != KeyEvent.VK_ESCAPE) {
         MacUIUtil.hideCursor();
       }
     }
