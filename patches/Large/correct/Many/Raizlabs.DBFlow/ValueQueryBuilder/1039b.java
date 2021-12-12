diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/builder/ValueQueryBuilder.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/builder/ValueQueryBuilder.java
index ad3a57e..f5b293f 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/builder/ValueQueryBuilder.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/builder/ValueQueryBuilder.java
@@ -102,7 +102,7 @@
      * @return
      */
     public ValueQueryBuilder appendTableName(Class<? extends Model> table) {
-        return appendQuoted(FlowManager.getTableName(table));
+        return append(FlowManager.getTableName(table));
     }
 
     /**
