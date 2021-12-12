diff --git a/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java b/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
index 01649b7..b6f9f48 100644
--- a/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
+++ b/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
@@ -249,11 +249,11 @@
         reader.endObject();
     }
 
-    public static AllTypes copyOrUpdate(Realm realm, AllTypes object, boolean update, Map<Object, RealmObject> cache) {
+    public static AllTypes copyOrUpdate(Realm realm, AllTypes object, boolean update, Map<RealmObject, RealmObject> cache) {
         return copy(realm, object, false, cache);
     }
 
-    public static AllTypes copy(Realm realm, AllTypes newObject, boolean update, Map<Object, RealmObject> cache) {
+    public static AllTypes copy(Realm realm, AllTypes newObject, boolean update, Map<RealmObject, RealmObject> cache) {
         AllTypes realmObject = realm.createObject(AllTypes.class);
         cache.put(newObject, realmObject);
         realmObject.setColumnString(newObject.getColumnString() != null ? newObject.getColumnString() : "");
@@ -266,7 +266,7 @@
         return realmObject;
     }
 
-    static AllTypes update(Realm realm, AllTypes realmObject, AllTypes newObject, Map<Object, RealmObject> cache) {
+    static AllTypes update(Realm realm, AllTypes realmObject, AllTypes newObject, Map<RealmObject, RealmObject> cache) {
         realmObject.setColumnString(newObject.getColumnString() != null ? newObject.getColumnString() : "");
         realmObject.setColumnLong(newObject.getColumnLong());
         realmObject.setColumnFloat(newObject.getColumnFloat());
