diff --git a/graal/com.oracle.graal.asm.amd64/src/com/oracle/graal/asm/amd64/AMD64Assembler.java b/graal/com.oracle.graal.asm.amd64/src/com/oracle/graal/asm/amd64/AMD64Assembler.java
index c93b42a..4be7c1f 100644
--- a/graal/com.oracle.graal.asm.amd64/src/com/oracle/graal/asm/amd64/AMD64Assembler.java
+++ b/graal/com.oracle.graal.asm.amd64/src/com/oracle/graal/asm/amd64/AMD64Assembler.java
@@ -1860,7 +1860,7 @@
     }
 
     public final void testl(AMD64Address dst, int imm32) {
-        prefixq(dst);
+        prefix(dst);
         emitByte(0xF7);
         emitOperandHelper(0, dst);
         emitInt(imm32);
