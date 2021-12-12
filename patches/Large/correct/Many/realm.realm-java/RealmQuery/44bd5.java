diff --git a/realm/src/main/java/io/realm/RealmQuery.java b/realm/src/main/java/io/realm/RealmQuery.java
index 70f3939..3775548 100644
--- a/realm/src/main/java/io/realm/RealmQuery.java
+++ b/realm/src/main/java/io/realm/RealmQuery.java
@@ -74,7 +74,7 @@
         this.clazz = clazz;
         this.table = realm.getTable(clazz);
         this.query = table.where();
-        this.columns = Realm.getColumnIndices().getClassFields(clazz);
+        this.columns = realm.getColumnIndices().getClassFields(clazz);
     }
 
     /**
@@ -89,7 +89,7 @@
         this.clazz = clazz;
         this.table = realm.getTable(clazz);
         this.query = realmList.getTable().where();
-        this.columns = Realm.getColumnIndices().getClassFields(clazz);
+        this.columns = realm.getColumnIndices().getClassFields(clazz);
     }
 
     RealmQuery(Realm realm, LinkView view, Class<E> clazz) {
@@ -98,7 +98,7 @@
         this.query = view.where();
         this.view = view;
         this.table = realm.getTable(clazz);
-        this.columns = Realm.getColumnIndices().getClassFields(clazz);
+        this.columns = realm.getColumnIndices().getClassFields(clazz);
     }
 
     private boolean containsDot(String s) {
