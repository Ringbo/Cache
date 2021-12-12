diff --git a/services/core/java/com/android/server/am/AppTaskImpl.java b/services/core/java/com/android/server/am/AppTaskImpl.java
index 5f5a504..bb6c6a0 100644
--- a/services/core/java/com/android/server/am/AppTaskImpl.java
+++ b/services/core/java/com/android/server/am/AppTaskImpl.java
@@ -98,7 +98,7 @@
         final int callingUid = Binder.getCallingUid();
         final long origId = Binder.clearCallingIdentity();
         try {
-            synchronized (this) {
+            synchronized (mService) {
                 mService.mStackSupervisor.startActivityFromRecents(callingPid, callingUid, mTaskId,
                         null);
             }
