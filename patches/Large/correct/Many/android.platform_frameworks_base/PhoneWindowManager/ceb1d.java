diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 69f1779..5d7d47c 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -3360,7 +3360,7 @@
                 final int shiftlessModifiers = event.getModifiers() & ~KeyEvent.META_SHIFT_MASK;
                 if (KeyEvent.metaStateHasModifiers(shiftlessModifiers, KeyEvent.META_ALT_ON)) {
                     mRecentAppsHeldModifiers = shiftlessModifiers;
-                    showRecentApps(true);
+                    showRecentApps(true, false);
                     return -1;
                 }
             }
