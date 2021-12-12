diff --git a/realm/realm-library/src/main/java/io/realm/RealmSchema.java b/realm/realm-library/src/main/java/io/realm/RealmSchema.java
index 94154d5..177872e 100644
--- a/realm/realm-library/src/main/java/io/realm/RealmSchema.java
+++ b/realm/realm-library/src/main/java/io/realm/RealmSchema.java
@@ -144,7 +144,7 @@
             Set<RealmObjectSchema> schemas = new LinkedHashSet<>(tableCount);
             for (int i = 0; i < tableCount; i++) {
                 String tableName = realm.sharedRealm.getTableName(i);
-                if (Table.isMetaTable(tableName)) {
+                if (Table.isModelTable(tableName)) {
                     continue;
                 }
                 Table table = realm.sharedRealm.getTable(tableName);
