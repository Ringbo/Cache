diff --git a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/target/amd64/AMD64ConvertFIOpcode.java b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/target/amd64/AMD64ConvertFIOpcode.java
index c06629e..58a541d 100644
--- a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/target/amd64/AMD64ConvertFIOpcode.java
+++ b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/target/amd64/AMD64ConvertFIOpcode.java
@@ -55,7 +55,7 @@
                 break;
             case D2I:
                 masm.cvttsd2sil(asIntReg(result), asDoubleReg(input));
-                slowPath = new AMD64ConvertFSlowPath(masm, asIntReg(result), asFloatReg(input), true, false);
+                slowPath = new AMD64ConvertFSlowPath(masm, asIntReg(result), asDoubleReg(input), true, false);
                 break;
             default:
                 throw Util.shouldNotReachHere();
