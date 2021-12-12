diff --git a/core/java/android/view/ViewRootImpl.java b/core/java/android/view/ViewRootImpl.java
index 1ae69fea..3faac40 100644
--- a/core/java/android/view/ViewRootImpl.java
+++ b/core/java/android/view/ViewRootImpl.java
@@ -144,7 +144,7 @@
     final TrackballAxis mTrackballAxisX = new TrackballAxis();
     final TrackballAxis mTrackballAxisY = new TrackballAxis();
 
-    final SimulatedTrackball mSimulatedTrackball;
+    final SimulatedDpad mSimulatedDpad;
 
     int mLastJoystickXDirection;
     int mLastJoystickYDirection;
@@ -391,7 +391,7 @@
         PowerManager powerManager = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
         mAttachInfo.mScreenOn = powerManager.isScreenOn();
         loadSystemProperties();
-        mSimulatedTrackball = new SimulatedTrackball(context);
+        mSimulatedDpad = new SimulatedDpad(context);
     }
 
     /**
@@ -3535,8 +3535,7 @@
             if (isJoystick) {
                 updateJoystickDirection(event, false);
             } else if (isTouchPad) {
-              //Convert TouchPad motion into a TrackBall event
-              mSimulatedTrackball.updateTrackballDirection(this, event);
+              mSimulatedDpad.updateTouchPad(this, event, false);
             }
             return EVENT_NOT_HANDLED;
         }
@@ -3546,8 +3545,7 @@
             if (isJoystick) {
                 updateJoystickDirection(event, false);
             } else if (isTouchPad) {
-              //Convert TouchPad motion into a TrackBall event
-              mSimulatedTrackball.updateTrackballDirection(this, event);
+              mSimulatedDpad.updateTouchPad(this, event, false);
             }
             return EVENT_HANDLED;
         }
@@ -3559,8 +3557,7 @@
             return EVENT_HANDLED;
         }
         if (isTouchPad) {
-            //Convert TouchPad motion into a TrackBall event
-            mSimulatedTrackball.updateTrackballDirection(this, event);
+            mSimulatedDpad.updateTouchPad(this, event, true);
             return EVENT_HANDLED;
         }
         return EVENT_NOT_HANDLED;
