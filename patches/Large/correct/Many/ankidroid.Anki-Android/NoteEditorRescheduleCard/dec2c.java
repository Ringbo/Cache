diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/NoteEditorRescheduleCard.java b/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/NoteEditorRescheduleCard.java
index 6b55e59..bcd853c 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/NoteEditorRescheduleCard.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/NoteEditorRescheduleCard.java
@@ -23,7 +23,7 @@
                 .positiveText(getResources().getString(R.string.dialog_ok))
                 .negativeText(R.string.cancel)
                 .inputType(InputType.TYPE_CLASS_NUMBER)
-                .inputRange(1, 9999)
+                .inputRange(1, 4) // max 4 characters (i.e., 9999)
                 .input(R.string.reschedule_card_dialog_message, R.string.empty_string, new MaterialDialog.InputCallback() {
                     @Override
                     public void onInput(MaterialDialog dialog, CharSequence text) {
