diff --git a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmBasicCompletionTestGenerated.java b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmBasicCompletionTestGenerated.java
index 14887ff..717f1f8 100644
--- a/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmBasicCompletionTestGenerated.java
+++ b/idea/idea-completion/tests/org/jetbrains/kotlin/idea/completion/test/JvmBasicCompletionTestGenerated.java
@@ -2100,48 +2100,48 @@
         @RunWith(JUnit3RunnerWithInners.class)
         public static class StaticMembers extends AbstractJvmBasicCompletionTest {
             public void testAllFilesPresentInStaticMembers() throws Exception {
-                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/basic/common/staticMembers"), Pattern.compile("^(.+)\\.kt$"), true);
+                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/basic/common/staticMembers"), Pattern.compile("^(.+)\\.kt$"), true);
             }
 
             @TestMetadata("ImportsFromObjectNoDuplicates.kt")
             public void testImportsFromObjectNoDuplicates() throws Exception {
-                String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/ImportsFromObjectNoDuplicates.kt");
+                String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/ImportsFromObjectNoDuplicates.kt");
                 doTest(fileName);
             }
 
             @TestMetadata("JavaStaticFields.kt")
             public void testJavaStaticFields() throws Exception {
-                String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticFields.kt");
+                String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticFields.kt");
                 doTest(fileName);
             }
 
             @TestMetadata("JavaStaticFieldsFromImports.kt")
             public void testJavaStaticFieldsFromImports() throws Exception {
-                String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticFieldsFromImports.kt");
+                String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticFieldsFromImports.kt");
                 doTest(fileName);
             }
 
             @TestMetadata("JavaStaticMethods.kt")
             public void testJavaStaticMethods() throws Exception {
-                String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticMethods.kt");
+                String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticMethods.kt");
                 doTest(fileName);
             }
 
             @TestMetadata("JavaStaticMethodsFromImports.kt")
             public void testJavaStaticMethodsFromImports() throws Exception {
-                String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticMethodsFromImports.kt");
+                String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticMethodsFromImports.kt");
                 doTest(fileName);
             }
 
             @TestMetadata("JavaStaticMethodsNoDuplicates.kt")
             public void testJavaStaticMethodsNoDuplicates() throws Exception {
-                String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticMethodsNoDuplicates.kt");
+                String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticMethodsNoDuplicates.kt");
                 doTest(fileName);
             }
 
             @TestMetadata("JavaStaticMethodsNoDuplicatesFromBases.kt")
             public void testJavaStaticMethodsNoDuplicatesFromBases() throws Exception {
-                String fileName = JetTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticMethodsNoDuplicatesFromBases.kt");
+                String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/basic/common/staticMembers/JavaStaticMethodsNoDuplicatesFromBases.kt");
                 doTest(fileName);
             }
         }
