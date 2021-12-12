diff --git a/src/java/org/apache/solr/search/Sorting.java b/src/java/org/apache/solr/search/Sorting.java
index b4252f5..cbacf78 100644
--- a/src/java/org/apache/solr/search/Sorting.java
+++ b/src/java/org/apache/solr/search/Sorting.java
@@ -44,7 +44,7 @@
       if (!reverse) return new SortField(fieldName, nullStringLastComparatorSource);
       else return new SortField(fieldName, SortField.STRING, true);
     } else if (nullFirst) {
-      if (reverse) return new SortField(fieldName, nullStringLastComparatorSource);
+      if (reverse) return new SortField(fieldName, nullStringLastComparatorSource, true);
       else return new SortField(fieldName, SortField.STRING, false);
     } else {
       return new SortField(fieldName, SortField.STRING, reverse);
