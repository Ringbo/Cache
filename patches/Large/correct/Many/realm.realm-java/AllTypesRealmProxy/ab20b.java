diff --git a/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java b/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
index 8ae1622..86fbe9c 100644
--- a/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
+++ b/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
@@ -213,7 +213,7 @@
             if (table.getPrimaryKey() != table.getColumnIndex("columnString")) {
                 throw new IllegalStateException("Primary key not defined for field 'columnString'");
             }
-            if (!table.hasIndex(table.getColumnIndex("columnString"))) {
+            if (!table.hasSearchIndex(table.getColumnIndex("columnString"))) {
                 throw new IllegalStateException("Index not defined for field 'columnString'");
             }
             if (!columnTypes.containsKey("columnLong")) {
