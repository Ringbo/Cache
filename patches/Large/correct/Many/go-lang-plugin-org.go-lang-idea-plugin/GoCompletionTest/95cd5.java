diff --git a/tests/com/goide/completion/GoCompletionTest.java b/tests/com/goide/completion/GoCompletionTest.java
index efe84e6..8dca533 100644
--- a/tests/com/goide/completion/GoCompletionTest.java
+++ b/tests/com/goide/completion/GoCompletionTest.java
@@ -202,17 +202,17 @@
 
   public void testBlockKeywords() {
     myFixture.testCompletionVariants(getTestName(true) + ".go", "for", "const", "var", "return", "if", "switch", "go", "defer", "select",
-                                     "fallthrough", "goto", "main", "struct", "map");
+                                     "fallthrough", "goto", "main", "struct", "map", "type");
   }
 
   public void testBlockKeywordsInsideOneLineFunction() {
     myFixture.testCompletionVariants(getTestName(true) + ".go", "for", "const", "var", "return", "if", "switch", "go", "defer", "select",
-                                     "fallthrough", "goto", "main", "struct", "map");
+                                     "fallthrough", "goto", "main", "struct", "map", "type");
   }
 
   public void testBlockKeywordsInsideCaseStatement() {
     myFixture.testCompletionVariants(getTestName(true) + ".go", "for", "const", "var", "return", "if", "switch", "go", "defer", "select",
-                                     "fallthrough", "goto", "main", "struct", "map", "case", "default");
+                                     "fallthrough", "goto", "main", "struct", "map", "case", "default", "type");
   }
 
   public void testAddSpaceAfterKeyword() {
@@ -253,7 +253,7 @@
 
   public void testForStatementKeywords() {
     myFixture.testCompletionVariants(getTestName(true) + ".go", "bar", "break", "const", "continue", "defer", "for", "go", "if", "return",
-                                     "fallthrough", "goto", "select", "switch", "var", "struct", "map");
+                                     "fallthrough", "goto", "select", "switch", "var", "struct", "map", "type");
   }
 
   public void testDoNotCompleteKeywordsInsideConstSpec() {
