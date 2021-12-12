diff --git a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/GCAfterTestDecorator.java b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/GCAfterTestDecorator.java
index 9ea4bcd..d3caf62 100644
--- a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/GCAfterTestDecorator.java
+++ b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/GCAfterTestDecorator.java
@@ -28,7 +28,7 @@
 
 final class GCAfterTestDecorator extends TruffleJUnitRunListenerDecorator {
 
-    public GCAfterTestDecorator(TruffleJUnitRunListener l) {
+    GCAfterTestDecorator(TruffleJUnitRunListener l) {
         super(l);
     }
 
