diff --git a/src/com/ichi2/anki/CardEditor.java b/src/com/ichi2/anki/CardEditor.java
index 14fbe01..a5a266f 100644
--- a/src/com/ichi2/anki/CardEditor.java
+++ b/src/com/ichi2/anki/CardEditor.java
@@ -536,7 +536,8 @@
         } catch (JSONException e) {
             throw new RuntimeException(e);
         }
-        mNoteTypeSpinner.setSelection(position);
+        // set selection without firing selectionChanged event
+        mNoteTypeSpinner.setSelection(position, false);
 
         if (mAddNote) {
             mNoteTypeSpinner.setEnabled(true);
