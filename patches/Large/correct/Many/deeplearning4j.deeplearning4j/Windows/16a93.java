diff --git a/deeplearning4j-scaleout/deeplearning4j-nlp/src/main/java/org/deeplearning4j/text/movingwindow/Windows.java b/deeplearning4j-scaleout/deeplearning4j-nlp/src/main/java/org/deeplearning4j/text/movingwindow/Windows.java
index 170b689..e8b35c8 100755
--- a/deeplearning4j-scaleout/deeplearning4j-nlp/src/main/java/org/deeplearning4j/text/movingwindow/Windows.java
+++ b/deeplearning4j-scaleout/deeplearning4j-nlp/src/main/java/org/deeplearning4j/text/movingwindow/Windows.java
@@ -163,7 +163,7 @@
         String window2 = StringUtils.join(onlyTokens);
         int begin = wholeSentence.indexOf(window2);
         int end =   begin + window2.length();
-        return new Window(window,begin,end);
+        return new Window(window, windowSize, begin,end);
 
     }
 
