diff --git a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglAWTCanvas.java b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglAWTCanvas.java
index 09c6d41..b3f440d 100644
--- a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglAWTCanvas.java
+++ b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglAWTCanvas.java
@@ -317,7 +317,7 @@
 		if (preferences.containsKey(name)) {
 			return preferences.get(name);
 		} else {
-			Preferences prefs = new LwjglPreferences(name);
+			Preferences prefs = new LwjglPreferences(name, ".prefs/");
 			preferences.put(name, prefs);
 			return prefs;
 		}
