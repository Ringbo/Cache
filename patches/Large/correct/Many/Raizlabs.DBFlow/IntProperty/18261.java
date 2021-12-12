diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/IntProperty.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/IntProperty.java
index 94bab07..ca6fb6a 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/IntProperty.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/IntProperty.java
@@ -38,7 +38,7 @@
 
     @Override
     public IntProperty withTable(NameAlias tableNameAlias) {
-        return new IntProperty(table, new NameAlias(tableNameAlias).withTable(tableNameAlias.getAliasName()));
+        return new IntProperty(table, new NameAlias(nameAlias).withTable(tableNameAlias.getAliasName()));
     }
 
     public Condition is(int value) {
