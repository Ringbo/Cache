diff --git a/DBFlow/src/main/java/com/raizlabs/android/dbflow/sql/language/ColumnAlias.java b/DBFlow/src/main/java/com/raizlabs/android/dbflow/sql/language/ColumnAlias.java
index 5bd815f..698da04 100644
--- a/DBFlow/src/main/java/com/raizlabs/android/dbflow/sql/language/ColumnAlias.java
+++ b/DBFlow/src/main/java/com/raizlabs/android/dbflow/sql/language/ColumnAlias.java
@@ -53,7 +53,7 @@
             if (i > 0) {
                 queryBuilder.append(",");
             }
-            queryBuilder.appendQuoted(columnAliases[i].getAliasName());
+            queryBuilder.append(columnAliases[i].getAliasName());
         }
         queryBuilder.append(")");
         return columnRaw(queryBuilder.getQuery());
