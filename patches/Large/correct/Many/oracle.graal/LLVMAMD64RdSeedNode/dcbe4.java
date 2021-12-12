diff --git a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/asm/LLVMAMD64RdSeedNode.java b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/asm/LLVMAMD64RdSeedNode.java
index 26b8005..ee9feb6 100644
--- a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/asm/LLVMAMD64RdSeedNode.java
+++ b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/asm/LLVMAMD64RdSeedNode.java
@@ -59,8 +59,8 @@
     @TruffleBoundary
     protected long getSeedI64() {
         byte[] seed = rng.generateSeed(8);
-        return Byte.toUnsignedInt(seed[0]) << 56 | Byte.toUnsignedInt(seed[1]) << 48 | Byte.toUnsignedInt(seed[2]) << 40 | Byte.toUnsignedInt(seed[3]) << 32 | Byte.toUnsignedInt(seed[4]) << 24 |
-                        Byte.toUnsignedInt(seed[5]) << 16 | Byte.toUnsignedInt(seed[6]) << 8 | Byte.toUnsignedInt(seed[7]);
+        return Byte.toUnsignedLong(seed[0]) << 56 | Byte.toUnsignedLong(seed[1]) << 48 | Byte.toUnsignedLong(seed[2]) << 40 | Byte.toUnsignedLong(seed[3]) << 32 | Byte.toUnsignedLong(seed[4]) << 24 |
+                        Byte.toUnsignedLong(seed[5]) << 16 | Byte.toUnsignedLong(seed[6]) << 8 | Byte.toUnsignedLong(seed[7]);
     }
 
     public LLVMAMD64RdSeedNode(LLVMAMD64WriteBooleanNode cf) {
