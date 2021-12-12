diff --git a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/MultiFileJvmBasicCompletionTestGenerated.java b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/MultiFileJvmBasicCompletionTestGenerated.java
index efadc05..2f33152 100644
--- a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/MultiFileJvmBasicCompletionTestGenerated.java
+++ b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/MultiFileJvmBasicCompletionTestGenerated.java
@@ -283,7 +283,7 @@
 
     @TestMetadata("ObjectMembers")
     public void testObjectMembers() throws Exception {
-        String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/multifile/ObjectMembers/");
+        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/multifile/ObjectMembers/");
         doTest(fileName);
     }
 
