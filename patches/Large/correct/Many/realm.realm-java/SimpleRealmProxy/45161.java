diff --git a/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java b/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java
index 825501c..ff8bde9 100644
--- a/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java
+++ b/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java
@@ -116,11 +116,11 @@
         reader.endObject();
     }
 
-    public static Simple copyOrUpdate(Realm realm, Simple object, boolean update, Map<Object, RealmObject> cache) {
+    public static Simple copyOrUpdate(Realm realm, Simple object, boolean update, Map<RealmObject, RealmObject> cache) {
         return copy(realm, object, false, cache);
     }
 
-    public static Simple copy(Realm realm, Simple newObject, boolean update, Map<Object, RealmObject> cache) {
+    public static Simple copy(Realm realm, Simple newObject, boolean update, Map<RealmObject, RealmObject> cache) {
         Simple realmObject = realm.createObject(Simple.class);
         cache.put(newObject, realmObject);
         realmObject.setName(newObject.getName() != null ? newObject.getName() : "");
@@ -128,7 +128,7 @@
         return realmObject;
     }
 
-    static Simple update(Realm realm, Simple realmObject, Simple newObject, Map<Object, RealmObject> cache) {
+    static Simple update(Realm realm, Simple realmObject, Simple newObject, Map<RealmObject, RealmObject> cache) {
         realmObject.setName(newObject.getName() != null ? newObject.getName() : "");
         realmObject.setAge(newObject.getAge());
         return realmObject;
