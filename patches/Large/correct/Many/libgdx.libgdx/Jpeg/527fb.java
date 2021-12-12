diff --git a/extensions/gdx-image/src/com/badlogic/gdx/graphics/g2d/Jpeg.java b/extensions/gdx-image/src/com/badlogic/gdx/graphics/g2d/Jpeg.java
index af0b9ae..a62e092 100644
--- a/extensions/gdx-image/src/com/badlogic/gdx/graphics/g2d/Jpeg.java
+++ b/extensions/gdx-image/src/com/badlogic/gdx/graphics/g2d/Jpeg.java
@@ -23,7 +23,7 @@
 	/**
 	 * Reads a jpeg from the given file, throws a GdxRuntimeException in case something went wrong.
 	 */
-	public static Pixmap read(FileHandle file) {
+	public static synchronized Pixmap read(FileHandle file) {
 		byte[] bytes = file.readBytes();
 		long[] out = new long[4];
 		ByteBuffer pixels = read(bytes, 0, bytes.length, out);
