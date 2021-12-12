diff --git a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/handlers/BasicCompletionHandlerTestGenerated.java b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/handlers/BasicCompletionHandlerTestGenerated.java
index 60f9b47..8e1518e 100644
--- a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/handlers/BasicCompletionHandlerTestGenerated.java
+++ b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/handlers/BasicCompletionHandlerTestGenerated.java
@@ -535,30 +535,30 @@
     @RunWith(JUnit3RunnerWithInners.class)
     public static class StaticMembers extends AbstractBasicCompletionHandlerTest {
         public void testAllFilesPresentInStaticMembers() throws Exception {
-            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/handlers/basic/staticMembers"), Pattern.compile("^(.+)\\.kt$"), true);
+            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/handlers/basic/staticMembers"), Pattern.compile("^(.+)\\.kt$"), true);
         }
 
         @TestMetadata("classObjectMethod.kt")
         public void testClassObjectMethod() throws Exception {
-            String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/staticMembers/classObjectMethod.kt");
+            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/staticMembers/classObjectMethod.kt");
             doTest(fileName);
         }
 
         @TestMetadata("ImportFromCompanionObject.kt")
         public void testImportFromCompanionObject() throws Exception {
-            String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/staticMembers/ImportFromCompanionObject.kt");
+            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/staticMembers/ImportFromCompanionObject.kt");
             doTest(fileName);
         }
 
         @TestMetadata("ImportJavaStaticMethod.kt")
         public void testImportJavaStaticMethod() throws Exception {
-            String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/staticMembers/ImportJavaStaticMethod.kt");
+            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/staticMembers/ImportJavaStaticMethod.kt");
             doTest(fileName);
         }
 
         @TestMetadata("JavaStaticMethod.kt")
         public void testJavaStaticMethod() throws Exception {
-            String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/staticMembers/JavaStaticMethod.kt");
+            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/handlers/basic/staticMembers/JavaStaticMethod.kt");
             doTest(fileName);
         }
     }
