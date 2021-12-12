diff --git a/graal/com.oracle.graal.compiler.ptx.test/src/com/oracle/graal/compiler/ptx/test/IntegerPTXTest.java b/graal/com.oracle.graal.compiler.ptx.test/src/com/oracle/graal/compiler/ptx/test/IntegerPTXTest.java
index 4b1fc41..e66ec1f 100644
--- a/graal/com.oracle.graal.compiler.ptx.test/src/com/oracle/graal/compiler/ptx/test/IntegerPTXTest.java
+++ b/graal/com.oracle.graal.compiler.ptx.test/src/com/oracle/graal/compiler/ptx/test/IntegerPTXTest.java
@@ -147,7 +147,7 @@
     @Test
     public void testIntConversion() {
         invoke(compile("testI2L"), 8);
-        invoke(compile("testL2I"), 12);
+        invoke(compile("testL2I"), 12L);
         invoke(compile("testI2C"), 65);
         invoke(compile("testI2B"), 9);
         invoke(compile("testI2F"), 17);
