diff --git a/lucene/core/src/test/org/apache/lucene/geo/TestGeoEncodingUtils.java b/lucene/core/src/test/org/apache/lucene/geo/TestGeoEncodingUtils.java
index 3b71c63..f13e6c7 100644
--- a/lucene/core/src/test/org/apache/lucene/geo/TestGeoEncodingUtils.java
+++ b/lucene/core/src/test/org/apache/lucene/geo/TestGeoEncodingUtils.java
@@ -56,7 +56,7 @@
       assertEquals(encoded, encodeLatitude(decoded));
       assertEquals(encoded, encodeLatitudeCeil(decoded));
       // test within the range
-      if (i != Integer.MAX_VALUE) {
+      if (encoded != Integer.MAX_VALUE) {
         // this is the next representable value
         // all double values between [min .. max) should encode to the current integer
         // all double values between (min .. max] should encodeCeil to the next integer.
@@ -105,7 +105,7 @@
       assertEquals(encoded, encodeLongitude(decoded));
       assertEquals(encoded, encodeLongitudeCeil(decoded));
       // test within the range
-      if (i != Integer.MAX_VALUE) {
+      if (encoded != Integer.MAX_VALUE) {
         // this is the next representable value
         // all double values between [min .. max) should encode to the current integer
         // all double values between (min .. max] should encodeCeil to the next integer.
