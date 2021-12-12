diff --git a/idea/tests/org/jetbrains/kotlin/idea/imports/OptimizeImportsTestGenerated.java b/idea/tests/org/jetbrains/kotlin/idea/imports/OptimizeImportsTestGenerated.java
index 2aa136f..fcef204 100644
--- a/idea/tests/org/jetbrains/kotlin/idea/imports/OptimizeImportsTestGenerated.java
+++ b/idea/tests/org/jetbrains/kotlin/idea/imports/OptimizeImportsTestGenerated.java
@@ -139,7 +139,7 @@
 
     @TestMetadata("KT9875.kt")
     public void testKT9875() throws Exception {
-        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/KT9875.kt");
+        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/KT9875.kt");
         doTest(fileName);
     }
 
