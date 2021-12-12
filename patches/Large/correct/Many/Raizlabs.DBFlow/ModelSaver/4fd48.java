diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/saveable/ModelSaver.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/saveable/ModelSaver.java
index bd4dc45..65080db 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/saveable/ModelSaver.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/saveable/ModelSaver.java
@@ -119,7 +119,7 @@
 
         boolean successful = SQLite.delete(modelAdapter.getModelClass())
                 .where(modelAdapter.getPrimaryConditionClause(model))
-                .count(wrapper) != 0;
+                .executeUpdateDelete(wrapper) != 0;
         if (successful) {
             SqlUtils.notifyModelChanged(model, modelAdapter, BaseModel.Action.DELETE);
         }
