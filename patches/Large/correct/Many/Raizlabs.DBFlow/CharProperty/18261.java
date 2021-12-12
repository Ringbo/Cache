diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/CharProperty.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/CharProperty.java
index 8c102b5..0eb9a74 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/CharProperty.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/CharProperty.java
@@ -35,7 +35,7 @@
 
     @Override
     public CharProperty withTable(NameAlias tableNameAlias) {
-        return new CharProperty(table, new NameAlias(tableNameAlias).withTable(tableNameAlias.getAliasName()));
+        return new CharProperty(table, new NameAlias(nameAlias).withTable(tableNameAlias.getAliasName()));
     }
 
     public Condition is(char value) {
