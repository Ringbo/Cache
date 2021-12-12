diff --git a/truffle/src/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/InstrumentationHandler.java b/truffle/src/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/InstrumentationHandler.java
index d3114ea..e2eaa86 100644
--- a/truffle/src/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/InstrumentationHandler.java
+++ b/truffle/src/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/InstrumentationHandler.java
@@ -1526,7 +1526,7 @@
         public <T extends LoadSourceListener> EventBinding<T> attachLoadSourceListener(SourceSectionFilter filter, T listener, boolean includeExistingSources) {
             verifySourceOnly(filter);
             verifyFilter(filter);
-            return InstrumentationHandler.this.attachSourceListener(this, filter, listener, includeExistingSources);
+            return InstrumentationHandler.this.attachSourceListener(this, filter, listener, notifyLoaded);
         }
 
         @Override
