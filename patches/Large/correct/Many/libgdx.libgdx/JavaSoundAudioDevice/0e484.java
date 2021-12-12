diff --git a/backends/gdx-openal/src/com/badlogic/gdx/backends/openal/JavaSoundAudioDevice.java b/backends/gdx-openal/src/com/badlogic/gdx/backends/openal/JavaSoundAudioDevice.java
index 225376a..38d9c18 100644
--- a/backends/gdx-openal/src/com/badlogic/gdx/backends/openal/JavaSoundAudioDevice.java
+++ b/backends/gdx-openal/src/com/badlogic/gdx/backends/openal/JavaSoundAudioDevice.java
@@ -72,7 +72,7 @@
 			if (fValue > 1) fValue = 1;
 			if (fValue < -1) fValue = -1;
 			short value = (short)(fValue * Short.MAX_VALUE);
-			bytes[j] = (byte)(value | 0xff);
+			bytes[j] = (byte)(value & 0xff);
 			bytes[j + 1] = (byte)(value >> 8);
 		}
 
