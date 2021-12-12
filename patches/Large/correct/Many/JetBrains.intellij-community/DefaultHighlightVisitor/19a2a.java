diff --git a/lang-impl/src/com/intellij/codeInsight/daemon/impl/analysis/DefaultHighlightVisitor.java b/lang-impl/src/com/intellij/codeInsight/daemon/impl/analysis/DefaultHighlightVisitor.java
index 203f0c9..b782972 100644
--- a/lang-impl/src/com/intellij/codeInsight/daemon/impl/analysis/DefaultHighlightVisitor.java
+++ b/lang-impl/src/com/intellij/codeInsight/daemon/impl/analysis/DefaultHighlightVisitor.java
@@ -37,7 +37,7 @@
     return true;
   }
 
-  public void visit(final PsiElement element, final HighlightInfoHolder holder) {
+  public synchronized void visit(final PsiElement element, final HighlightInfoHolder holder) {
     myHolder = holder;
     assert !myAnnotationHolder.hasAnnotations() : myAnnotationHolder;
     element.accept(this);
