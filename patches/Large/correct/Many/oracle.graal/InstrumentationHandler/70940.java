diff --git a/truffle/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/InstrumentationHandler.java b/truffle/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/InstrumentationHandler.java
index 19ae4f2..20e25dc 100644
--- a/truffle/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/InstrumentationHandler.java
+++ b/truffle/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/InstrumentationHandler.java
@@ -333,7 +333,7 @@
         instrumenter.initialize();
     }
 
-    private static Collection<EventBinding<?>> filterBindingsForInstrumenter(Collection<EventBinding<?>> bindings, Instrumenter instrumenter) {
+    private static Collection<EventBinding<?>> filterBindingsForInstrumenter(Collection<EventBinding<?>> bindings, AbstractInstrumenter instrumenter) {
         if (bindings.isEmpty()) {
             return Collections.emptyList();
         }
