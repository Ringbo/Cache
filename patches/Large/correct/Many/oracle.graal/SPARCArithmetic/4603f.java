diff --git a/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCArithmetic.java b/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCArithmetic.java
index b7fda53..07242b0 100644
--- a/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCArithmetic.java
+++ b/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCArithmetic.java
@@ -738,7 +738,7 @@
                     new Sra(asIntReg(dst), 16, asIntReg(dst)).emit(masm);
                     break;
                 case I2F:
-                    if (src.getPlatformKind() == Kind.Int) {
+                    if (src.getPlatformKind() == Kind.Int || src.getPlatformKind() == Kind.Char || src.getPlatformKind() == Kind.Short || src.getPlatformKind() == Kind.Byte) {
                         new Movwtos(asIntReg(src), asFloatReg(dst)).emit(masm);
                         new Fitos(asFloatReg(dst), asFloatReg(dst)).emit(masm);
                     } else if (src.getPlatformKind() == Kind.Float) {
