diff --git a/truffle/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/SourceSectionFilter.java b/truffle/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/SourceSectionFilter.java
index b53976c..c888cdf 100644
--- a/truffle/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/SourceSectionFilter.java
+++ b/truffle/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/SourceSectionFilter.java
@@ -714,7 +714,7 @@
 
         private final EventFilterExpression delegate;
 
-        public Not(EventFilterExpression delegate) {
+        Not(EventFilterExpression delegate) {
             this.delegate = delegate;
         }
 
