diff --git a/src/main/java/org/jabref/logic/pdf/EntryAnnotationImporter.java b/src/main/java/org/jabref/logic/pdf/EntryAnnotationImporter.java
index 981b943..37aff75 100644
--- a/src/main/java/org/jabref/logic/pdf/EntryAnnotationImporter.java
+++ b/src/main/java/org/jabref/logic/pdf/EntryAnnotationImporter.java
@@ -57,7 +57,7 @@
         for (ParsedFileField parsedFileField : this.getFilteredFileList()) {
             Optional<File> expandedFileName = FileUtil.expandFilename(databaseContext, parsedFileField.getLink(),
                     JabRefPreferences.getInstance().getFileDirectoryPreferences());
-            expandedFileName.ifPresent(file -> annotations.put(file.toString(), importer.importAnnotations(file.toPath())));
+            expandedFileName.ifPresent(file -> annotations.put(file.getName(), importer.importAnnotations(file.toPath())));
         }
         return annotations;
     }
