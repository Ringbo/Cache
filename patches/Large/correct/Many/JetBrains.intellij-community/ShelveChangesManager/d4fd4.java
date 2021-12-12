diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java
index 647a28e..474980a 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java
@@ -666,7 +666,7 @@
 
   // todo problem: control usage
   public static List<TextFilePatch> loadPatches(Project project, final String patchPath, CommitContext commitContext) throws IOException, PatchSyntaxException {
-    char[] text = FileUtil.loadFileText(new File(patchPath));
+    char[] text = FileUtil.loadFileText(new File(patchPath), CharsetToolkit.UTF8);
     PatchReader reader = new PatchReader(new CharArrayCharSequence(text));
     final List<TextFilePatch> textFilePatches = reader.readAllPatches();
     final TransparentlyFailedValue<Map<String, Map<String, CharSequence>>, PatchSyntaxException> additionalInfo = reader.getAdditionalInfo(
