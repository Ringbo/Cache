diff --git a/tests/net/java/android/net/apf/ApfTest.java b/tests/net/java/android/net/apf/ApfTest.java
index 0248e97..9838020 100644
--- a/tests/net/java/android/net/apf/ApfTest.java
+++ b/tests/net/java/android/net/apf/ApfTest.java
@@ -314,9 +314,9 @@
 
         // Test multiply.
         gen = new ApfGenerator(MIN_APF_VERSION);
-        gen.addLoadImmediate(Register.R0, 1234567890);
+        gen.addLoadImmediate(Register.R0, 123456789);
         gen.addMul(2);
-        gen.addJumpIfR0Equals(1234567890 * 2, gen.DROP_LABEL);
+        gen.addJumpIfR0Equals(123456789 * 2, gen.DROP_LABEL);
         assertDrop(gen);
 
         // Test divide.
@@ -379,10 +379,10 @@
 
         // Test multiply.
         gen = new ApfGenerator(MIN_APF_VERSION);
-        gen.addLoadImmediate(Register.R0, 1234567890);
+        gen.addLoadImmediate(Register.R0, 123456789);
         gen.addLoadImmediate(Register.R1, 2);
         gen.addMulR1();
-        gen.addJumpIfR0Equals(1234567890 * 2, gen.DROP_LABEL);
+        gen.addJumpIfR0Equals(123456789 * 2, gen.DROP_LABEL);
         assertDrop(gen);
 
         // Test divide.
