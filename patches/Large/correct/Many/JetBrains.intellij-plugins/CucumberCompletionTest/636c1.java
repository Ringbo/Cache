diff --git a/cucumber/test/org/jetbrains/plugins/cucumber/CucumberCompletionTest.java b/cucumber/test/org/jetbrains/plugins/cucumber/CucumberCompletionTest.java
index 278c32e..babcc84 100644
--- a/cucumber/test/org/jetbrains/plugins/cucumber/CucumberCompletionTest.java
+++ b/cucumber/test/org/jetbrains/plugins/cucumber/CucumberCompletionTest.java
@@ -17,7 +17,7 @@
   }
 
   private void doTestVariants() throws Throwable {
-    myCompletionTester.doTestVariantsInner(getTestName(false) + ".feature", GherkinFileType.INSTANCE);
+    myCompletionTester.doTestVariantsInner(getTestName(true) + ".feature", GherkinFileType.INSTANCE);
   }
 
   @Override
