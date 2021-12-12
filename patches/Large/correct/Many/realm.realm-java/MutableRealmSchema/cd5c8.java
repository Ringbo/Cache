diff --git a/realm/realm-library/src/main/java/io/realm/MutableRealmSchema.java b/realm/realm-library/src/main/java/io/realm/MutableRealmSchema.java
index 2bb1f65..8939e9b 100644
--- a/realm/realm-library/src/main/java/io/realm/MutableRealmSchema.java
+++ b/realm/realm-library/src/main/java/io/realm/MutableRealmSchema.java
@@ -58,7 +58,7 @@
     @Override
     public RealmObjectSchema createWithPrimaryKeyField(String className, String primaryKeyFieldName, Class<?> fieldType,
                                                        FieldAttribute... attributes) {
-        checkEmpty(className, EMPTY_STRING_MSG);
+        checkNotEmpty(className, EMPTY_STRING_MSG);
         RealmObjectSchema.checkLegalName(primaryKeyFieldName);
         String internalTableName = checkAndGetTableNameFromClassName(className);
 
