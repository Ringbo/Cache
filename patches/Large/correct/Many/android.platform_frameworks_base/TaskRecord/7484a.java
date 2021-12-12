diff --git a/services/core/java/com/android/server/am/TaskRecord.java b/services/core/java/com/android/server/am/TaskRecord.java
index 43f5baa..7e14b2b 100644
--- a/services/core/java/com/android/server/am/TaskRecord.java
+++ b/services/core/java/com/android/server/am/TaskRecord.java
@@ -1193,7 +1193,7 @@
             mOverrideConfig = Configuration.EMPTY;
         } else {
             mBounds = new Rect(bounds);
-            if (stack.mStackId != DOCKED_STACK_ID) {
+            if (stack == null || stack.mStackId != DOCKED_STACK_ID) {
                 mLastNonFullscreenBounds = mBounds;
             }
 
