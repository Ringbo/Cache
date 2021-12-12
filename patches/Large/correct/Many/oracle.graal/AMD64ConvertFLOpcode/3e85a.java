diff --git a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/target/amd64/AMD64ConvertFLOpcode.java b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/target/amd64/AMD64ConvertFLOpcode.java
index c2f914b..1e2f4e4 100644
--- a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/target/amd64/AMD64ConvertFLOpcode.java
+++ b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/target/amd64/AMD64ConvertFLOpcode.java
@@ -52,11 +52,11 @@
         switch (this) {
             case F2L:
                 masm.cvttss2siq(asLongReg(result), asFloatReg(input));
-                slowPath = new AMD64ConvertFSlowPath(masm, asIntReg(result), asFloatReg(input), false, true);
+                slowPath = new AMD64ConvertFSlowPath(masm, asLongReg(result), asFloatReg(input), false, true);
                 break;
             case D2L:
                 masm.cvttsd2siq(asLongReg(result), asDoubleReg(input));
-                slowPath = new AMD64ConvertFSlowPath(masm, asIntReg(result), asFloatReg(input), true, true);
+                slowPath = new AMD64ConvertFSlowPath(masm, asLongReg(result), asDoubleReg(input), true, true);
                 break;
             default:
                 throw Util.shouldNotReachHere();
