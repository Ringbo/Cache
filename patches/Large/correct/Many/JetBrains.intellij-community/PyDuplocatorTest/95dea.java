diff --git a/python/testSrc/com/jetbrains/python/PyDuplocatorTest.java b/python/testSrc/com/jetbrains/python/PyDuplocatorTest.java
index a39d517..b1fac5c 100644
--- a/python/testSrc/com/jetbrains/python/PyDuplocatorTest.java
+++ b/python/testSrc/com/jetbrains/python/PyDuplocatorTest.java
@@ -43,7 +43,7 @@
   public void testIgnoreStringLiteral() throws Exception {
     myDuplocatorSettings.DISTINGUISH_LITERALS = false;
     try {
-      doTest(2);
+      doTest(1);
     }
     finally {
       myDuplocatorSettings.DISTINGUISH_LITERALS = true;
