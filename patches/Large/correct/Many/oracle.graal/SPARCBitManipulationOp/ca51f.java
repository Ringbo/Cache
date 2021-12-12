diff --git a/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCBitManipulationOp.java b/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCBitManipulationOp.java
index f676444..c08c394 100644
--- a/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCBitManipulationOp.java
+++ b/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCBitManipulationOp.java
@@ -99,7 +99,7 @@
                     assert !tmp.equals(dst);
                     new Srl(src, 1, tmp).emit(masm);
                     new Srl(src, 0, dst).emit(masm);
-                    new Or(src, tmp, dst).emit(masm);
+                    new Or(dst, tmp, dst).emit(masm);
                     new Srl(dst, 2, tmp).emit(masm);
                     new Or(dst, tmp, dst).emit(masm);
                     new Srl(dst, 4, tmp).emit(masm);
