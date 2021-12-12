diff --git a/gdx/src/com/badlogic/gdx/graphics/glutils/ETC1.java b/gdx/src/com/badlogic/gdx/graphics/glutils/ETC1.java
index 5db21f8..bcf85e1 100644
--- a/gdx/src/com/badlogic/gdx/graphics/glutils/ETC1.java
+++ b/gdx/src/com/badlogic/gdx/graphics/glutils/ETC1.java
@@ -62,7 +62,7 @@
 			try {
 				in = new DataInputStream(new BufferedInputStream(new GZIPInputStream(pkmFile.read())));
 				int fileSize = in.readInt();
-				compressedData = BufferUtils.newByteBuffer(fileSize);
+				compressedData = BufferUtils.newUnsafeByteBuffer(fileSize);
 				int readBytes = 0;
 				while ((readBytes = in.read(buffer)) != -1) {
 					compressedData.put(buffer, 0, readBytes);
