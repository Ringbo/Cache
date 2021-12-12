diff --git a/sql/src/main/java/io/crate/analyze/relations/RelationNormalizer.java b/sql/src/main/java/io/crate/analyze/relations/RelationNormalizer.java
index 2a372a5..9c0419b 100644
--- a/sql/src/main/java/io/crate/analyze/relations/RelationNormalizer.java
+++ b/sql/src/main/java/io/crate/analyze/relations/RelationNormalizer.java
@@ -190,7 +190,7 @@
 
         boolean notMergeableOrderBy = childQuerySpec.orderBy().isPresent() && parentQuerySpec.orderBy().isPresent()
                                       && !childQuerySpec.orderBy().equals(parentQuerySpec.orderBy())
-                                      && (parentQuerySpec.limit().isPresent() || parentQuerySpec.offset().isPresent())
+                                      && (childQuerySpec.limit().isPresent() || childQuerySpec.offset().isPresent())
                                       && (parentQuerySpec.limit().isPresent() || parentQuerySpec.offset().isPresent());
 
         return !hasAggregations && !notMergeableOrderBy &&
