diff --git a/core/java/android/view/ViewRootImpl.java b/core/java/android/view/ViewRootImpl.java
index 9ef9d01..58e6fbe 100644
--- a/core/java/android/view/ViewRootImpl.java
+++ b/core/java/android/view/ViewRootImpl.java
@@ -144,7 +144,7 @@
     final TrackballAxis mTrackballAxisX = new TrackballAxis();
     final TrackballAxis mTrackballAxisY = new TrackballAxis();
 
-    final SimulatedTrackball mSimulatedTrackball;
+    final SimulatedDpad mSimulatedDpad;
 
     int mLastJoystickXDirection;
     int mLastJoystickYDirection;
@@ -392,7 +392,7 @@
         PowerManager powerManager = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
         mAttachInfo.mScreenOn = powerManager.isScreenOn();
         loadSystemProperties();
-        mSimulatedTrackball = new SimulatedTrackball(context);
+        mSimulatedDpad = new SimulatedDpad(context);
     }
 
     /**
@@ -3452,8 +3452,7 @@
             if (isJoystick) {
                 updateJoystickDirection(event, false);
             } else if (isTouchPad) {
-              //Convert TouchPad motion into a TrackBall event
-              mSimulatedTrackball.updateTrackballDirection(this, event);
+              mSimulatedDpad.updateTouchPad(this, event, false);
             }
             return EVENT_NOT_HANDLED;
         }
@@ -3463,8 +3462,7 @@
             if (isJoystick) {
                 updateJoystickDirection(event, false);
             } else if (isTouchPad) {
-              //Convert TouchPad motion into a TrackBall event
-              mSimulatedTrackball.updateTrackballDirection(this, event);
+              mSimulatedDpad.updateTouchPad(this, event, false);
             }
             return EVENT_HANDLED;
         }
@@ -3476,8 +3474,7 @@
             return EVENT_HANDLED;
         }
         if (isTouchPad) {
-            //Convert TouchPad motion into a TrackBall event
-            mSimulatedTrackball.updateTrackballDirection(this, event);
+            mSimulatedDpad.updateTouchPad(this, event, true);
             return EVENT_HANDLED;
         }
         return EVENT_NOT_HANDLED;
