diff --git a/idea/tests/org/jetbrains/jet/completion/AbstractJavaWithLibCompletionTest.java b/idea/tests/org/jetbrains/jet/completion/AbstractJavaWithLibCompletionTest.java
index 1635a88..45a309a 100644
--- a/idea/tests/org/jetbrains/jet/completion/AbstractJavaWithLibCompletionTest.java
+++ b/idea/tests/org/jetbrains/jet/completion/AbstractJavaWithLibCompletionTest.java
@@ -31,7 +31,7 @@
         if (PluginTestCaseBase.isAllFilesPresentTest(getTestName(true))) {
             return super.getProjectDescriptor();
         }
-        return new JdkAndMockLibraryProjectDescriptor(TEST_PATH + "/" + getTestName(true) + "Src", false);
+        return new JdkAndMockLibraryProjectDescriptor(TEST_PATH + "/" + getTestName(false) + "Src", false);
     }
 
     @Override
