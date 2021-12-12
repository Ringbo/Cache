diff --git a/compiler/src/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/inlining/InliningTest.java b/compiler/src/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/inlining/InliningTest.java
index c2a5fda..d7ac143 100644
--- a/compiler/src/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/inlining/InliningTest.java
+++ b/compiler/src/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/inlining/InliningTest.java
@@ -204,15 +204,15 @@
         assertFewMethodInfopoints(assertNotInlined(getGraph("invokeOverriddenInterfaceMethodSnippet", true)));
     }
 
-    public void traceInliningTest() {
+    public static void traceInliningTest() {
         callTrivial();
     }
 
-    private void callTrivial() {
+    private static void callTrivial() {
         callNonTrivial();
     }
 
-    private double callNonTrivial() {
+    private static double callNonTrivial() {
         double x = 0.0;
         for (int i = 0; i < 10; i++) {
             x += i * 1.21;
@@ -231,8 +231,10 @@
         String inliningTree = graph.getInliningLog().formatAsTree(false);
         String expectedRegex =
                         "compilation of org.graalvm.compiler.core.test.inlining.InliningTest.traceInliningTest.*: \\R" +
-                        "  at org.graalvm.compiler.core.test.inlining.InliningTest.traceInliningTest.*: <GraphBuilderPhase> org.graalvm.compiler.core.test.inlining.InliningTest.callTrivial.*: inline method\\R" +
-                        "    at org.graalvm.compiler.core.test.inlining.InliningTest.callTrivial.*: <InliningPhase> org.graalvm.compiler.core.test.inlining.InliningTest.callNonTrivial.*: .*\\R";
+                        "  at .*org.graalvm.compiler.core.test.inlining.InliningTest.traceInliningTest.*: <GraphBuilderPhase> org.graalvm.compiler.core.test.inlining.InliningTest.callTrivial.*: yes, inline method\\R" +
+                        "    at .*org.graalvm.compiler.core.test.inlining.InliningTest.callTrivial.*: .*\\R" +
+                        "       ├──<GraphBuilderPhase> org.graalvm.compiler.core.test.inlining.InliningTest.callNonTrivial.*: .*(.*\\R)*" +
+                        "       └──<InliningPhase> org.graalvm.compiler.core.test.inlining.InliningTest.callNonTrivial.*: .*(.*\\R)*";
         Pattern expectedPattern = Pattern.compile(expectedRegex, Pattern.MULTILINE);
         Assert.assertTrue("Got: " + inliningTree, expectedPattern.matcher(inliningTree).matches());
     }
