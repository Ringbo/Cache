diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/api/FullIdentTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/api/FullIdentTest.java
index 63d4492..d3b5c76 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/api/FullIdentTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/api/FullIdentTest.java
@@ -24,7 +24,8 @@
 
 public class FullIdentTest {
 
-    public static void testToString() {
+    @Test
+    public void testToString() {
         final DetailAST ast = new DetailAST();
         ast.setType(TokenTypes.LITERAL_NEW);
         ast.setColumnNo(14);
