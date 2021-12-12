diff --git a/astrid/src/com/todoroo/astrid/dao/TaskDao.java b/astrid/src/com/todoroo/astrid/dao/TaskDao.java
index ee88237..7bad5a1 100644
--- a/astrid/src/com/todoroo/astrid/dao/TaskDao.java
+++ b/astrid/src/com/todoroo/astrid/dao/TaskDao.java
@@ -135,13 +135,13 @@
         boolean saveSuccessful;
 
         if (task.getId() == Task.NO_ID) {
-            saveSuccessful = createItem(task);
+            saveSuccessful = createNew(task);
         } else {
             ContentValues values = task.getSetValues();
             if(values.size() == 0)
                 return true;
             beforeSave(task, values, duringSync);
-            saveSuccessful = saveItem(task);
+            saveSuccessful = saveExisting(task);
             afterSave(task, values, duringSync);
         }
 
@@ -152,17 +152,17 @@
     }
 
     @Override
-    public boolean createItem(AbstractModel item) {
+    public boolean createNew(AbstractModel item) {
         if(!item.containsValue(Task.CREATION_DATE))
             item.setValue(Task.CREATION_DATE, DateUtilities.now());
         item.setValue(Task.MODIFICATION_DATE, DateUtilities.now());
-        return super.createItem(item);
+        return super.createNew(item);
     }
 
     @Override
-    public boolean saveItem(AbstractModel item) {
+    public boolean saveExisting(AbstractModel item) {
         item.setValue(Task.MODIFICATION_DATE, DateUtilities.now());
-        return super.saveItem(item);
+        return super.saveExisting(item);
     }
 
     /**
