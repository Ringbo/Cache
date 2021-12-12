diff --git a/graal/com.oracle.graal.compiler.ptx/src/com/oracle/graal/compiler/ptx/PTXLIRGenerator.java b/graal/com.oracle.graal.compiler.ptx/src/com/oracle/graal/compiler/ptx/PTXLIRGenerator.java
index 37cfe0a..ba73085 100644
--- a/graal/com.oracle.graal.compiler.ptx/src/com/oracle/graal/compiler/ptx/PTXLIRGenerator.java
+++ b/graal/com.oracle.graal.compiler.ptx/src/com/oracle/graal/compiler/ptx/PTXLIRGenerator.java
@@ -838,7 +838,7 @@
             // Store result in global memory whose location is loadVar
             emitStoreReturnValue(operand.getKind(), loadVar, operand, null);
         }
-        append(new ReturnOp(operand));
+        emitReturnNoVal();
     }
 
     void emitReturnNoVal() {
