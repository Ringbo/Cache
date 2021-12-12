diff --git a/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Clicker.java b/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Clicker.java
index b3e0413..28c40fb 100644
--- a/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Clicker.java
+++ b/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Clicker.java
@@ -109,7 +109,7 @@
 		if(time > 0)
 			sleeper.sleep(time);
 		else
-			sleeper.sleep((int)(ViewConfiguration.getLongPressTimeout() * 1.5f));
+			sleeper.sleep((int)(ViewConfiguration.getLongPressTimeout() * 2.5f));
 
 		eventTime = SystemClock.uptimeMillis();
 		event = MotionEvent.obtain(downTime, eventTime, MotionEvent.ACTION_UP, x, y, 0);
