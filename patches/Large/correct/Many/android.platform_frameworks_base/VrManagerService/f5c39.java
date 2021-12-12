diff --git a/services/core/java/com/android/server/vr/VrManagerService.java b/services/core/java/com/android/server/vr/VrManagerService.java
index e737328..447d639 100644
--- a/services/core/java/com/android/server/vr/VrManagerService.java
+++ b/services/core/java/com/android/server/vr/VrManagerService.java
@@ -779,7 +779,8 @@
             }
 
             if ((calling != null || mPersistentVrModeEnabled)
-                    && !Objects.equals(calling, mCurrentVrModeComponent)) {
+                    && !Objects.equals(calling, mCurrentVrModeComponent)
+                    || mRunning2dInVr != running2dInVr) {
                 sendUpdatedCaller = true;
             }
             mCurrentVrModeComponent = calling;
