diff --git a/policy/src/com/android/internal/policy/impl/SimPukUnlockScreen.java b/policy/src/com/android/internal/policy/impl/SimPukUnlockScreen.java
index ba06996..f3e7d4a 100644
--- a/policy/src/com/android/internal/policy/impl/SimPukUnlockScreen.java
+++ b/policy/src/com/android/internal/policy/impl/SimPukUnlockScreen.java
@@ -106,7 +106,7 @@
         mHeaderText.setSelected(true);
 
         mKeyguardStatusViewManager = new KeyguardStatusViewManager(this, updateMonitor,
-                lockpatternutils, callback, false);
+                lockpatternutils, callback, true);
 
         mPinText.setFocusableInTouchMode(true);
         mPinText.setOnFocusChangeListener(this);
