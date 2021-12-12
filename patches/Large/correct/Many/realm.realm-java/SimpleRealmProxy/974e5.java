diff --git a/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java b/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java
index d5ca879..1bb6f1c 100644
--- a/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java
+++ b/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java
@@ -31,37 +31,37 @@
 
     @Override
     public String getName() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (java.lang.String) row.getString(Realm.columnIndices.get("Simple").get("name"));
     }
 
     @Override
     public void setName(String value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setString(Realm.columnIndices.get("Simple").get("name"), (String) value);
     }
 
     @Override
     public int getAge() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (int) row.getLong(Realm.columnIndices.get("Simple").get("age"));
     }
 
     @Override
     public void setAge(int value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setLong(Realm.columnIndices.get("Simple").get("age"), (long) value);
     }
 
     @Override
     public int getObject_id() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (int) row.getLong(Realm.columnIndices.get("Simple").get("object_id"));
     }
 
     @Override
     public void setObject_id(int value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setLong(Realm.columnIndices.get("Simple").get("object_id"), (long) value);
     }
 
