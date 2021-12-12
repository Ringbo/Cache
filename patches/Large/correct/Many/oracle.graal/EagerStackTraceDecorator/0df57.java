diff --git a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/EagerStackTraceDecorator.java b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/EagerStackTraceDecorator.java
index dd9de83..f3b2cad 100644
--- a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/EagerStackTraceDecorator.java
+++ b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/EagerStackTraceDecorator.java
@@ -28,7 +28,7 @@
 
 class EagerStackTraceDecorator extends TruffleJUnitRunListenerDecorator {
 
-    public EagerStackTraceDecorator(TruffleJUnitRunListener l) {
+    EagerStackTraceDecorator(TruffleJUnitRunListener l) {
         super(l);
     }
 
