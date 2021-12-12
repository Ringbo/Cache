diff --git a/src/com/ichi2/anki/DeckPicker.java b/src/com/ichi2/anki/DeckPicker.java
index 1ad8b26..1de45f3 100644
--- a/src/com/ichi2/anki/DeckPicker.java
+++ b/src/com/ichi2/anki/DeckPicker.java
@@ -1611,7 +1611,7 @@
                         mImportPath = null;
                     }
                 });
-                builder.setPositiveButton(res.getString(R.string.import_message_replace), new DialogInterface.OnClickListener() {
+                builder.setNeutralButton(res.getString(R.string.import_message_replace), new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                     	Resources res = getResources();
