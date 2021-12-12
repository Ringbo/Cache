diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/ByteProperty.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/ByteProperty.java
index e5fec9b..1ef580a 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/ByteProperty.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/ByteProperty.java
@@ -38,7 +38,7 @@
 
     @Override
     public ByteProperty withTable(NameAlias tableNameAlias) {
-        return new ByteProperty(table, new NameAlias(tableNameAlias).withTable(tableNameAlias.getAliasName()));
+        return new ByteProperty(table, new NameAlias(nameAlias).withTable(tableNameAlias.getAliasName()));
     }
 
     public Condition is(byte value) {
