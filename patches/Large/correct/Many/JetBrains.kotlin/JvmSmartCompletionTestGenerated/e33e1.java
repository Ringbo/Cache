diff --git a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmSmartCompletionTestGenerated.java b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmSmartCompletionTestGenerated.java
index 10e38ae..05be251 100644
--- a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmSmartCompletionTestGenerated.java
+++ b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmSmartCompletionTestGenerated.java
@@ -481,13 +481,13 @@
 
     @TestMetadata("SuperMembers.kt")
     public void testSuperMembers() throws Exception {
-        String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/smart/SuperMembers.kt");
+        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/smart/SuperMembers.kt");
         doTest(fileName);
     }
 
     @TestMetadata("SuperMembers2.kt")
     public void testSuperMembers2() throws Exception {
-        String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/smart/SuperMembers2.kt");
+        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/smart/SuperMembers2.kt");
         doTest(fileName);
     }
 
