diff --git a/js/js.tests/test/org/jetbrains/kotlin/js/test/semantics/BoxJsTestGenerated.java b/js/js.tests/test/org/jetbrains/kotlin/js/test/semantics/BoxJsTestGenerated.java
index f407b9f..bea5386 100644
--- a/js/js.tests/test/org/jetbrains/kotlin/js/test/semantics/BoxJsTestGenerated.java
+++ b/js/js.tests/test/org/jetbrains/kotlin/js/test/semantics/BoxJsTestGenerated.java
@@ -782,7 +782,7 @@
     @RunWith(JUnit3RunnerWithInners.class)
     public static class CrossModuleRef extends AbstractBoxJsTest {
         public void testAllFilesPresentInCrossModuleRef() throws Exception {
-            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/box/crossModuleRef"), Pattern.compile("^([^_](.+))\\.kt$"), true);
+            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/box/crossModuleRef"), Pattern.compile("^([^_](.+))\\.kt$"), TargetBackend.ANY, true);
         }
 
         @TestMetadata("callableObjectRef.kt")
