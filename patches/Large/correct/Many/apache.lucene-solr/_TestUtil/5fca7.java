diff --git a/lucene/src/test-framework/org/apache/lucene/util/_TestUtil.java b/lucene/src/test-framework/org/apache/lucene/util/_TestUtil.java
index 5a2bd30..1977aa2 100644
--- a/lucene/src/test-framework/org/apache/lucene/util/_TestUtil.java
+++ b/lucene/src/test-framework/org/apache/lucene/util/_TestUtil.java
@@ -220,7 +220,7 @@
       } else if (t <= 1) {
         chars[i++] = (char) random.nextInt(0x80);
       } else if (2 == t) {
-        chars[i++] = (char) nextInt(random, 0x80, 0x800);
+        chars[i++] = (char) nextInt(random, 0x80, 0x7ff);
       } else if (3 == t) {
         chars[i++] = (char) nextInt(random, 0x800, 0xd7ff);
       } else if (4 == t) {
