diff --git a/services/core/java/com/android/server/wm/TaskSnapshotController.java b/services/core/java/com/android/server/wm/TaskSnapshotController.java
index 4e4d42d..bc7f330 100644
--- a/services/core/java/com/android/server/wm/TaskSnapshotController.java
+++ b/services/core/java/com/android/server/wm/TaskSnapshotController.java
@@ -211,7 +211,7 @@
         }
         final GraphicBuffer buffer = top.mDisplayContent.screenshotApplicationsToBuffer(top.token,
                 -1, -1, false, 1.0f, false, true);
-        if (buffer == null) {
+        if (buffer == null || buffer.getWidth() <= 1 || buffer.getHeight() <= 1) {
             return null;
         }
         return new TaskSnapshot(buffer, top.getConfiguration().orientation,
