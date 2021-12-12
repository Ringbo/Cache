diff --git a/src/main/java/org/jabref/gui/exporter/ExportCommand.java b/src/main/java/org/jabref/gui/exporter/ExportCommand.java
index 21bd505..a407dcb 100644
--- a/src/main/java/org/jabref/gui/exporter/ExportCommand.java
+++ b/src/main/java/org/jabref/gui/exporter/ExportCommand.java
@@ -87,7 +87,7 @@
 
         // Make sure we remember which filter was used, to set
         // the default for next time:
-        Globals.prefs.put(JabRefPreferences.LAST_USED_EXPORT, format.getDescription());
+        Globals.prefs.put(JabRefPreferences.LAST_USED_EXPORT, format.getName());
         Globals.prefs.put(JabRefPreferences.EXPORT_WORKING_DIRECTORY, file.getParent().toString());
 
         final List<BibEntry> finEntries = entries;
@@ -120,7 +120,7 @@
             public void update() {
                 // No error message. Report success:
                 if (errorMessage == null) {
-                    frame.output(Localization.lang("%0 export successful", format.getDisplayName()));
+                    frame.output(Localization.lang("%0 export successful", format.getName()));
                 }
                 // ... or show an error dialog:
                 else {
@@ -141,7 +141,7 @@
     private static FileDialogConfiguration createExportFileChooser(ExporterFactory exportFactory, String currentDir) {
         List<FileType> fileTypes = exportFactory.getExporters().stream().map(Exporter::getFileType).collect(Collectors.toList());
         return new FileDialogConfiguration.Builder()
-                .addExtensionFilters(fileTypes)
+                .addExtensionFilter(fileTypes.toArray(new FileType[fileTypes.size()]))
                 .withDefaultExtension(Globals.prefs.get(JabRefPreferences.LAST_USED_EXPORT))
                 .withInitialDirectory(currentDir)
                 .build();
