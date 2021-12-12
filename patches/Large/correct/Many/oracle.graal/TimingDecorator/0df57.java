diff --git a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TimingDecorator.java b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TimingDecorator.java
index 045eafa..5b61bd9 100644
--- a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TimingDecorator.java
+++ b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/TimingDecorator.java
@@ -34,7 +34,7 @@
     private long startTime;
     private long classStartTime;
 
-    public TimingDecorator(TruffleJUnitRunListener l) {
+    TimingDecorator(TruffleJUnitRunListener l) {
         super(l);
     }
 
