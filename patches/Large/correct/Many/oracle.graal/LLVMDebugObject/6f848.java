diff --git a/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/debug/LLVMDebugObject.java b/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/debug/LLVMDebugObject.java
index fdcedbc..6be5289 100644
--- a/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/debug/LLVMDebugObject.java
+++ b/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/debug/LLVMDebugObject.java
@@ -238,7 +238,7 @@
                         return value.readUnsignedInteger(offset, size);
 
                     case UNSIGNED_CHAR:
-                        return (char) Byte.toUnsignedInt(value.readSignedInteger(offset, size).byteValue());
+                        return (char) Byte.toUnsignedInt(value.readUnsignedInteger(offset, size).byteValue());
                 }
             }
 
