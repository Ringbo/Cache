diff --git a/core/java/android/inputmethodservice/InputMethodService.java b/core/java/android/inputmethodservice/InputMethodService.java
index f07002e..7271b8e 100644
--- a/core/java/android/inputmethodservice/InputMethodService.java
+++ b/core/java/android/inputmethodservice/InputMethodService.java
@@ -1952,7 +1952,7 @@
         ic.sendKeyEvent(new KeyEvent(eventTime, eventTime,
                 KeyEvent.ACTION_DOWN, keyEventCode, 0, 0, KeyCharacterMap.VIRTUAL_KEYBOARD, 0,
                 KeyEvent.FLAG_SOFT_KEYBOARD|KeyEvent.FLAG_KEEP_TOUCH_MODE));
-        ic.sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), eventTime,
+        ic.sendKeyEvent(new KeyEvent(eventTime, SystemClock.uptimeMillis(),
                 KeyEvent.ACTION_UP, keyEventCode, 0, 0, KeyCharacterMap.VIRTUAL_KEYBOARD, 0,
                 KeyEvent.FLAG_SOFT_KEYBOARD|KeyEvent.FLAG_KEEP_TOUCH_MODE));
     }
