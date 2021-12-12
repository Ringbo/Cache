diff --git a/plugins/stream-debugger/src/test/java/com/intellij/debugger/streams/exec/TerminalOperationTest.java b/plugins/stream-debugger/src/test/java/com/intellij/debugger/streams/exec/TerminalOperationTest.java
index 6995cee..2b2af03 100644
--- a/plugins/stream-debugger/src/test/java/com/intellij/debugger/streams/exec/TerminalOperationTest.java
+++ b/plugins/stream-debugger/src/test/java/com/intellij/debugger/streams/exec/TerminalOperationTest.java
@@ -9,10 +9,10 @@
  */
 public class TerminalOperationTest extends TraceExecutionTestCase {
   public void testForEach() throws InterruptedException, ExecutionException, InvocationTargetException {
-    doTest(false);
+    doTest(true);
   }
 
   public void testForEachOrdered() throws InterruptedException, ExecutionException, InvocationTargetException {
-    doTest(false);
+    doTest(true);
   }
 }
