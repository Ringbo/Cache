diff --git a/codeInsight/impl/com/intellij/psi/AbstractQualifiedReference.java b/codeInsight/impl/com/intellij/psi/AbstractQualifiedReference.java
index 1a2baf9..5cb9fd0 100644
--- a/codeInsight/impl/com/intellij/psi/AbstractQualifiedReference.java
+++ b/codeInsight/impl/com/intellij/psi/AbstractQualifiedReference.java
@@ -151,7 +151,7 @@
   @NotNull
   protected abstract T parseReference(String newText);
 
-  protected final boolean isAccessible(final PsiElement element) {
+  protected boolean isAccessible(final PsiElement element) {
     if (element instanceof PsiMember) {
       final PsiMember member = (PsiMember)element;
       return ResolveUtil.isAccessible(member, member.getContainingClass(), member.getModifierList(), this, null, null);
@@ -209,7 +209,7 @@
   @NonNls
   public final String getReferenceName() {
     final PsiElement element = getReferenceNameElement();
-    return element == null ? null : element.getText();
+    return element == null ? null : element.getText().trim();
   }
 
   public final boolean isSoft() {
