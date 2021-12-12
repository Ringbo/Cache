diff --git a/src/com/ichi2/anki/CardEditor.java b/src/com/ichi2/anki/CardEditor.java
index cd21136..9996aa5 100644
--- a/src/com/ichi2/anki/CardEditor.java
+++ b/src/com/ichi2/anki/CardEditor.java
@@ -486,7 +486,7 @@
 				}
 				boolean modified = false;
 				for (FieldEditText f : mEditFields) {
-					modified = modified || f.updateField();
+					modified = modified | f.updateField();
 				}
 				if (mAddNote) {
 					DeckTask.launchDeckTask(DeckTask.TASK_TYPE_ADD_FACT, mSaveFactHandler, new DeckTask.TaskData(mEditorNote));	
