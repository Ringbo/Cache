diff --git a/java/java-tests/testSrc/com/intellij/codeInsight/completion/KeywordCompletionTest.java b/java/java-tests/testSrc/com/intellij/codeInsight/completion/KeywordCompletionTest.java
index f889649..1cad2f0 100644
--- a/java/java-tests/testSrc/com/intellij/codeInsight/completion/KeywordCompletionTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInsight/completion/KeywordCompletionTest.java
@@ -95,7 +95,7 @@
   public void testSecondCatch() throws Exception { doTest(2, "catch", "finally"); }
   public void testSuper1() throws Exception { doTest(1, "super"); }
   public void testSuper2() throws Exception { doTest(0, "super"); }
-  public void testSuper3() throws Exception { doTest(true); }
+  public void testSuper3() throws Exception { doTest(false); }
   public void testSuper4() throws Exception { doTest(0, "class"); }
   public void testContinue() throws Exception { doTest(false); }
   public void testThrowsOnSeparateLine() throws Exception { doTest(false); }
