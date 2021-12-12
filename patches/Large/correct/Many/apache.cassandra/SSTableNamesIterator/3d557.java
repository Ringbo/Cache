diff --git a/src/java/org/apache/cassandra/db/columniterator/SSTableNamesIterator.java b/src/java/org/apache/cassandra/db/columniterator/SSTableNamesIterator.java
index 3750665..32c0190 100644
--- a/src/java/org/apache/cassandra/db/columniterator/SSTableNamesIterator.java
+++ b/src/java/org/apache/cassandra/db/columniterator/SSTableNamesIterator.java
@@ -188,7 +188,7 @@
                 if (columnNames.contains(column.name()))
                 {
                     result.add(column);
-                    if (++n > columns.size())
+                    if (++n >= columns.size())
                         break;
                 }
             }
