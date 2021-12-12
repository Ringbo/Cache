diff --git a/gdx-tests/src/com/badlogic/gdx/tests/AudioRecorderTest.java b/gdx-tests/src/com/badlogic/gdx/tests/AudioRecorderTest.java
index 298dae9..876b2da 100644
--- a/gdx-tests/src/com/badlogic/gdx/tests/AudioRecorderTest.java
+++ b/gdx-tests/src/com/badlogic/gdx/tests/AudioRecorderTest.java
@@ -83,6 +83,6 @@
 	public void resume(Application app) 
 	{
 		device = app.getAudio().newAudioDevice(true);
-		recorder = app.getAudio().newAudioRecoder( 22050, true );		
+		recorder = app.getAudio().newAudioRecoder( 44100, true );		
 	}	
 }
