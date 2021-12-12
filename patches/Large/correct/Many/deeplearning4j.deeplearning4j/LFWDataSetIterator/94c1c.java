diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java
index 046b1c9..7293b03 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/iterator/impl/LFWDataSetIterator.java
@@ -16,7 +16,7 @@
 	}
 	
 	public LFWDataSetIterator(int batch,int numExamples,int imageHeight,int imageWidth) {
-		super(batch, numExamples,new LFWDataFetcher(imageHeight,imageWidth));
+		super(batch, numExamples,new LFWDataFetcher(imageWidth,imageHeight));
 	}
 
 }
