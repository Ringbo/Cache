diff --git a/src/java/org/apache/cassandra/db/index/composites/CompositesSearcher.java b/src/java/org/apache/cassandra/db/index/composites/CompositesSearcher.java
index 011839e..0c2cfbc 100644
--- a/src/java/org/apache/cassandra/db/index/composites/CompositesSearcher.java
+++ b/src/java/org/apache/cassandra/db/index/composites/CompositesSearcher.java
@@ -138,7 +138,7 @@
                 {
                     // Did we get more columns that needed to respect the user limit?
                     // (but we still need to return what has been fetched already)
-                    if (columnsCount > limit)
+                    if (columnsCount >= limit)
                         return makeReturn(currentKey, data);
 
                     if (indexColumns == null || indexColumns.isEmpty())
