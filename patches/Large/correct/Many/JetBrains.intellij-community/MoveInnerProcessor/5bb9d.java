diff --git a/refactoring/impl/com/intellij/refactoring/move/moveInner/MoveInnerProcessor.java b/refactoring/impl/com/intellij/refactoring/move/moveInner/MoveInnerProcessor.java
index ed3aabd..9e368d5 100644
--- a/refactoring/impl/com/intellij/refactoring/move/moveInner/MoveInnerProcessor.java
+++ b/refactoring/impl/com/intellij/refactoring/move/moveInner/MoveInnerProcessor.java
@@ -265,7 +265,9 @@
 
       public void visitReferenceElement(PsiJavaCodeReferenceElement reference) {
         PsiElement resolved = reference.resolve();
-        if (resolved instanceof PsiMember && becomesInaccessible(((PsiMember)resolved))) {
+        if (resolved instanceof PsiMember &&
+            PsiTreeUtil.isAncestor(myOuterClass, resolved, true) &&
+            becomesInaccessible(((PsiMember)resolved))) {
           final PsiElement container = ConflictsUtil.getContainer(reference);
           HashSet<PsiElement> containerSet = reported.get(resolved);
           if (containerSet == null) {
@@ -282,7 +284,7 @@
         }
       }
 
-      private boolean becomesInaccessible(PsiModifierListOwner element) {
+      private boolean becomesInaccessible(PsiMember element) {
         final String visibilityModifier = VisibilityUtil.getVisibilityModifier(element.getModifierList());
         if (PsiModifier.PRIVATE.equals(visibilityModifier)) return true;
         if (PsiModifier.PUBLIC.equals(visibilityModifier)) return false;
