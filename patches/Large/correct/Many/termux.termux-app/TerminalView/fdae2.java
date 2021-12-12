diff --git a/terminal-view/src/main/java/com/termux/view/TerminalView.java b/terminal-view/src/main/java/com/termux/view/TerminalView.java
index feadb25..598e3dd 100644
--- a/terminal-view/src/main/java/com/termux/view/TerminalView.java
+++ b/terminal-view/src/main/java/com/termux/view/TerminalView.java
@@ -600,7 +600,7 @@
         if (controlDownFromEvent) keyMod |= KeyHandler.KEYMOD_CTRL;
         if (event.isAltPressed()) keyMod |= KeyHandler.KEYMOD_ALT;
         if (event.isShiftPressed()) keyMod |= KeyHandler.KEYMOD_SHIFT;
-        if (handleKeyCode(keyCode, keyMod)) {
+        if (!event.isFunctionPressed() && handleKeyCode(keyCode, keyMod)) {
             if (LOG_KEY_EVENTS) Log.i(EmulatorDebug.LOG_TAG, "handleKeyCode() took key event");
             return true;
         }
@@ -619,7 +619,7 @@
         if (LOG_KEY_EVENTS)
             Log.i(EmulatorDebug.LOG_TAG, "KeyEvent#getUnicodeChar(" + effectiveMetaState + ") returned: " + result);
         if (result == 0) {
-            return true;
+            return false;
         }
 
         int oldCombiningAccent = mCombiningAccent;
