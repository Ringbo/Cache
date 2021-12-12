diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/LongProperty.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/LongProperty.java
index 5cbc09e..c2c3241 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/LongProperty.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/LongProperty.java
@@ -38,7 +38,7 @@
 
     @Override
     public LongProperty withTable(NameAlias tableNameAlias) {
-        return new LongProperty(table, new NameAlias(tableNameAlias).withTable(tableNameAlias.getAliasName()));
+        return new LongProperty(table, new NameAlias(nameAlias).withTable(tableNameAlias.getAliasName()));
     }
 
     public Condition is(long value) {
