diff --git a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/llvm/x86/LLVMX86_ConversionNode.java b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/llvm/x86/LLVMX86_ConversionNode.java
index 7b1b018..e52a436 100644
--- a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/llvm/x86/LLVMX86_ConversionNode.java
+++ b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/llvm/x86/LLVMX86_ConversionNode.java
@@ -104,7 +104,7 @@
                 CompilerDirectives.transferToInterpreter();
                 throw new AssertionError("expected a <2 x double> vector");
             }
-            return ((vector.getValue(0) < 0 ? 1 : 0) << 1) | (vector.getValue(1) < 0 ? 1 : 0);
+            return ((vector.getValue(1) < 0 ? 1 : 0) << 1) | (vector.getValue(0) < 0 ? 1 : 0);
         }
     }
 }
