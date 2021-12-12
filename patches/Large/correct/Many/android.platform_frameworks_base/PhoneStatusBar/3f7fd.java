diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
index e52a401..75430ff 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
@@ -3470,7 +3470,7 @@
             @Override
             public void run() {
                 mLeaveOpenOnKeyguardHide = true;
-                executeRunnableDismissingKeyguard(runnable, null, false, true);
+                executeRunnableDismissingKeyguard(runnable, null, false, false);
             }
         });
     }
