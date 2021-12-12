diff --git a/compiler/backend/src/org/jetbrains/kotlin/codegen/PackageCodegen.java b/compiler/backend/src/org/jetbrains/kotlin/codegen/PackageCodegen.java
index 31eda1f..6233b74 100644
--- a/compiler/backend/src/org/jetbrains/kotlin/codegen/PackageCodegen.java
+++ b/compiler/backend/src/org/jetbrains/kotlin/codegen/PackageCodegen.java
@@ -99,7 +99,7 @@
         List<KtClassOrObject> classOrObjects = new ArrayList<KtClassOrObject>();
 
         for (KtDeclaration declaration : file.getDeclarations()) {
-            if (declaration instanceof KtProperty || declaration instanceof KtNamedFunction) {
+            if (declaration instanceof KtProperty || declaration instanceof KtNamedFunction || declaration instanceof KtTypeAlias) {
                 generatePackagePart = true;
             }
             else if (declaration instanceof KtClassOrObject) {
