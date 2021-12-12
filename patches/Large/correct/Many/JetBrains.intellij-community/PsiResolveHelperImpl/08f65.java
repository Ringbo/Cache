diff --git a/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/PsiResolveHelperImpl.java b/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/PsiResolveHelperImpl.java
index bf66293..a41ccca 100644
--- a/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/PsiResolveHelperImpl.java
+++ b/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/PsiResolveHelperImpl.java
@@ -114,7 +114,7 @@
                               @Nullable PsiElement currentFileResolveScope) {
     PsiClass containingClass = member.getContainingClass();
     boolean accessible = JavaResolveUtil.isAccessible(member, containingClass, modifierList, place, accessObjectClass, currentFileResolveScope);
-    if (accessible && member instanceof PsiClass) {
+    if (accessible && member instanceof PsiClass && !(member instanceof PsiTypeParameter)) {
       accessible = isAccessible(moduleSystem -> moduleSystem.isAccessible(((PsiClass)member), place));
     }
     return accessible;
