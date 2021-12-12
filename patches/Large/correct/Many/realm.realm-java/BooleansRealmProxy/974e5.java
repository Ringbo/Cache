diff --git a/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java b/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java
index ff97497..fadd276 100644
--- a/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java
+++ b/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java
@@ -31,37 +31,37 @@
 
     @Override
     public boolean isDone() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (boolean) row.getBoolean(Realm.columnIndices.get("Booleans").get("done"));
     }
 
     @Override
     public void setDone(boolean value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setBoolean(Realm.columnIndices.get("Booleans").get("done"), (boolean) value);
     }
 
     @Override
     public boolean isReady() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (boolean) row.getBoolean(Realm.columnIndices.get("Booleans").get("isReady"));
     }
 
     @Override
     public void setReady(boolean value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setBoolean(Realm.columnIndices.get("Booleans").get("isReady"), (boolean) value);
     }
 
     @Override
     public boolean ismCompleted() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (boolean) row.getBoolean(Realm.columnIndices.get("Booleans").get("mCompleted"));
     }
 
     @Override
     public void setmCompleted(boolean value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setBoolean(Realm.columnIndices.get("Booleans").get("mCompleted"), (boolean) value);
     }
 
