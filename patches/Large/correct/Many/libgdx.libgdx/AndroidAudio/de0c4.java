diff --git a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidAudio.java b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidAudio.java
index f58bc57..b90a046 100644
--- a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidAudio.java
+++ b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidAudio.java
@@ -40,12 +40,12 @@
  * 
  * @author mzechner */
 public final class AndroidAudio implements Audio {
-	private SoundPool soundPool;
+	private final SoundPool soundPool;
 	private final AudioManager manager;
 	protected final List<AndroidMusic> musics = new ArrayList<AndroidMusic>();
 
 	public AndroidAudio (Activity context, AndroidApplicationConfiguration config) {
-		soundPool = new SoundPool(config.maxSimultaniousSounds, AudioManager.STREAM_MUSIC, 100);
+		soundPool = new SoundPool(config.maxSimultaneousSounds, AudioManager.STREAM_MUSIC, 100);
 		manager = (AudioManager)context.getSystemService(Context.AUDIO_SERVICE);
 		context.setVolumeControlStream(AudioManager.STREAM_MUSIC);
 	}
