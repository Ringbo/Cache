diff --git a/plugins/stream-debugger/src/test/java/com/intellij/debugger/streams/exec/TraceExecutionTestCase.java b/plugins/stream-debugger/src/test/java/com/intellij/debugger/streams/exec/TraceExecutionTestCase.java
index 76daf17..b7f2841 100644
--- a/plugins/stream-debugger/src/test/java/com/intellij/debugger/streams/exec/TraceExecutionTestCase.java
+++ b/plugins/stream-debugger/src/test/java/com/intellij/debugger/streams/exec/TraceExecutionTestCase.java
@@ -96,7 +96,7 @@
         });
 
         if (chain == null) {
-          complete(null, null, null, FailureReason.CHAIN_CONTRUCTION);
+          complete(null, null, null, FailureReason.CHAIN_CONSTRUCTION);
           return;
         }
 
@@ -281,6 +281,6 @@
   }
 
   protected enum FailureReason {
-    COMPILATION, EVALUATION, CHAIN_CONTRUCTION
+    COMPILATION, EVALUATION, CHAIN_CONSTRUCTION
   }
 }
