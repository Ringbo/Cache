diff --git a/idea/tests/org/jetbrains/jet/plugin/libraries/NavigateToStdlibSourceRegressionTest.java b/idea/tests/org/jetbrains/jet/plugin/libraries/NavigateToStdlibSourceRegressionTest.java
index 8f9283f..b104297 100644
--- a/idea/tests/org/jetbrains/jet/plugin/libraries/NavigateToStdlibSourceRegressionTest.java
+++ b/idea/tests/org/jetbrains/jet/plugin/libraries/NavigateToStdlibSourceRegressionTest.java
@@ -43,7 +43,7 @@
     }
 
     public void testJavaClass() throws IOException {
-        doNavigationInSourcesTest("libraries/stdlib/src/kotlin/collections/Maps.kt", "Collections", "java.util.Collections");
+        doNavigationInSourcesTest("libraries/stdlib/src/kotlin/collections/Iterators.kt", "Enumeration", "java.util.Enumeration");
     }
 
     public void testKotlinClass() throws IOException {
@@ -68,7 +68,7 @@
         PsiFile psiFile = getPsiFileForFileFromSources(file);
         String text = psiFile.getText();
         int index = text.indexOf(element);
-        assertNotSame(-1, "Cannot find text '" + element + "' in file " + path);
+        assertNotSame("Cannot find text '" + element + "' in file " + path, -1, index);
         while (Character.isLetter(text.charAt(index - 1))) {
             index = text.indexOf(element, index + 1);
         }
