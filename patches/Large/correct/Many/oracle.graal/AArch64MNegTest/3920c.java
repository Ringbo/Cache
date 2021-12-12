diff --git a/compiler/src/org.graalvm.compiler.core.aarch64.test/src/org/graalvm/compiler/core/aarch64/test/AArch64MNegTest.java b/compiler/src/org.graalvm.compiler.core.aarch64.test/src/org/graalvm/compiler/core/aarch64/test/AArch64MNegTest.java
index d67f66e..dafafa8 100644
--- a/compiler/src/org.graalvm.compiler.core.aarch64.test/src/org/graalvm/compiler/core/aarch64/test/AArch64MNegTest.java
+++ b/compiler/src/org.graalvm.compiler.core.aarch64.test/src/org/graalvm/compiler/core/aarch64/test/AArch64MNegTest.java
@@ -55,7 +55,7 @@
     }
 
     public static int multiplyNegateInt(int x, int y) {
-        return mulNegInt(x, y) + mulZeroSubInt(y, x) + mulSubZeroInt(x, y);
+        return mulNegInt(x, y) | mulZeroSubInt(y, x) | mulSubZeroInt(x, y);
     }
 
     @Test
@@ -88,7 +88,7 @@
     }
 
     public static long multiplyNegateLong(long x, long y) {
-        return mulNegLong(x, y) + mulZeroSubLong(y, x) + mulSubZeroLong(x, y);
+        return mulNegLong(x, y) | mulZeroSubLong(y, x) | mulSubZeroLong(x, y);
     }
 
     @Test
