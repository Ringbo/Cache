diff --git a/imagepipeline/src/main/java/com/facebook/imagepipeline/core/ProducerSequenceFactory.java b/imagepipeline/src/main/java/com/facebook/imagepipeline/core/ProducerSequenceFactory.java
index ba2afa0..d63bff1 100644
--- a/imagepipeline/src/main/java/com/facebook/imagepipeline/core/ProducerSequenceFactory.java
+++ b/imagepipeline/src/main/java/com/facebook/imagepipeline/core/ProducerSequenceFactory.java
@@ -300,7 +300,7 @@
     if (mLocalFileFetchToEncodedMemoryPrefetchSequence == null) {
       mLocalFileFetchToEncodedMemoryPrefetchSequence =
           ProducerFactory.newSwallowResultProducer(
-              getBackgroundNetworkFetchToEncodedMemorySequence());
+              getBackgroundLocalFileFetchToEncodeMemorySequence());
     }
     return mLocalFileFetchToEncodedMemoryPrefetchSequence;
   }
