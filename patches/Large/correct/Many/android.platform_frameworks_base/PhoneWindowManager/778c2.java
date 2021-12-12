diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index 54a5107..3232a1e 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -3007,7 +3007,8 @@
                     // Ensure policy decor includes status bar
                     dcf.top = mStableTop;
                 }
-                if ((sysUiFl & View.SYSTEM_UI_FLAG_TRANSPARENT_NAVIGATION) == 0) {
+                if ((sysUiFl & View.SYSTEM_UI_FLAG_TRANSPARENT_NAVIGATION) == 0
+                        && (sysUiFl & View.SYSTEM_UI_FLAG_HIDE_NAVIGATION) == 0) {
                     // Ensure policy decor includes navigation bar
                     dcf.bottom = mStableBottom;
                     dcf.right = mStableRight;
