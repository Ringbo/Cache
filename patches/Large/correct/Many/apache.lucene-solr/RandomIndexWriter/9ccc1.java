diff --git a/lucene/src/test-framework/org/apache/lucene/index/RandomIndexWriter.java b/lucene/src/test-framework/org/apache/lucene/index/RandomIndexWriter.java
index e8288f3..9e028ce 100644
--- a/lucene/src/test-framework/org/apache/lucene/index/RandomIndexWriter.java
+++ b/lucene/src/test-framework/org/apache/lucene/index/RandomIndexWriter.java
@@ -178,7 +178,8 @@
     case BYTES_FIXED_DEREF:
     case BYTES_FIXED_STRAIGHT:
     case BYTES_FIXED_SORTED:
-      final String randomUnicodeString = _TestUtil.randomUnicodeString(random, fixedBytesLength);
+      //make sure we use a valid unicode string with a fixed size byte length
+      final String randomUnicodeString = _TestUtil.randomFixedByteLengthUnicodeString(random, fixedBytesLength);
       BytesRef fixedRef = new BytesRef(randomUnicodeString);
       if (fixedRef.length > fixedBytesLength) {
         fixedRef = new BytesRef(fixedRef.bytes, 0, fixedBytesLength);
