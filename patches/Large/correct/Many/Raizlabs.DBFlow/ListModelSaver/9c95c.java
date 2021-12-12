diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/saveable/ListModelSaver.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/saveable/ListModelSaver.java
index 8a907db..a76df37 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/saveable/ListModelSaver.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/saveable/ListModelSaver.java
@@ -59,7 +59,7 @@
     }
 
     public synchronized void updateAll(@NonNull Collection<TModel> tableCollection) {
-        saveAll(tableCollection, modelSaver.getWritableDatabase());
+        updateAll(tableCollection, modelSaver.getWritableDatabase());
     }
 
     public synchronized void updateAll(@NonNull Collection<TModel> tableCollection,
