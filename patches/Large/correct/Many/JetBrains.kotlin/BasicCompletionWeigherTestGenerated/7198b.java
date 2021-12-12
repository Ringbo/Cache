diff --git a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/BasicCompletionWeigherTestGenerated.java b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/BasicCompletionWeigherTestGenerated.java
index 387f2b2..154cd22 100644
--- a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/BasicCompletionWeigherTestGenerated.java
+++ b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/weighers/BasicCompletionWeigherTestGenerated.java
@@ -157,7 +157,7 @@
 
     @TestMetadata("StaticMembers.kt")
     public void testStaticMembers() throws Exception {
-        String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/StaticMembers.kt");
+        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/StaticMembers.kt");
         doTest(fileName);
     }
 
