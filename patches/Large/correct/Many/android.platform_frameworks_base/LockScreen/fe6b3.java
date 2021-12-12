diff --git a/policy/com/android/internal/policy/impl/LockScreen.java b/policy/com/android/internal/policy/impl/LockScreen.java
index 45fb08b..afde895 100644
--- a/policy/com/android/internal/policy/impl/LockScreen.java
+++ b/policy/com/android/internal/policy/impl/LockScreen.java
@@ -343,7 +343,8 @@
     }
 
     private void updateStatusLines() {
-        if (!mStatus.showStatusLines()) {
+        if (!mStatus.showStatusLines()
+                || (mCharging == null && mNextAlarm == null)) {
             mStatus1.setVisibility(View.INVISIBLE);
             mStatus2.setVisibility(View.INVISIBLE);
         } else if (mCharging != null && mNextAlarm == null) {
