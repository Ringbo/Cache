diff --git a/core/src/main/java/org/apache/mahout/classifier/bayes/common/BayesParameters.java b/core/src/main/java/org/apache/mahout/classifier/bayes/common/BayesParameters.java
index fb68ad2..a47ffb8 100644
--- a/core/src/main/java/org/apache/mahout/classifier/bayes/common/BayesParameters.java
+++ b/core/src/main/java/org/apache/mahout/classifier/bayes/common/BayesParameters.java
@@ -40,7 +40,7 @@
   }
   
   public void setGramSize(int gramSize) {
-    set("gramSize", Integer.toBinaryString(gramSize));
+    set("gramSize", Integer.toString(gramSize));
   }
   
   public void setMinSupport(int minSupport) {
