diff --git a/compiler/tests/org/jetbrains/jet/lang/resolve/lazy/AbstractLazyResolveNamespaceComparingTest.java b/compiler/tests/org/jetbrains/jet/lang/resolve/lazy/AbstractLazyResolveNamespaceComparingTest.java
index f33defd..e3d514c 100644
--- a/compiler/tests/org/jetbrains/jet/lang/resolve/lazy/AbstractLazyResolveNamespaceComparingTest.java
+++ b/compiler/tests/org/jetbrains/jet/lang/resolve/lazy/AbstractLazyResolveNamespaceComparingTest.java
@@ -48,7 +48,7 @@
         InjectorForTopDownAnalyzerForJvm injector = createInjectorForTDA(module);
 
         List<JetFile> files = JetTestUtils
-                .createTestFiles(testFileName, FileUtil.loadFile(new File(testFileName)), new JetTestUtils.TestFileFactory<JetFile>() {
+                .createTestFiles(testFileName, FileUtil.loadFile(new File(testFileName), true), new JetTestUtils.TestFileFactory<JetFile>() {
                     @Override
                     public JetFile create(String fileName, String text) {
                         return JetPsiFactory.createFile(project, fileName, text);
