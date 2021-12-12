diff --git a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ConstantFunction.java b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ConstantFunction.java
index a09f624..3edad98 100644
--- a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ConstantFunction.java
+++ b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ConstantFunction.java
@@ -29,7 +29,7 @@
 final class ConstantFunction implements ObjectBinaryOperation {
     private final Object constant;
 
-    public ConstantFunction(Object constant) {
+    ConstantFunction(Object constant) {
         this.constant = constant;
     }
 
