diff --git a/gdx/src/com/badlogic/gdx/assets/AssetManager.java b/gdx/src/com/badlogic/gdx/assets/AssetManager.java
index 501d233..13b85e2 100644
--- a/gdx/src/com/badlogic/gdx/assets/AssetManager.java
+++ b/gdx/src/com/badlogic/gdx/assets/AssetManager.java
@@ -204,7 +204,7 @@
 				if (preloadQueue.size == 0) return true;
 				nextTask();
 				// second check if we tried to load an asset that's already loaded and the queue became empty.
-				if (preloadQueue.size == 0) return true;
+				if (preloadQueue.size == 0 || tasks.size() == 0) return true;
 			}
 			return updateTask() && preloadQueue.size == 0;
 		} catch (Throwable t) {
