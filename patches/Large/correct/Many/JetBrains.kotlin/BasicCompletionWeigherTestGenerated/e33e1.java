diff --git a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/BasicCompletionWeigherTestGenerated.java b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/BasicCompletionWeigherTestGenerated.java
index b27e97c..b7c73e7 100644
--- a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/BasicCompletionWeigherTestGenerated.java
+++ b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/BasicCompletionWeigherTestGenerated.java
@@ -49,7 +49,7 @@
 
     @TestMetadata("DelegateToOtherObject.kt")
     public void testDelegateToOtherObject() throws Exception {
-        String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/DelegateToOtherObject.kt");
+        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/DelegateToOtherObject.kt");
         doTest(fileName);
     }
 
@@ -151,7 +151,7 @@
 
     @TestMetadata("SuperMembers.kt")
     public void testSuperMembers() throws Exception {
-        String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/SuperMembers.kt");
+        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/SuperMembers.kt");
         doTest(fileName);
     }
 
