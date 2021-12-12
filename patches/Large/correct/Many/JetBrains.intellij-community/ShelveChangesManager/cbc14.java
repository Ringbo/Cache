diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java
index be20b3f..5b0e536 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java
@@ -204,7 +204,7 @@
       myFileProcessor.savePathFile(
         new CompoundShelfFileProcessor.ContentProvider(){
             public void writeContentTo(final Writer writer) throws IOException {
-              UnifiedDiffWriter.write(patches, writer, "\n", patchTransitExtensions);
+              UnifiedDiffWriter.write(myProject, patches, writer, "\n", patchTransitExtensions);
             }
           },
           patchPath);
