diff --git a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/handlers/BasicCompletionHandlerTestGenerated.java b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/handlers/BasicCompletionHandlerTestGenerated.java
index 28e65ea..3384a34 100644
--- a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/handlers/BasicCompletionHandlerTestGenerated.java
+++ b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/handlers/BasicCompletionHandlerTestGenerated.java
@@ -145,13 +145,13 @@
 
     @TestMetadata("SuperMethod.kt")
     public void testSuperMethod() throws Exception {
-        String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/SuperMethod.kt");
+        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/SuperMethod.kt");
         doTest(fileName);
     }
 
     @TestMetadata("SuperMethod2.kt")
     public void testSuperMethod2() throws Exception {
-        String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/SuperMethod2.kt");
+        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/SuperMethod2.kt");
         doTest(fileName);
     }
 
