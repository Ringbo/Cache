diff --git a/java/java-tests/testSrc/com/intellij/openapi/roots/impl/DirectoryIndexForExcludePatternsTest.java b/java/java-tests/testSrc/com/intellij/openapi/roots/impl/DirectoryIndexForExcludePatternsTest.java
index 92023d9..70f56aa 100644
--- a/java/java-tests/testSrc/com/intellij/openapi/roots/impl/DirectoryIndexForExcludePatternsTest.java
+++ b/java/java-tests/testSrc/com/intellij/openapi/roots/impl/DirectoryIndexForExcludePatternsTest.java
@@ -216,7 +216,7 @@
         @Override
         public Collection<SyntheticLibrary> getAdditionalProjectLibraries(@NotNull Project project) {
           return myProject == project ? Collections.singletonList(
-            SyntheticLibrary.newImmutableLibrary(Collections.emptySet(), Collections.singleton(root), Collections.emptySet(), excludePattern)
+            SyntheticLibrary.newImmutableLibrary(Collections.singleton(root), Collections.emptySet(), Collections.emptySet(), excludePattern)
           ) : Collections.emptyList();
         }
       }, getTestRootDisposable()), false, true));
