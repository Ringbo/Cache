diff --git a/src/com/ichi2/anki/Reviewer.java b/src/com/ichi2/anki/Reviewer.java
index 8fdef4f..9953fc6 100644
--- a/src/com/ichi2/anki/Reviewer.java
+++ b/src/com/ichi2/anki/Reviewer.java
@@ -1328,10 +1328,11 @@
         if (mClipboard != null) {
             try {
                 mClipboard.setText(text);
-            } catch (NullPointerException e) {
-                // Workaround for https://code.google.com/p/ankidroid/issues/detail?id=1746
-                // Some devices end up with an unusable clipboard. If so, we must disable it or AnkiDroid will
-                // crash if it tries to use it.
+            } catch (Exception e) {
+                // https://code.google.com/p/ankidroid/issues/detail?id=1746
+                // https://code.google.com/p/ankidroid/issues/detail?id=1820
+                // Some devices or external applications make the clipboard throw exceptions. If this happens, we
+                // must disable it or AnkiDroid will crash if it tries to use it.
                 Log.e(AnkiDroidApp.TAG, "Clipboard error. Disabling text selection setting.");
                 AnkiDroidApp.getSharedPrefs(getBaseContext()).edit().putBoolean("textSelection", false).commit();
             }
