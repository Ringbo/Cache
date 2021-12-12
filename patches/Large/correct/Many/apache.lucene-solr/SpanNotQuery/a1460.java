diff --git a/src/java/org/apache/lucene/search/spans/SpanNotQuery.java b/src/java/org/apache/lucene/search/spans/SpanNotQuery.java
index e302504..bfbc0a5 100644
--- a/src/java/org/apache/lucene/search/spans/SpanNotQuery.java
+++ b/src/java/org/apache/lucene/search/spans/SpanNotQuery.java
@@ -172,7 +172,7 @@
   public int hashCode() {
     int h = include.hashCode();
     h = (h<<1) | (h >>> 31);  // rotate left
-    h ^= include.hashCode();
+    h ^= exclude.hashCode();
     h = (h<<1) | (h >>> 31);  // rotate left
     h ^= Float.floatToRawIntBits(getBoost());
     return h;
