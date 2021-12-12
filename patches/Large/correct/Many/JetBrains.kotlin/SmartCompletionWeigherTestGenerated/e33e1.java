diff --git a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/SmartCompletionWeigherTestGenerated.java b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/SmartCompletionWeigherTestGenerated.java
index e434b15..4e4cbc6 100644
--- a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/SmartCompletionWeigherTestGenerated.java
+++ b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/SmartCompletionWeigherTestGenerated.java
@@ -235,7 +235,7 @@
 
     @TestMetadata("SuperMembers.kt")
     public void testSuperMembers() throws Exception {
-        String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/smart/SuperMembers.kt");
+        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/smart/SuperMembers.kt");
         doTest(fileName);
     }
 }
