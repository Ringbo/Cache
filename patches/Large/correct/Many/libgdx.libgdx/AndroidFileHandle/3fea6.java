diff --git a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidFileHandle.java b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidFileHandle.java
index f4c271f..5b615a8 100644
--- a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidFileHandle.java
+++ b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidFileHandle.java
@@ -95,7 +95,7 @@
 				for (int i = 0, n = handles.length; i < n; i++) {
 					String path = relativePaths[i];
 					if (!path.endsWith(suffix)) continue;
-					handles[i] = new AndroidFileHandle(assets, new File(file, path), type);
+					handles[count] = new AndroidFileHandle(assets, new File(file, path), type);
 					count++;
 				}
 				if (count < relativePaths.length) {
