diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSessionFactory.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSessionFactory.java
index 51c00f4..3659a08 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSessionFactory.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSessionFactory.java
@@ -332,7 +332,7 @@
   }
   
   public Boolean isBulkInsertable(Class<? extends PersistentObject> persistentObjectClass) {
-  	return bulkInsertableMap != null && bulkInsertableMap.get(persistentObjectClass);
+  	return bulkInsertableMap != null && bulkInsertableMap.containsKey(persistentObjectClass);
   }
 
   // getters and setters //////////////////////////////////////////////////////
