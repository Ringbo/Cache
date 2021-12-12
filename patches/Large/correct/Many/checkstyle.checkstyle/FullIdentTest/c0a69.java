diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/api/FullIdentTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/api/FullIdentTest.java
index df00707..e700bb2 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/api/FullIdentTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/api/FullIdentTest.java
@@ -24,7 +24,7 @@
 
 public class FullIdentTest {
 
-    public void testToString() {
+    public static void testToString() {
         DetailAST ast = new DetailAST();
         ast.setType(TokenTypes.LITERAL_NEW);
         ast.setColumnNo(14);
