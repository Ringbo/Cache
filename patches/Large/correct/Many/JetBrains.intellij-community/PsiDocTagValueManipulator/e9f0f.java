diff --git a/source/com/intellij/psi/impl/source/resolve/reference/impl/manipulators/PsiDocTagValueManipulator.java b/source/com/intellij/psi/impl/source/resolve/reference/impl/manipulators/PsiDocTagValueManipulator.java
index 9ff53fe..cce53c3 100644
--- a/source/com/intellij/psi/impl/source/resolve/reference/impl/manipulators/PsiDocTagValueManipulator.java
+++ b/source/com/intellij/psi/impl/source/resolve/reference/impl/manipulators/PsiDocTagValueManipulator.java
@@ -16,7 +16,7 @@
 public class PsiDocTagValueManipulator extends AbstractElementManipulator<PsiDocTag> {
 
   public PsiDocTag handleContentChange(PsiDocTag tag, TextRange range, String newContent) throws IncorrectOperationException {
-    final StringBuffer replacement = new StringBuffer( tag.getText() );
+    final StringBuilder replacement = new StringBuilder( tag.getText() );
 
     replacement.replace(
       range.getStartOffset(),
