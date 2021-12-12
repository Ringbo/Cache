diff --git a/java/java-tests/testSrc/com/intellij/codeInsight/daemon/lambda/OverloadResolutionTest.java b/java/java-tests/testSrc/com/intellij/codeInsight/daemon/lambda/OverloadResolutionTest.java
index 0a0e611..3ccc97d 100644
--- a/java/java-tests/testSrc/com/intellij/codeInsight/daemon/lambda/OverloadResolutionTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInsight/daemon/lambda/OverloadResolutionTest.java
@@ -49,7 +49,7 @@
 
   private void doTest(boolean warnings) {
     IdeaTestUtil.setTestVersion(JavaSdkVersion.JDK_1_8, getModule(), getTestRootDisposable());
-    doTestNewInference(BASE_PATH + "/" + getTestName(false) + ".java", warnings, false);
+    doTest(BASE_PATH + "/" + getTestName(false) + ".java", warnings, false);
   }
 
   @Override
