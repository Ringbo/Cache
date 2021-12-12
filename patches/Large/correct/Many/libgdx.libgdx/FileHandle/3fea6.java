diff --git a/gdx/src/com/badlogic/gdx/files/FileHandle.java b/gdx/src/com/badlogic/gdx/files/FileHandle.java
index 91e009d..27c47a8 100644
--- a/gdx/src/com/badlogic/gdx/files/FileHandle.java
+++ b/gdx/src/com/badlogic/gdx/files/FileHandle.java
@@ -188,7 +188,7 @@
 		for (int i = 0, n = relativePaths.length; i < n; i++) {
 			String path = relativePaths[i];
 			if (!path.endsWith(suffix)) continue;
-			handles[i] = child(path);
+			handles[count] = child(path);
 			count++;
 		}
 		if (count < relativePaths.length) {
