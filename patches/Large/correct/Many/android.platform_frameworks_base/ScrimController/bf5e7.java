diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/ScrimController.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/ScrimController.java
index 90be92d..5353f25 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/ScrimController.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/ScrimController.java
@@ -148,7 +148,7 @@
 
         if (!mDozing || mPulseCallback != null) {
             // Pulse suppressed.
-            mPulseCallback.onPulseFinished();
+            callback.onPulseFinished();
             return;
         }
 
