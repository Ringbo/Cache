diff --git a/app/src/main/java/com/kabouzeid/gramophone/appshortcuts/AppShortcutLauncherActivity.java b/app/src/main/java/com/kabouzeid/gramophone/appshortcuts/AppShortcutLauncherActivity.java
index 1e0d699..3954ffb 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/appshortcuts/AppShortcutLauncherActivity.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/appshortcuts/AppShortcutLauncherActivity.java
@@ -49,7 +49,7 @@
                 break;
             case TOP_TRACKS:
                 launchMainActivityWithSongs(PlayMode.NORMAL,
-                        TopAndRecentlyPlayedTracksLoader.getRecentlyPlayedTracks(getApplicationContext()));
+                        TopAndRecentlyPlayedTracksLoader.getTopTracks(getApplicationContext()));
                 DynamicShortcutManager.reportShortcutUsed(this, TopTracksShortcutType.getId());
                 break;
             case LAST_ADDED:
