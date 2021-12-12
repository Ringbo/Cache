diff --git a/backends/gdx-openal/src/com/badlogic/gdx/backends/openal/OggInputStream.java b/backends/gdx-openal/src/com/badlogic/gdx/backends/openal/OggInputStream.java
index 9ec64bf..2a42fcc 100644
--- a/backends/gdx-openal/src/com/badlogic/gdx/backends/openal/OggInputStream.java
+++ b/backends/gdx-openal/src/com/badlogic/gdx/backends/openal/OggInputStream.java
@@ -168,7 +168,7 @@
 		try {
 			bytes = input.read(buffer, index, 4096);
 		} catch (Exception e) {
-			throw new GdxRuntimeException("Failure reading Vorbis.");
+			throw new GdxRuntimeException("Failure reading Vorbis.", e);
 		}
 		syncState.wrote(bytes);
 
@@ -252,7 +252,7 @@
 			try {
 				bytes = input.read(buffer, index, 4096);
 			} catch (Exception e) {
-				throw new GdxRuntimeException("Failed to read Vorbis.");
+				throw new GdxRuntimeException("Failed to read Vorbis.", e);
 			}
 			if (bytes == 0 && i < 2) {
 				throw new GdxRuntimeException("End of file before finding all Vorbis headers.");
@@ -393,7 +393,7 @@
 						try {
 							bytes = input.read(buffer, index, 4096);
 						} catch (Exception e) {
-							throw new GdxRuntimeException("Error during Vorbis decoding.");
+							throw new GdxRuntimeException("Error during Vorbis decoding.", e);
 						}
 					} else {
 						bytes = 0;
