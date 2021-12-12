diff --git a/test/framework/src/main/java/org/elasticsearch/common/bytes/AbstractBytesReferenceTestCase.java b/test/framework/src/main/java/org/elasticsearch/common/bytes/AbstractBytesReferenceTestCase.java
index 103e263..aae6522 100644
--- a/test/framework/src/main/java/org/elasticsearch/common/bytes/AbstractBytesReferenceTestCase.java
+++ b/test/framework/src/main/java/org/elasticsearch/common/bytes/AbstractBytesReferenceTestCase.java
@@ -430,7 +430,7 @@
         int length = randomInt(PAGE_SIZE * randomIntBetween(2, 5));
         BytesReference pbr = newBytesReference(length);
         int sliceOffset = randomIntBetween(0, pbr.length() - 1); // an offset to the end would be len 0
-        int sliceLength = randomIntBetween(0, pbr.length() - sliceOffset);
+        int sliceLength = randomIntBetween(1, pbr.length() - sliceOffset);
         BytesReference slice = pbr.slice(sliceOffset, sliceLength);
         BytesRef singlePageOrNull = getSinglePageOrNull(slice);
         if (singlePageOrNull != null) {
