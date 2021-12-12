diff --git a/src/com/ichi2/anki/dialogs/ImportDialog.java b/src/com/ichi2/anki/dialogs/ImportDialog.java
index f004874..83c711d 100644
--- a/src/com/ichi2/anki/dialogs/ImportDialog.java
+++ b/src/com/ichi2/anki/dialogs/ImportDialog.java
@@ -81,7 +81,7 @@
                 List<File> fileList = Utils.getImportableDecks();
                 if (fileList.size() == 0) {
                     Themes.showThemedToast(getActivity(),
-                            getResources().getString(R.string.upgrade_import_no_file_found), false);
+                            getResources().getString(R.string.upgrade_import_no_file_found, "'.apkg'"), false);
                 }
                 dialog.setEnabled(fileList.size() != 0);
                 // Make arrays for the filenames and the full absolute paths of all importable APKGs
