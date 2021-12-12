diff --git a/services/core/java/com/android/server/am/ActivityStackSupervisor.java b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
index 185897a..abd24e1 100644
--- a/services/core/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
@@ -3375,7 +3375,8 @@
                     stack.goToSleepIfPossible(false /* shuttingDown */);
                 } else {
                     stack.awakeFromSleepingLocked();
-                    if (isFocusedStack(stack) && !mKeyguardController.isKeyguardLocked()) {
+                    if (isFocusedStack(stack)
+                            && !mKeyguardController.isKeyguardShowing(display.mDisplayId)) {
                         // If the keyguard is unlocked - resume immediately.
                         // It is possible that the display will not be awake at the time we
                         // process the keyguard going away, which can happen before the sleep token
