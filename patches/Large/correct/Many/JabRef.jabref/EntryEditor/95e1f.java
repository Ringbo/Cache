diff --git a/src/main/java/net/sf/jabref/EntryEditor.java b/src/main/java/net/sf/jabref/EntryEditor.java
index 9171116..f1046de 100644
--- a/src/main/java/net/sf/jabref/EntryEditor.java
+++ b/src/main/java/net/sf/jabref/EntryEditor.java
@@ -1752,7 +1752,7 @@
         public void actionPerformed(ActionEvent event) {
             FileListEditor fileListEditor = EntryEditor.this.fileListEditor;
             if (fileListEditor == null) {
-                LOGGER.debug("No file list editor found.");
+                LOGGER.warn("No file list editor found.");
             } else {
                 fileListEditor.autoSetLinks();
             }
