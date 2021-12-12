diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/DoubleProperty.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/DoubleProperty.java
index bed502b..a9ed76b 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/DoubleProperty.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/property/DoubleProperty.java
@@ -38,7 +38,7 @@
 
     @Override
     public DoubleProperty withTable(NameAlias tableNameAlias) {
-        return new DoubleProperty(table, new NameAlias(tableNameAlias).withTable(tableNameAlias.getAliasName()));
+        return new DoubleProperty(table, new NameAlias(nameAlias).withTable(tableNameAlias.getAliasName()));
     }
 
     public Condition is(double value) {
