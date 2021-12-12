diff --git a/camel-core/src/main/java/org/apache/camel/processor/interceptor/Tracer.java b/camel-core/src/main/java/org/apache/camel/processor/interceptor/Tracer.java
index 432a572..36d784e 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/interceptor/Tracer.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/interceptor/Tracer.java
@@ -324,7 +324,7 @@
      * Remove the given tracehandler
      */
     public void removeTraceHandler(TraceEventHandler traceHandler) {
-        this.traceHandlers.add(traceHandler);
+        this.traceHandlers.remove(traceHandler);
     }
 
     public String getJpaTraceEventMessageClassName() {
