diff --git a/h2o-algos/src/main/java/hex/word2vec/Word2VecModel.java b/h2o-algos/src/main/java/hex/word2vec/Word2VecModel.java
index 3a3fa9a..8b75884 100644
--- a/h2o-algos/src/main/java/hex/word2vec/Word2VecModel.java
+++ b/h2o-algos/src/main/java/hex/word2vec/Word2VecModel.java
@@ -36,7 +36,7 @@
   }
 
   @Override
-  public ModelMojoWriter getMojo() {
+  public Word2VecMojoWriter getMojo() {
     return new Word2VecMojoWriter(this);
   }
 
