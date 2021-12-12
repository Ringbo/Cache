diff --git a/compiler/frontend/src/org/jetbrains/kotlin/psi/KtNamedDeclarationNotStubbed.java b/compiler/frontend/src/org/jetbrains/kotlin/psi/KtNamedDeclarationNotStubbed.java
index 9bc17a7..eeec600 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/psi/KtNamedDeclarationNotStubbed.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/psi/KtNamedDeclarationNotStubbed.java
@@ -48,7 +48,7 @@
     @Override
     public Name getNameAsName() {
         String name = getName();
-        return name != null ? Name.guess(name) : null;
+        return name != null ? Name.identifier(name) : null;
     }
 
     @Override
