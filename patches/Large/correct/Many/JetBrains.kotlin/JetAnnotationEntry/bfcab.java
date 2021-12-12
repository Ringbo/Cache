diff --git a/compiler/frontend/src/org/jetbrains/kotlin/psi/JetAnnotationEntry.java b/compiler/frontend/src/org/jetbrains/kotlin/psi/JetAnnotationEntry.java
index ebba0e6..3397be9 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/psi/JetAnnotationEntry.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/psi/JetAnnotationEntry.java
@@ -113,7 +113,7 @@
         JetAnnotationUseSiteTarget target = getStubOrPsiChild(JetStubElementTypes.ANNOTATION_TARGET);
 
         if (target == null) {
-            PsiElement parent = getStubOrPsiParent();
+            PsiElement parent = getParentByStub();
             if (parent instanceof JetAnnotation) {
                 return ((JetAnnotation) parent).getUseSiteTarget();
             }
