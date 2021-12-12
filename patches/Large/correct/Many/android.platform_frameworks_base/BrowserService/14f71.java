diff --git a/tests/MusicServiceDemo/src/com/example/android/musicservicedemo/BrowserService.java b/tests/MusicServiceDemo/src/com/example/android/musicservicedemo/BrowserService.java
index a216a32..4e2e47e 100644
--- a/tests/MusicServiceDemo/src/com/example/android/musicservicedemo/BrowserService.java
+++ b/tests/MusicServiceDemo/src/com/example/android/musicservicedemo/BrowserService.java
@@ -134,8 +134,8 @@
                         bob.setSubtitle("Summary " + i);
                         bob.setMediaId(Uri.withAppendedPath(BASE_URI,
                                 Integer.toString(i)).toString());
-                        list.add(new MediaBrowser.MediaItem(MediaBrowser.MediaItem.FLAG_BROWSABLE,
-                                bob.build()));
+                        list.add(new MediaBrowser.MediaItem(bob.build(),
+                                MediaBrowser.MediaItem.FLAG_BROWSABLE));
                     }
 
                     result.sendResult(list);
