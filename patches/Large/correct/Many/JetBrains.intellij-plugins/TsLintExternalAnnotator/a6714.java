diff --git a/tslint/src/com/intellij/lang/javascript/linter/tslint/highlight/TsLintExternalAnnotator.java b/tslint/src/com/intellij/lang/javascript/linter/tslint/highlight/TsLintExternalAnnotator.java
index f7cd460..ca5a399 100644
--- a/tslint/src/com/intellij/lang/javascript/linter/tslint/highlight/TsLintExternalAnnotator.java
+++ b/tslint/src/com/intellij/lang/javascript/linter/tslint/highlight/TsLintExternalAnnotator.java
@@ -111,7 +111,8 @@
   public JSLinterAnnotationResult<TsLintState> annotate(@NotNull TsLinterInput collectedInfo) {
     VirtualFile config = collectedInfo.getConfig();
     final JSLinterFileLevelAnnotation interpreterAndPackageError =
-      JSLinterUtil.validateInterpreterAndPackage(collectedInfo.getProject(), TsLintDescriptor.PACKAGE_NAME, collectedInfo.getState());
+      JSLinterUtil.validateInterpreterAndPackage(collectedInfo.getProject(), TsLintDescriptor.PACKAGE_NAME, collectedInfo.getState(),
+                                                 collectedInfo.getVirtualFile());
     if (interpreterAndPackageError != null) return JSLinterAnnotationResult.create(collectedInfo, interpreterAndPackageError, config);
 
     TsLintLanguageService service = TsLintLanguageService.getService(collectedInfo.getProject());
