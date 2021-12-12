diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/graph/SubsetVertex.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/graph/SubsetVertex.java
index be74ef6..6d93496 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/graph/SubsetVertex.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/graph/SubsetVertex.java
@@ -103,7 +103,7 @@
                                     + "] inclusive from CNN activations with " + " [depth,width,height] = [" + depth
                                     + "," + conv.getWidth() + "," + conv.getHeight() + "]");
                 }
-                return InputType.convolutional(from - to + 1, conv.getWidth(), conv.getHeight());
+                return InputType.convolutional(conv.getHeight(), conv.getWidth(), from - to + 1);
             case CNNFlat:
                 //TODO work out how to do this - could be difficult...
                 throw new UnsupportedOperationException(
