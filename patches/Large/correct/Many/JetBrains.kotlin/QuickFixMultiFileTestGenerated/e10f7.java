diff --git a/idea/tests/org/jetbrains/kotlin/idea/quickfix/QuickFixMultiFileTestGenerated.java b/idea/tests/org/jetbrains/kotlin/idea/quickfix/QuickFixMultiFileTestGenerated.java
index 90ffe5e..1b0e96b 100644
--- a/idea/tests/org/jetbrains/kotlin/idea/quickfix/QuickFixMultiFileTestGenerated.java
+++ b/idea/tests/org/jetbrains/kotlin/idea/quickfix/QuickFixMultiFileTestGenerated.java
@@ -175,13 +175,13 @@
 
         @TestMetadata("indexCallExtensionImportGetOnNoOperatorWarning.test")
         public void testIndexCallExtensionImportGetOnNoOperatorWarning() throws Exception {
-            String fileName = JetTestUtils.navigationMetadata("idea/testData/quickfix/autoImports/indexCallExtensionImportGetOnNoOperatorWarning.test");
+            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/quickfix/autoImports/indexCallExtensionImportGetOnNoOperatorWarning.test");
             doTestWithExtraFile(fileName);
         }
 
         @TestMetadata("indexCallExtensionImportSetOnNoOperatorWarning.test")
         public void testIndexCallExtensionImportSetOnNoOperatorWarning() throws Exception {
-            String fileName = JetTestUtils.navigationMetadata("idea/testData/quickfix/autoImports/indexCallExtensionImportSetOnNoOperatorWarning.test");
+            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/quickfix/autoImports/indexCallExtensionImportSetOnNoOperatorWarning.test");
             doTestWithExtraFile(fileName);
         }
 
