diff --git a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java
index 6b9c27b..63cae4d 100644
--- a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java
+++ b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java
@@ -734,7 +734,7 @@
 
   public boolean init(final boolean updateWholeFile, final PsiFile file) {
     if (!(file instanceof XmlFile))
-      return false;
+      return true;
     if (updateWholeFile) {
       final XmlRefCountHolder countHolder = XmlRefCountHolder.getInstance((XmlFile)file);
       countHolder.clear();
