diff --git a/src/java/org/apache/lucene/search/regex/SpanRegexQuery.java b/src/java/org/apache/lucene/search/regex/SpanRegexQuery.java
index eef905e..a679a52 100644
--- a/src/java/org/apache/lucene/search/regex/SpanRegexQuery.java
+++ b/src/java/org/apache/lucene/search/regex/SpanRegexQuery.java
@@ -65,7 +65,7 @@
 
   public boolean equals(Object o) {
     if (this == o) return true;
-    if (!(o instanceof TermQuery)) return false;
+    if (!(o instanceof SpanRegexQuery)) return false;
     final SpanRegexQuery that = (SpanRegexQuery) o;
     return term.equals(that.term) && getBoost() == that.getBoost();
   }
