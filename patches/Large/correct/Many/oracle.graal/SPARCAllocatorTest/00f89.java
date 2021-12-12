diff --git a/graal/com.oracle.graal.compiler.sparc.test/src/com/oracle/graal/compiler/sparc/test/SPARCAllocatorTest.java b/graal/com.oracle.graal.compiler.sparc.test/src/com/oracle/graal/compiler/sparc/test/SPARCAllocatorTest.java
index c12edac..c1fd4ec 100644
--- a/graal/com.oracle.graal.compiler.sparc.test/src/com/oracle/graal/compiler/sparc/test/SPARCAllocatorTest.java
+++ b/graal/com.oracle.graal.compiler.sparc.test/src/com/oracle/graal/compiler/sparc/test/SPARCAllocatorTest.java
@@ -40,7 +40,7 @@
 
     @Test
     public void test1() {
-        testAllocation("test1snippet", 1, 0, 0);
+        testAllocation("test1snippet", 2, 0, 0);
     }
 
     public static long test1snippet(long x) {
@@ -49,7 +49,7 @@
 
     @Test
     public void test2() {
-        testAllocation("test2snippet", 1, 0, 0);
+        testAllocation("test2snippet", 2, 0, 0);
     }
 
     public static long test2snippet(long x) {
@@ -58,7 +58,7 @@
 
     @Test
     public void test3() {
-        testAllocation("test3snippet", 3, 0, 0);
+        testAllocation("test3snippet", 4, 0, 0);
     }
 
     public static long test3snippet(long x) {
