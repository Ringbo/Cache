diff --git a/modules/activiti5-engine/src/main/java/org/activiti5/engine/impl/db/DbSqlSessionFactory.java b/modules/activiti5-engine/src/main/java/org/activiti5/engine/impl/db/DbSqlSessionFactory.java
index d5e7e56..8254e12 100644
--- a/modules/activiti5-engine/src/main/java/org/activiti5/engine/impl/db/DbSqlSessionFactory.java
+++ b/modules/activiti5-engine/src/main/java/org/activiti5/engine/impl/db/DbSqlSessionFactory.java
@@ -332,7 +332,7 @@
   }
   
   public Boolean isBulkInsertable(Class<? extends PersistentObject> persistentObjectClass) {
-  	return bulkInsertableMap != null && bulkInsertableMap.containsKey(persistentObjectClass) && bulkInsertableMap.get(entityClass) == true;
+  	return bulkInsertableMap != null && bulkInsertableMap.containsKey(persistentObjectClass) && bulkInsertableMap.get(persistentObjectClass) == true;
   }
 
   // getters and setters //////////////////////////////////////////////////////
