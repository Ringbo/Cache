diff --git a/core/java/com/android/internal/view/menu/MenuBuilder.java b/core/java/com/android/internal/view/menu/MenuBuilder.java
index e8d1ead..e5f9ec9 100644
--- a/core/java/com/android/internal/view/menu/MenuBuilder.java
+++ b/core/java/com/android/internal/view/menu/MenuBuilder.java
@@ -828,7 +828,8 @@
                       || shortcutChar == possibleChars.meta[2]
                       || (qwerty && shortcutChar == '\b' &&
                           keyCode == KeyEvent.KEYCODE_DEL)) &&
-                  item.isEnabled()) {
+                  item.isEnabled() &&
+                  item.isVisible()) {
                 items.add(item);
             }
         }
