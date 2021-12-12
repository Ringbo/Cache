diff --git a/java/compiler/tests/com/intellij/compiler/artifacts/PackagingValidationTestCase.java b/java/compiler/tests/com/intellij/compiler/artifacts/PackagingValidationTestCase.java
index 9811b98..d477c04 100644
--- a/java/compiler/tests/com/intellij/compiler/artifacts/PackagingValidationTestCase.java
+++ b/java/compiler/tests/com/intellij/compiler/artifacts/PackagingValidationTestCase.java
@@ -38,7 +38,7 @@
       super(new MockPackagingEditorContext());
     }
 
-    public void registerError(@NotNull String message, @Nullable PackagingElement<?> place, @Nullable ArtifactProblemQuickFix quickFix) {
+    public void registerError(@NotNull String message, @Nullable List<PackagingElement<?>> pathToPlace, @Nullable ArtifactProblemQuickFix quickFix) {
       myProblems.add(message);
       if (quickFix != null) {
         myQuickFixes.put(message, quickFix);
