diff --git a/graal/com.oracle.graal.hotspot.aarch64/src/com/oracle/graal/hotspot/aarch64/AArch64HotSpotMove.java b/graal/com.oracle.graal.hotspot.aarch64/src/com/oracle/graal/hotspot/aarch64/AArch64HotSpotMove.java
index 9e61eed..512c5f8 100644
--- a/graal/com.oracle.graal.hotspot.aarch64/src/com/oracle/graal/hotspot/aarch64/AArch64HotSpotMove.java
+++ b/graal/com.oracle.graal.hotspot.aarch64/src/com/oracle/graal/hotspot/aarch64/AArch64HotSpotMove.java
@@ -165,7 +165,7 @@
                 assert encoding.shift == encoding.alignment || encoding.shift == 0;
                 masm.add(64, resultRegister, base, ptr, AArch64Assembler.ShiftType.LSL, encoding.shift);
             } else if (encoding.base == 0) {
-                masm.add(64, resultRegister, zr, resultRegister, AArch64Assembler.ShiftType.LSL, encoding.shift);
+                masm.add(64, resultRegister, zr, ptr, AArch64Assembler.ShiftType.LSL, encoding.shift);
             } else {
                 // if ptr is null it has to be null after decompression
                 Label done = new Label();
