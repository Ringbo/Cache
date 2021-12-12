diff --git a/truffle/com.oracle.truffle.api.instrumentation.test/src/com/oracle/truffle/api/instrumentation/examples/DebuggerExample.java b/truffle/com.oracle.truffle.api.instrumentation.test/src/com/oracle/truffle/api/instrumentation/examples/DebuggerExample.java
index bd60075..2cc12c4 100644
--- a/truffle/com.oracle.truffle.api.instrumentation.test/src/com/oracle/truffle/api/instrumentation/examples/DebuggerExample.java
+++ b/truffle/com.oracle.truffle.api.instrumentation.test/src/com/oracle/truffle/api/instrumentation/examples/DebuggerExample.java
@@ -62,7 +62,7 @@
         private EventBinding<?> stepping;
         private Callback currentStatementCallback;
 
-        public Controller(Instrumenter instrumenter) {
+        Controller(Instrumenter instrumenter) {
             this.instrumenter = instrumenter;
         }
 
