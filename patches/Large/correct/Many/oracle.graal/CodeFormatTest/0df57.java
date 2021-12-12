diff --git a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/CodeFormatTest.java b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/CodeFormatTest.java
index 1fb5f54..a5e3998 100644
--- a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/CodeFormatTest.java
+++ b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/CodeFormatTest.java
@@ -41,7 +41,7 @@
 
     abstract static class LineWrappingTest extends ValueNode {
 
-        public LineWrappingTest() {
+        LineWrappingTest() {
         }
 
         protected static boolean guardWithaReeeeeeeeaaaaaaaaaaalllllllllyyyyyyyyLLLLLLLLLLLLLoooooooonnnnnnngggggggName1() {
