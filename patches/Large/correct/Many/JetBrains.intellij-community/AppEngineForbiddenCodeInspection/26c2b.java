diff --git a/plugins/google-app-engine/source/com/intellij/appengine/inspections/AppEngineForbiddenCodeInspection.java b/plugins/google-app-engine/source/com/intellij/appengine/inspections/AppEngineForbiddenCodeInspection.java
index 293fec9..82502b5 100644
--- a/plugins/google-app-engine/source/com/intellij/appengine/inspections/AppEngineForbiddenCodeInspection.java
+++ b/plugins/google-app-engine/source/com/intellij/appengine/inspections/AppEngineForbiddenCodeInspection.java
@@ -47,7 +47,7 @@
     final ProjectFileIndex fileIndex = ProjectRootManager.getInstance(project).getFileIndex();
     final AppEngineSdkManager sdkManager = AppEngineSdkManager.getInstance();
     final List<ProblemDescriptor> problems = new ArrayList<ProblemDescriptor>();
-    file.accept(new JavaRecursiveElementWalkingVisitor() {
+    file.accept(new JavaRecursiveElementVisitor() {
       @Override
       public void visitDocComment(PsiDocComment comment) {
       }
