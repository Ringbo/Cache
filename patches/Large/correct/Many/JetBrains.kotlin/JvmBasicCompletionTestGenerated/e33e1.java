diff --git a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmBasicCompletionTestGenerated.java b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmBasicCompletionTestGenerated.java
index d417874..41856e8 100644
--- a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmBasicCompletionTestGenerated.java
+++ b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmBasicCompletionTestGenerated.java
@@ -633,7 +633,7 @@
 
         @TestMetadata("QualifiedSuperMembers.kt")
         public void testQualifiedSuperMembers() throws Exception {
-            String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/QualifiedSuperMembers.kt");
+            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/QualifiedSuperMembers.kt");
             doTest(fileName);
         }
 
@@ -693,25 +693,25 @@
 
         @TestMetadata("SuperMembers.kt")
         public void testSuperMembers() throws Exception {
-            String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/SuperMembers.kt");
+            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/SuperMembers.kt");
             doTest(fileName);
         }
 
         @TestMetadata("SuperMembers2.kt")
         public void testSuperMembers2() throws Exception {
-            String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/SuperMembers2.kt");
+            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/SuperMembers2.kt");
             doTest(fileName);
         }
 
         @TestMetadata("SuperMembers3.kt")
         public void testSuperMembers3() throws Exception {
-            String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/SuperMembers3.kt");
+            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/SuperMembers3.kt");
             doTest(fileName);
         }
 
         @TestMetadata("SuperMembers4.kt")
         public void testSuperMembers4() throws Exception {
-            String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/SuperMembers4.kt");
+            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/SuperMembers4.kt");
             doTest(fileName);
         }
 
