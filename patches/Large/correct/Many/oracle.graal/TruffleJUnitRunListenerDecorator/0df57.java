diff --git a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleJUnitRunListenerDecorator.java b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleJUnitRunListenerDecorator.java
index fd52de7..34c7e79 100644
--- a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleJUnitRunListenerDecorator.java
+++ b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TruffleJUnitRunListenerDecorator.java
@@ -33,7 +33,7 @@
 
     private final TruffleJUnitRunListener l;
 
-    public TruffleJUnitRunListenerDecorator(TruffleJUnitRunListener l) {
+    TruffleJUnitRunListenerDecorator(TruffleJUnitRunListener l) {
         this.l = l;
     }
 
