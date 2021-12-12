diff --git a/compiler/src/org.graalvm.compiler.truffle.test/src/org/graalvm/compiler/truffle/test/TruffleBoundaryInliningTest.java b/compiler/src/org.graalvm.compiler.truffle.test/src/org/graalvm/compiler/truffle/test/TruffleBoundaryInliningTest.java
index c588280..d3d1dbb 100644
--- a/compiler/src/org.graalvm.compiler.truffle.test/src/org/graalvm/compiler/truffle/test/TruffleBoundaryInliningTest.java
+++ b/compiler/src/org.graalvm.compiler.truffle.test/src/org/graalvm/compiler/truffle/test/TruffleBoundaryInliningTest.java
@@ -85,7 +85,7 @@
         checkHasTestMethod(noInline);
 	}
 
-    private void checkHasTestMethod(StructuredGraph graph) {
+    private static void checkHasTestMethod(StructuredGraph graph) {
         Iterator<Invoke> invokes = graph.getInvokes().iterator();
         assertTrue(invokes.hasNext());
         assertTrue("testMethod".equals(invokes.next().getTargetMethod().getName()));
