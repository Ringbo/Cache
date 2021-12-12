diff --git a/astrid/common-src/com/todoroo/andlib/data/GenericDao.java b/astrid/common-src/com/todoroo/andlib/data/GenericDao.java
index ab466dd..952d6b8 100644
--- a/astrid/common-src/com/todoroo/andlib/data/GenericDao.java
+++ b/astrid/common-src/com/todoroo/andlib/data/GenericDao.java
@@ -24,7 +24,7 @@
  */
 public class GenericDao<TYPE extends AbstractModel> {
 
-    private Class<TYPE> modelClass;
+    private final Class<TYPE> modelClass;
 
     private Table table;
 
@@ -133,14 +133,14 @@
      */
     public boolean persist(AbstractModel item) {
         if (item.getId() == AbstractModel.NO_ID) {
-            return createItem(item);
+            return createNew(item);
         } else {
             ContentValues values = item.getSetValues();
 
             if (values.size() == 0) // nothing changed
                 return true;
 
-            return saveItem(item);
+            return saveExisting(item);
         }
     }
 
@@ -154,7 +154,7 @@
      *            item model
      * @return returns true on success.
      */
-    public boolean createItem(AbstractModel item) {
+    public boolean createNew(AbstractModel item) {
         long newRow = database.getDatabase().insert(table.name,
                 AbstractModel.ID_PROPERTY.name, item.getMergedValues());
         item.setId(newRow);
@@ -162,7 +162,7 @@
     }
 
     /**
-     * Saves the given item.
+     * Saves the given item. Will not create a new item!
      *
      * @param database
      * @param table
@@ -171,7 +171,7 @@
      *            item model
      * @return returns true on success.
      */
-    public boolean saveItem(AbstractModel item) {
+    public boolean saveExisting(AbstractModel item) {
         ContentValues values = item.getSetValues();
         if(values.size() == 0) // nothing changed
             return true;
