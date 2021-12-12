diff --git a/java/java-tests/testSrc/com/intellij/lang/java/parser/declarationParsing/ClassParsingTest.java b/java/java-tests/testSrc/com/intellij/lang/java/parser/declarationParsing/ClassParsingTest.java
index 3acd5ad..9b5d635 100644
--- a/java/java-tests/testSrc/com/intellij/lang/java/parser/declarationParsing/ClassParsingTest.java
+++ b/java/java-tests/testSrc/com/intellij/lang/java/parser/declarationParsing/ClassParsingTest.java
@@ -32,7 +32,7 @@
   public void testEnumWithoutConstants() { doTest(true); }
   public void testEmptyImportList() { doTest(true); }
   public void testLongClass() { doTest(false); }
-  public void testIncompleteAnnotation() { doTestDefaultParser(true); }  // todo: fix
+  public void testIncompleteAnnotation() { doTest(true); }
 
   public void testExtraOpeningBraceInMethod() { doTestDefaultParser(true); }  // todo: fix
   public void testExtraClosingBraceInMethod() { doTest(true); }
