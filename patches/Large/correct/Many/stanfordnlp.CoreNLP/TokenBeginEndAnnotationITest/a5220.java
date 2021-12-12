diff --git a/itest/src/edu/stanford/nlp/pipeline/TokenBeginEndAnnotationITest.java b/itest/src/edu/stanford/nlp/pipeline/TokenBeginEndAnnotationITest.java
index 16e9864..5f450c5 100644
--- a/itest/src/edu/stanford/nlp/pipeline/TokenBeginEndAnnotationITest.java
+++ b/itest/src/edu/stanford/nlp/pipeline/TokenBeginEndAnnotationITest.java
@@ -138,7 +138,7 @@
     assertTrue(!tokenIndexTwoNinetyThree.isNewline());
     CoreLabel tokenIndexFiveFortyTwo = xmlDocAnnotation.get(CoreAnnotations.TokensAnnotation.class).get(542);
     assertEquals("location", tokenIndexFiveFortyTwo.originalText());
-    CoreLabel tokenIndexFiveFiftyFour = xmlDocAnnotation.get(CoreAnnotations.TokensAnnotation.class).get(554);
+    CoreLabel tokenIndexFiveFiftyFour = xmlDocAnnotation.get(CoreAnnotations.TokensAnnotation.class).get(543);
     assertEquals(".", tokenIndexFiveFiftyFour.originalText());
   }
 
