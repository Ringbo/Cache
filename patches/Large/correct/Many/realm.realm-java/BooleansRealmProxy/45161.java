diff --git a/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java b/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java
index d0a6dae..964847d 100644
--- a/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java
+++ b/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java
@@ -140,11 +140,11 @@
         reader.endObject();
     }
 
-    public static Booleans copyOrUpdate(Realm realm, Booleans object, boolean update, Map<Object, RealmObject> cache) {
+    public static Booleans copyOrUpdate(Realm realm, Booleans object, boolean update, Map<RealmObject, RealmObject> cache) {
         return copy(realm, object, false, cache);
     }
 
-    public static Booleans copy(Realm realm, Booleans newObject, boolean update, Map<Object, RealmObject> cache) {
+    public static Booleans copy(Realm realm, Booleans newObject, boolean update, Map<RealmObject, RealmObject> cache) {
         Booleans realmObject = realm.createObject(Booleans.class);
         cache.put(newObject, realmObject);
         realmObject.setDone(newObject.isDone());
@@ -153,7 +153,7 @@
         return realmObject;
     }
 
-    static Booleans update(Realm realm, Booleans realmObject, Booleans newObject, Map<Object, RealmObject> cache) {
+    static Booleans update(Realm realm, Booleans realmObject, Booleans newObject, Map<RealmObject, RealmObject> cache) {
         realmObject.setDone(newObject.isDone());
         realmObject.setReady(newObject.isReady());
         realmObject.setmCompleted(newObject.ismCompleted());
