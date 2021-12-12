diff --git a/backends/gdx-backend-iosmonotouch/src/com/badlogic/gdx/backends/ios/IOSInput.java b/backends/gdx-backend-iosmonotouch/src/com/badlogic/gdx/backends/ios/IOSInput.java
index ecce1ad..62719d6 100644
--- a/backends/gdx-backend-iosmonotouch/src/com/badlogic/gdx/backends/ios/IOSInput.java
+++ b/backends/gdx-backend-iosmonotouch/src/com/badlogic/gdx/backends/ios/IOSInput.java
@@ -308,7 +308,7 @@
 					break;
 				}
 			}
-			touchEventPool.free(touchEvents);
+			touchEventPool.freeAll(touchEvents);
 			touchEvents.clear();
 		}
 	}
