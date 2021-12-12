diff --git a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCanvas.java b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCanvas.java
index 270c244..2c8fb23f 100644
--- a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCanvas.java
+++ b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCanvas.java
@@ -316,7 +316,7 @@
 		if (preferences.containsKey(name)) {
 			return preferences.get(name);
 		} else {
-			Preferences prefs = new LwjglPreferences(name);
+			Preferences prefs = new LwjglPreferences(name, ".prefs/");
 			preferences.put(name, prefs);
 			return prefs;
 		}
