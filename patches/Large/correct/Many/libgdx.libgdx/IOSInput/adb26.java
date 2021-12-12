diff --git a/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSInput.java b/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSInput.java
index 92add30..aa1fc4d 100644
--- a/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSInput.java
+++ b/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSInput.java
@@ -610,7 +610,7 @@
 				switch (event.phase) {
 				case Began:
 					if (inputProcessor != null) inputProcessor.touchDown(event.x, event.y, event.pointer, Buttons.LEFT);
-					if (numTouched == 1) justTouched = true;
+					if (numTouched >= 1) justTouched = true;
 					break;
 				case Cancelled:
 				case Ended:
