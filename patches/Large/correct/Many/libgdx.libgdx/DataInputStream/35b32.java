diff --git a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/java/io/DataInputStream.java b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/java/io/DataInputStream.java
index a89ea4b..1c3b504 100644
--- a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/java/io/DataInputStream.java
+++ b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/java/io/DataInputStream.java
@@ -113,13 +113,13 @@
 			sb.append((char)a);
 			return 1;
 		}
-		if ((a & 0xe0) == 0xb0) {
+		if ((a & 0xe0) == 0xc0) {
 			int b = readUnsignedByte();
 			sb.append((char)(((a & 0x1F) << 6) | (b & 0x3F)));
 			return 2;
 		}
 		if ((a & 0xf0) == 0xe0) {
-			int b = is.read();
+			int b = readUnsignedByte();
 			int c = readUnsignedByte();
 			sb.append((char)(((a & 0x0F) << 12) | ((b & 0x3F) << 6) | (c & 0x3F)));
 			return 3;
