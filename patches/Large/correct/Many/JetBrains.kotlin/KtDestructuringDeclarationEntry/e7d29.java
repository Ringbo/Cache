diff --git a/compiler/frontend/src/org/jetbrains/kotlin/psi/KtDestructuringDeclarationEntry.java b/compiler/frontend/src/org/jetbrains/kotlin/psi/KtDestructuringDeclarationEntry.java
index 3fe4458..5bbfb94 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/psi/KtDestructuringDeclarationEntry.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/psi/KtDestructuringDeclarationEntry.java
@@ -142,7 +142,7 @@
     @NotNull
     @Override
     public SearchScope getUseScope() {
-        KtElement enclosingBlock = KtPsiUtil.getEnclosingElementForLocalDeclaration(this, false);
+        KtElement enclosingBlock = KtPsiUtil.getEnclosingElementForLocalDeclaration(this, true);
         if (enclosingBlock != null) return new LocalSearchScope(enclosingBlock);
 
         return super.getUseScope();
