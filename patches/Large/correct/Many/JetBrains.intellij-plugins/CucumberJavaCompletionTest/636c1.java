diff --git a/cucumber-java/test/org/jetbrains/plugins/cucumber/java/completion/CucumberJavaCompletionTest.java b/cucumber-java/test/org/jetbrains/plugins/cucumber/java/completion/CucumberJavaCompletionTest.java
index dd71735..4b3f614 100644
--- a/cucumber-java/test/org/jetbrains/plugins/cucumber/java/completion/CucumberJavaCompletionTest.java
+++ b/cucumber-java/test/org/jetbrains/plugins/cucumber/java/completion/CucumberJavaCompletionTest.java
@@ -33,7 +33,7 @@
 
   private void doTestVariants() throws Throwable {
     myFixture.copyDirectoryToProject(getTestName(true), "");
-    myCompletionTester.doTestVariantsInner(getTestName(false) + File.separator + getTestName(false) + ".feature", GherkinFileType.INSTANCE);
+    myCompletionTester.doTestVariantsInner(getTestName(true) + File.separator + getTestName(true) + ".feature", GherkinFileType.INSTANCE);
   }
 
   @Override
