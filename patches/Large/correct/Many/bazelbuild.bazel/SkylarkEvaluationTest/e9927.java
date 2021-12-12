diff --git a/src/test/java/com/google/devtools/build/lib/syntax/SkylarkEvaluationTest.java b/src/test/java/com/google/devtools/build/lib/syntax/SkylarkEvaluationTest.java
index 2f9742c..34edf9e 100644
--- a/src/test/java/com/google/devtools/build/lib/syntax/SkylarkEvaluationTest.java
+++ b/src/test/java/com/google/devtools/build/lib/syntax/SkylarkEvaluationTest.java
@@ -1115,7 +1115,7 @@
 
   @Test
   public void testPlusEqualsOnDict() throws Exception {
-    new SkylarkTest().setUp("def func():",
+    new SkylarkTest("--incompatible_disallow_dict_plus=false").setUp("def func():",
         "  d = {'a' : 1}",
         "  d += {'b' : 2}",
         "  return d",
