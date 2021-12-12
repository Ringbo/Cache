diff --git a/graal/com.oracle.graal.asm.aarch64/src/com/oracle/graal/asm/aarch64/AArch64MacroAssembler.java b/graal/com.oracle.graal.asm.aarch64/src/com/oracle/graal/asm/aarch64/AArch64MacroAssembler.java
index 1d002b9..4fca87c 100644
--- a/graal/com.oracle.graal.asm.aarch64/src/com/oracle/graal/asm/aarch64/AArch64MacroAssembler.java
+++ b/graal/com.oracle.graal.asm.aarch64/src/com/oracle/graal/asm/aarch64/AArch64MacroAssembler.java
@@ -603,13 +603,13 @@
      * dst = src + immediate.
      *
      * @param size register size. Has to be 32 or 64.
-     * @param dst general purpose register. May not be null or stackpointer.
-     * @param src general purpose register. May not be null or stackpointer.
+     * @param dst general purpose register. May not be null or zero-register.
+     * @param src general purpose register. May not be null or zero-register.
      * @param immediate 32-bit signed int
      */
     @Override
     public void add(int size, Register dst, Register src, int immediate) {
-        assert (!dst.equals(sp) && !src.equals(sp));
+        assert (!dst.equals(zr) && !src.equals(zr));
         if (immediate < 0) {
             sub(size, dst, src, -immediate);
         } else if (isAimm(immediate)) {
@@ -648,13 +648,13 @@
      * dst = src - immediate.
      *
      * @param size register size. Has to be 32 or 64.
-     * @param dst general purpose register. May not be null or stackpointer.
-     * @param src general purpose register. May not be null or stackpointer.
+     * @param dst general purpose register. May not be null or zero-register.
+     * @param src general purpose register. May not be null or zero-register.
      * @param immediate 32-bit signed int
      */
     @Override
     public void sub(int size, Register dst, Register src, int immediate) {
-        assert (!dst.equals(sp) && !src.equals(sp));
+        assert (!dst.equals(zr) && !src.equals(zr));
         if (immediate < 0) {
             add(size, dst, src, -immediate);
         } else if (isAimm(immediate)) {
