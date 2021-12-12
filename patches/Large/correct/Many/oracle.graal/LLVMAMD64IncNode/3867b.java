diff --git a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/asm/LLVMAMD64IncNode.java b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/asm/LLVMAMD64IncNode.java
index da59778..e3de24e 100644
--- a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/asm/LLVMAMD64IncNode.java
+++ b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/asm/LLVMAMD64IncNode.java
@@ -51,7 +51,7 @@
         @Specialization
         protected byte executeI16(VirtualFrame frame, byte value) {
             byte result = (byte) (value + 1);
-            boolean of = result == Byte.MAX_VALUE;
+            boolean of = value == Byte.MAX_VALUE;
             flags.execute(frame, of, result);
             return result;
         }
@@ -65,7 +65,7 @@
         @Specialization
         protected short executeI16(VirtualFrame frame, short value) {
             short result = (short) (value + 1);
-            boolean of = result == Short.MAX_VALUE;
+            boolean of = value == Short.MAX_VALUE;
             flags.execute(frame, of, result);
             return result;
         }
@@ -79,7 +79,7 @@
         @Specialization
         protected int executeI32(VirtualFrame frame, int value) {
             int result = value + 1;
-            boolean of = result == Integer.MAX_VALUE;
+            boolean of = value == Integer.MAX_VALUE;
             flags.execute(frame, of, result);
             return result;
         }
@@ -93,7 +93,7 @@
         @Specialization
         protected long executeI64(VirtualFrame frame, long value) {
             long result = value + 1;
-            boolean of = result == Long.MAX_VALUE;
+            boolean of = value == Long.MAX_VALUE;
             flags.execute(frame, of, result);
             return result;
         }
