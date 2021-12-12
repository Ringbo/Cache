diff --git a/realm/realm-library/src/main/java/io/realm/OsRealmSchema.java b/realm/realm-library/src/main/java/io/realm/OsRealmSchema.java
index 49ebd49..7d96117 100644
--- a/realm/realm-library/src/main/java/io/realm/OsRealmSchema.java
+++ b/realm/realm-library/src/main/java/io/realm/OsRealmSchema.java
@@ -38,7 +38,7 @@
 
         @Override
         public void close() {
-            for (Map.Entry<String, OsRealmObjectSchema> entry : schema.entrySet()) {
+            for (Map.Entry<String, RealmObjectSchema> entry : schema.entrySet()) {
                 entry.getValue().close();
             }
             schema.clear();
