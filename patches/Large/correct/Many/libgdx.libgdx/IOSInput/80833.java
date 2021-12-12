diff --git a/backends/gdx-backend-iosmonotouch/src/com/badlogic/gdx/backends/ios/IOSInput.java b/backends/gdx-backend-iosmonotouch/src/com/badlogic/gdx/backends/ios/IOSInput.java
index aaf51f9..8e09a69 100644
--- a/backends/gdx-backend-iosmonotouch/src/com/badlogic/gdx/backends/ios/IOSInput.java
+++ b/backends/gdx-backend-iosmonotouch/src/com/badlogic/gdx/backends/ios/IOSInput.java
@@ -256,7 +256,7 @@
 						break;
 					case UITouchPhase.Moved:
 					case UITouchPhase.Stationary:
-						inputProcessor.touchDown(event.x, event.y, event.pointer, Buttons.LEFT);
+						inputProcessor.touchDragged(event.x, event.y, event.pointer);
 						break;
 					}
 				}
