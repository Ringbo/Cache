diff --git a/lucene/src/test-framework/org/apache/lucene/util/LuceneTestCase.java b/lucene/src/test-framework/org/apache/lucene/util/LuceneTestCase.java
index 5144029..cdecbb5 100644
--- a/lucene/src/test-framework/org/apache/lucene/util/LuceneTestCase.java
+++ b/lucene/src/test-framework/org/apache/lucene/util/LuceneTestCase.java
@@ -868,7 +868,7 @@
     if (r.nextBoolean()) {
       if (rarely(r)) {
         // crazy value
-        c.setTermIndexInterval(random.nextBoolean() ? _TestUtil.nextInt(r, 1, 31) : _TestUtil.nextInt(r, 129, 1000));
+        c.setTermIndexInterval(r.nextBoolean() ? _TestUtil.nextInt(r, 1, 31) : _TestUtil.nextInt(r, 129, 1000));
       } else {
         // reasonable value
         c.setTermIndexInterval(_TestUtil.nextInt(r, 32, 128));
