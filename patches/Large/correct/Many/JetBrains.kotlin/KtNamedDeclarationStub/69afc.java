diff --git a/compiler/frontend/src/org/jetbrains/kotlin/psi/KtNamedDeclarationStub.java b/compiler/frontend/src/org/jetbrains/kotlin/psi/KtNamedDeclarationStub.java
index 0cb3f4b..412f0e7 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/psi/KtNamedDeclarationStub.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/psi/KtNamedDeclarationStub.java
@@ -63,7 +63,7 @@
     @Override
     public Name getNameAsName() {
         String name = getName();
-        return name != null ? Name.guess(name) : null;
+        return name != null ? Name.identifier(name) : null;
     }
 
     @Override
