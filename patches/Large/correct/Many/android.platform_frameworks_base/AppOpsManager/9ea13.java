diff --git a/core/java/android/app/AppOpsManager.java b/core/java/android/app/AppOpsManager.java
index 13389e3..dcf4eec 100644
--- a/core/java/android/app/AppOpsManager.java
+++ b/core/java/android/app/AppOpsManager.java
@@ -1571,7 +1571,7 @@
             long time = 0;
             for (int i = 0; i < _NUM_UID_STATE; i++) {
                 if (mRejectTimes[i] > time) {
-                    time = mTimes[i];
+                    time = mRejectTimes[i];
                 }
             }
             return time;
