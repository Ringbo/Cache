diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/BaseModelQueriable.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/BaseModelQueriable.java
index bbd4b62..a35bcd8 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/BaseModelQueriable.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/BaseModelQueriable.java
@@ -91,7 +91,7 @@
 
     @Override
     public long executeUpdateDelete() {
-        return executeUpdateDelete(FlowManager.getWritableDatabase(getTable()));
+        return executeUpdateDelete(FlowManager.getWritableDatabaseForTable(getTable()));
     }
 
     @Override
