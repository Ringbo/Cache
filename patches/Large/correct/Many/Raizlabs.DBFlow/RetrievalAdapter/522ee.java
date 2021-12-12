diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/structure/RetrievalAdapter.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/structure/RetrievalAdapter.java
index 0f803f6..83a8538 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/structure/RetrievalAdapter.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/structure/RetrievalAdapter.java
@@ -44,12 +44,18 @@
         }
     }
 
+    /**
+     * Force loads the model from the DB. Even if caching is enabled it will requery the object.
+     */
     public void load(@NonNull TModel model) {
         load(model, FlowManager.getDatabaseForTable(getModelClass()).getWritableDatabase());
     }
 
+    /**
+     * Force loads the model from the DB. Even if caching is enabled it will requery the object.
+     */
     public void load(@NonNull TModel model, DatabaseWrapper databaseWrapper) {
-        getSingleModelLoader().load(databaseWrapper,
+        getNonCacheableSingleModelLoader().load(databaseWrapper,
             SQLite.select()
                 .from(getModelClass())
                 .where(getPrimaryConditionClause(model)).getQuery(),
