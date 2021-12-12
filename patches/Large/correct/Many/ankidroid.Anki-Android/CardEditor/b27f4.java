diff --git a/src/com/ichi2/anki/CardEditor.java b/src/com/ichi2/anki/CardEditor.java
index b55996b..6a8b00c 100644
--- a/src/com/ichi2/anki/CardEditor.java
+++ b/src/com/ichi2/anki/CardEditor.java
@@ -107,7 +107,7 @@
                     FieldEditText current = iter.next();
                     current.updateField();
                 }
-                AnkiDroidApp.deck().setUndoStart(undoName);
+                AnkiDroidApp.deck().setUndoEnd(undoName);
                 setResult(RESULT_OK);
                 finish();
             }
