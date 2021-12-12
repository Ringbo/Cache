diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/structure/RetrievalAdapter.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/structure/RetrievalAdapter.java
index d5dc5c5..d38cf67 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/structure/RetrievalAdapter.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/structure/RetrievalAdapter.java
@@ -47,8 +47,10 @@
 
     public void load(TModel model, DatabaseWrapper databaseWrapper) {
         getSingleModelLoader().load(databaseWrapper,
-                SQLite.select().from(getModelClass())
-                        .where(getPrimaryConditionClause(model)).getQuery());
+                SQLite.select()
+                        .from(getModelClass())
+                        .where(getPrimaryConditionClause(model)).getQuery(),
+                model);
     }
 
     /**
