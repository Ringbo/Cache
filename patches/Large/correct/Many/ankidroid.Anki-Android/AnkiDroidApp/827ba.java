diff --git a/src/com/ichi2/anki/AnkiDroidApp.java b/src/com/ichi2/anki/AnkiDroidApp.java
index ad25994..97be672 100644
--- a/src/com/ichi2/anki/AnkiDroidApp.java
+++ b/src/com/ichi2/anki/AnkiDroidApp.java
@@ -95,7 +95,9 @@
             // "AnkiDroid" folder
             editor.putString("deckPath", getStorageDirectory() + "/AnkiDroid");
 
-            editor.apply();
+            // Using commit instead of apply even though we don't need a return value.
+            // Reason: apply() not available on Android 1.5
+            editor.commit();
         }
 
         // Reschedule the checks - we need to do this if the settings have
