diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/DeckPicker.java b/AnkiDroid/src/main/java/com/ichi2/anki/DeckPicker.java
index 14afee3..38ce745 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/DeckPicker.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/DeckPicker.java
@@ -1589,7 +1589,9 @@
         StudyOptionsFragment details = StudyOptionsFragment.newInstance(withDeckOptions);
         FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
         ft.replace(R.id.studyoptions_fragment, details);
-        ft.commit();
+        // Commit allowing state loss in case the fragment tries to update while the activity is paused
+        // (e.g., after sync). Losing state here is fine since we build a fresh fragment on resume anyway.
+        ft.commitAllowingStateLoss();
     }
 
 
