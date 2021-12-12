diff --git a/test-runner/android/test/TouchUtils.java b/test-runner/android/test/TouchUtils.java
index 962b2f9..69c6d2d 100644
--- a/test-runner/android/test/TouchUtils.java
+++ b/test-runner/android/test/TouchUtils.java
@@ -773,7 +773,7 @@
         float xStep = (toX - fromX) / stepCount;
 
         MotionEvent event = MotionEvent.obtain(downTime, eventTime,
-                MotionEvent.ACTION_DOWN, fromX, y, 0);
+                MotionEvent.ACTION_DOWN, x, y, 0);
         inst.sendPointerSync(event);
         inst.waitForIdleSync();
 
@@ -787,7 +787,7 @@
         }
 
         eventTime = SystemClock.uptimeMillis();
-        event = MotionEvent.obtain(downTime, eventTime, MotionEvent.ACTION_UP, fromX, y, 0);
+        event = MotionEvent.obtain(downTime, eventTime, MotionEvent.ACTION_UP, x, y, 0);
         inst.sendPointerSync(event);
         inst.waitForIdleSync();
     }
