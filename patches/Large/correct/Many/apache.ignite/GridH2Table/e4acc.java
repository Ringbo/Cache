diff --git a/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GridH2Table.java b/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GridH2Table.java
index f20d102..7c8b756 100644
--- a/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GridH2Table.java
+++ b/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/opt/GridH2Table.java
@@ -631,8 +631,8 @@
 
                 if (old != null) {
                     // Remove row from all indexes.
-                    // Start from 2 because 0 - Scan (don't need to update), 1 - PK (already updated).
-                    for (int i = 2, len = idxs.size(); i < len; i++) {
+                    // Start from 3 because 0 - Scan (don't need to update), 1 - PK hash (already updated), 2 - PK (already updated).
+                    for (int i = 3, len = idxs.size(); i < len; i++) {
                         Row res = index(i).remove(old);
 
                         assert eq(pk, res, old) : "\n" + old + "\n" + res + "\n" + i + " -> " + index(i).getName();
