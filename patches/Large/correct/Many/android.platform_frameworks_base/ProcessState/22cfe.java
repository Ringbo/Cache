diff --git a/core/java/com/android/internal/app/procstats/ProcessState.java b/core/java/com/android/internal/app/procstats/ProcessState.java
index 80d6070..8c5df08 100644
--- a/core/java/com/android/internal/app/procstats/ProcessState.java
+++ b/core/java/com/android/internal/app/procstats/ProcessState.java
@@ -277,7 +277,7 @@
         if (!mDead) {
             return;
         }
-        Slog.wtfStack(TAG, "ProcessState dead: name=" + mName
+        Slog.w(TAG, "ProcessState dead: name=" + mName
                 + " pkg=" + mPackage + " uid=" + mUid + " common.name=" + mCommonProcess.mName);
     }
 
