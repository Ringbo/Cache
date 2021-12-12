diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/FloatProperty.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/FloatProperty.java
index 62ce8ba..b5f5b72 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/FloatProperty.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/FloatProperty.java
@@ -38,7 +38,7 @@
 
     @Override
     public FloatProperty withTable(NameAlias tableNameAlias) {
-        return new FloatProperty(table, new NameAlias(tableNameAlias).withTable(tableNameAlias.getAliasName()));
+        return new FloatProperty(table, new NameAlias(nameAlias).withTable(tableNameAlias.getAliasName()));
     }
 
     public Condition is(float value) {
