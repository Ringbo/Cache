diff --git a/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java b/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
index e8a7e8f..6ff7681 100644
--- a/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
+++ b/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
@@ -364,7 +364,7 @@
     }
 
     public static AllTypes copy(Realm realm, AllTypes newObject, boolean update, Map<RealmObject,RealmObject> cache) {
-        AllTypes realmObject = realm.createObject(AllTypes.class);
+        AllTypes realmObject = realm.createObject(AllTypes.class, newObject.getColumnString());
         cache.put(newObject, realmObject);
         realmObject.setColumnString(newObject.getColumnString() != null ? newObject.getColumnString() : "");
         realmObject.setColumnLong(newObject.getColumnLong());
