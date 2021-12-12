diff --git a/app/src/main/java/com/termux/app/TermuxKeyListener.java b/app/src/main/java/com/termux/app/TermuxKeyListener.java
index 866cb51..7f4e35c 100644
--- a/app/src/main/java/com/termux/app/TermuxKeyListener.java
+++ b/app/src/main/java/com/termux/app/TermuxKeyListener.java
@@ -61,7 +61,7 @@
         if (keyCode == KeyEvent.KEYCODE_ENTER && !currentSession.isRunning()) {
             mActivity.removeFinishedSession(currentSession);
             return true;
-        } else if (e.isCtrlPressed() && e.isShiftPressed()) {
+        } else if (e.isCtrlPressed() && e.isAltPressed()) {
             // Get the unmodified code point:
             int unicodeChar = e.getUnicodeChar(0);
 
