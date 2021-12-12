diff --git a/demos/invaders/gdx-invaders/src/com/badlogic/gdxinvaders/GdxInvaders.java b/demos/invaders/gdx-invaders/src/com/badlogic/gdxinvaders/GdxInvaders.java
index 1e31a4a..ade6a19 100644
--- a/demos/invaders/gdx-invaders/src/com/badlogic/gdxinvaders/GdxInvaders.java
+++ b/demos/invaders/gdx-invaders/src/com/badlogic/gdxinvaders/GdxInvaders.java
@@ -71,7 +71,7 @@
 
 	@Override public void create () {
 		if (!isInitialized) {
-			screen = new GameOver(Gdx.app);
+			screen = new MainMenu(Gdx.app);
 			Music music = Gdx.audio.newMusic(Gdx.files.getFileHandle("data/8.12.mp3", FileType.Internal));
 			music.setLooping(true);
 			music.play();
