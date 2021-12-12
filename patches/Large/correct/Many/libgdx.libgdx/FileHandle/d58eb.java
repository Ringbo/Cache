diff --git a/gdx/src/com/badlogic/gdx/files/FileHandle.java b/gdx/src/com/badlogic/gdx/files/FileHandle.java
index bfe5e92..5650a43 100644
--- a/gdx/src/com/badlogic/gdx/files/FileHandle.java
+++ b/gdx/src/com/badlogic/gdx/files/FileHandle.java
@@ -115,7 +115,7 @@
 		}
 		try {
 			return new FileInputStream(file());
-		} catch (FileNotFoundException ex) {
+		} catch (Exception ex) {
 			if (file().isDirectory())
 				throw new GdxRuntimeException("Cannot open a stream to a directory: " + file + " (" + type + ")", ex);
 			throw new GdxRuntimeException("Error reading file: " + file + " (" + type + ")", ex);
@@ -258,7 +258,7 @@
 		parent().mkdirs();
 		try {
 			return new FileOutputStream(file(), append);
-		} catch (FileNotFoundException ex) {
+		} catch (Exception ex) {
 			if (file().isDirectory())
 				throw new GdxRuntimeException("Cannot open a stream to a directory: " + file + " (" + type + ")", ex);
 			throw new GdxRuntimeException("Error writing file: " + file + " (" + type + ")", ex);
