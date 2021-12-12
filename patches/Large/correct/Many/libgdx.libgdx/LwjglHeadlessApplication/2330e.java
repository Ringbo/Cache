diff --git a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglHeadlessApplication.java b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglHeadlessApplication.java
index 9ff83f4..7c90913 100644
--- a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglHeadlessApplication.java
+++ b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglHeadlessApplication.java
@@ -199,7 +199,7 @@
 		if (preferences.containsKey(name)) {
 			return preferences.get(name);
 		} else {
-			Preferences prefs = new LwjglPreferences(name);
+			Preferences prefs = new LwjglPreferences(name, ".prefs/");
 			preferences.put(name, prefs);
 			return prefs;
 		}
