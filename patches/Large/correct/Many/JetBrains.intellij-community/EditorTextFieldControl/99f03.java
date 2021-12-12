diff --git a/source/com/intellij/util/xml/ui/EditorTextFieldControl.java b/source/com/intellij/util/xml/ui/EditorTextFieldControl.java
index fec94af..5ada84b 100644
--- a/source/com/intellij/util/xml/ui/EditorTextFieldControl.java
+++ b/source/com/intellij/util/xml/ui/EditorTextFieldControl.java
@@ -88,7 +88,7 @@
     file.addAnnotator(new Annotator() {
       public void annotate(PsiElement psiElement, AnnotationHolder holder) {
         final DomElement domElement = getDomElement();
-        if (!domElement.isValid()) return;
+        if (domElement == null || !domElement.isValid()) return;
         for (final DomElementProblemDescriptor problem : DomElementAnnotationsManager.getInstance(project).getProblems(domElement, true)) {
           holder.createErrorAnnotation(psiElement.getContainingFile(), problem.getDescriptionTemplate());
         }
