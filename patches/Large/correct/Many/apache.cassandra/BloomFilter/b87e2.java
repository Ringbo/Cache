diff --git a/src/java/org/apache/cassandra/utils/BloomFilter.java b/src/java/org/apache/cassandra/utils/BloomFilter.java
index b24b402..19cff63 100644
--- a/src/java/org/apache/cassandra/utils/BloomFilter.java
+++ b/src/java/org/apache/cassandra/utils/BloomFilter.java
@@ -70,7 +70,7 @@
                                       numElements, bucketsPerElement, targetBucketsPerElem));
         }
         BloomCalculations.BloomSpecification spec = BloomCalculations.computeBloomSpec(bucketsPerElement);
-        logger.debug("Creating bloom filter for {} elements and spec {}", numElements, spec);
+        logger.trace("Creating bloom filter for {} elements and spec {}", numElements, spec);
         return new BloomFilter(spec.K, bucketsFor(numElements, spec.bucketsPerElement));
     }
 
