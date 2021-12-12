diff --git a/gdx/src/com/badlogic/gdx/files/FileHandle.java b/gdx/src/com/badlogic/gdx/files/FileHandle.java
index ab42c90..71c9652 100644
--- a/gdx/src/com/badlogic/gdx/files/FileHandle.java
+++ b/gdx/src/com/badlogic/gdx/files/FileHandle.java
@@ -222,7 +222,7 @@
 				int count = input.read(buffer, position, buffer.length - position);
 				if (count == -1) break;
 				position += count;
-				if (position == buffer.length) {
+				if (count == 0 && position == buffer.length) {
 					// Grow buffer.
 					byte[] newBuffer = new byte[buffer.length * 2];
 					System.arraycopy(buffer, 0, newBuffer, 0, position);
