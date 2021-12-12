diff --git a/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java b/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
index c5f07fd..87f24fd 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
@@ -547,7 +547,7 @@
             ActivityManager.StackInfo stackInfo =
                     mIam.getStackInfo(WINDOWING_MODE_UNDEFINED, ACTIVITY_TYPE_RECENTS);
             if (stackInfo == null) {
-                stackInfo = mIam.getStackInfo(WINDOWING_MODE_UNDEFINED, ACTIVITY_TYPE_STANDARD);
+                stackInfo = mIam.getStackInfo(WINDOWING_MODE_FULLSCREEN, ACTIVITY_TYPE_STANDARD);
             }
             if (stackInfo != null) {
                 windowRect.set(stackInfo.bounds);
