diff --git a/requery/src/main/java/io/requery/sql/SchemaModifier.java b/requery/src/main/java/io/requery/sql/SchemaModifier.java
index 15f5d49..18211ab 100644
--- a/requery/src/main/java/io/requery/sql/SchemaModifier.java
+++ b/requery/src/main/java/io/requery/sql/SchemaModifier.java
@@ -563,7 +563,7 @@
                              Set<Attribute<?,?>> attributes,
                              Type<?> type, TableCreationMode mode) {
         qb.keyword(CREATE);
-        if (attributes.size() == 1 && attributes.iterator().next().isUnique()) {
+        if (attributes.size() >= 1 && attributes.iterator().next().isUnique()) {
             qb.keyword(UNIQUE);
         }
         qb.keyword(INDEX);
