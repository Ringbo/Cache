diff --git a/src/main/java/com/google/security/zynamics/reil/translators/x86/Helpers.java b/src/main/java/com/google/security/zynamics/reil/translators/x86/Helpers.java
index d9556c1..c1c5239 100644
--- a/src/main/java/com/google/security/zynamics/reil/translators/x86/Helpers.java
+++ b/src/main/java/com/google/security/zynamics/reil/translators/x86/Helpers.java
@@ -1784,7 +1784,7 @@
         resultSize, Helpers.PARITY_FLAG, resultSize, Helpers.PARITY_FLAG));
     // Mask off all but the 4 LSB of PARITY_FLAG.
     instructions.add(ReilHelpers.createAnd(offset + 3, resultSize, Helpers.PARITY_FLAG,
-        resultSize, String.valueOf(0xFFL), OperandSize.WORD, Helpers.PARITY_FLAG));
+        resultSize, String.valueOf(0xFL), OperandSize.WORD, Helpers.PARITY_FLAG));
     // For i = 0, ..., 15, the (16-i)-th rightmost bit of 0x9669 is the parity of i.
     // We set PARITY_FLAG = ((38505 << PARITY_FLAG) & (1 << 15)) >> 15.
     instructions.add(ReilHelpers.createBsh(offset + 4, OperandSize.WORD, String.valueOf(0x9669L),
