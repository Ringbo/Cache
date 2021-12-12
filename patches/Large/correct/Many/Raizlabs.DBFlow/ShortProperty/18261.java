diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/ShortProperty.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/ShortProperty.java
index 2d295fe..6e61cb7 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/ShortProperty.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/ShortProperty.java
@@ -38,7 +38,7 @@
 
     @Override
     public ShortProperty withTable(NameAlias tableNameAlias) {
-        return new ShortProperty(table, new NameAlias(tableNameAlias).withTable(tableNameAlias.getAliasName()));
+        return new ShortProperty(table, new NameAlias(nameAlias).withTable(tableNameAlias.getAliasName()));
     }
 
     public Condition is(short value) {
