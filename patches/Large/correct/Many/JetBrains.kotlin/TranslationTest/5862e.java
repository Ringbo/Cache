diff --git a/js/js.tests/test/org/jetbrains/k2js/test/TranslationTest.java b/js/js.tests/test/org/jetbrains/k2js/test/TranslationTest.java
index 07d7e13..dcb1215 100644
--- a/js/js.tests/test/org/jetbrains/k2js/test/TranslationTest.java
+++ b/js/js.tests/test/org/jetbrains/k2js/test/TranslationTest.java
@@ -42,7 +42,7 @@
  */
 public abstract class TranslationTest extends BaseTest {
 
-    private static final boolean DELETE_OUT = true;
+    private static final boolean DELETE_OUT = false;
     public static final String TEST_FILES = "js.translator/testFiles/";
     private static final String CASES = "cases/";
     private static final String OUT = "out/";
@@ -65,8 +65,7 @@
     @Override
     protected void setUp() throws Exception {
         super.setUp();
-        //noinspection PointlessBooleanExpression
-        if (!shouldCreateOut() || !DELETE_OUT) {
+        if (!shouldCreateOut()) {
             return;
         }
         File outDir = new File(getOutputPath());
@@ -80,7 +79,7 @@
     @Override
     protected void tearDown() throws Exception {
         super.tearDown();
-        if (!shouldCreateOut()) {
+        if (!shouldCreateOut() || !DELETE_OUT) {
             return;
         }
         File outDir = new File(getOutputPath());
