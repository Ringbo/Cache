diff --git a/java/java-tests/testSrc/com/intellij/codeInsight/daemon/lambda/NewMethodRefHighlightingTest.java b/java/java-tests/testSrc/com/intellij/codeInsight/daemon/lambda/NewMethodRefHighlightingTest.java
index b122fb6..af4633b 100644
--- a/java/java-tests/testSrc/com/intellij/codeInsight/daemon/lambda/NewMethodRefHighlightingTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInsight/daemon/lambda/NewMethodRefHighlightingTest.java
@@ -517,11 +517,11 @@
     doTest();
   }
 
-  public void testApplicabilityErrorVisibleWhenConstraintsFromFunctionalExpressionsProvideValidSubstitutor() throws Exception {
+  public void testApplicabilityErrorVisibleWhenConstraintsFromFunctionalExpressionsProvideValidSubstitutor() {
     doTest();
   }
 
-  public void testExactMethodReferenceWithWildcardBound() throws Exception {
+  public void testMethodReferenceSecondSearchDontInfluenceTopSiteSubstitutor() throws Exception {
     doTest();
   }
 
