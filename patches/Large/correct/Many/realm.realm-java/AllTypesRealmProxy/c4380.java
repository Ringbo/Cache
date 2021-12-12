diff --git a/realm/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java b/realm/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
index f9df3e4..a0f31d9 100644
--- a/realm/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
+++ b/realm/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
@@ -646,14 +646,14 @@
         if (currentDepth > maxDepth || realmObject == null) {
             return null;
         }
-        CacheData<AllTypes> cachedObject = (CacheData) cache.get(realmObject);
+        CacheData<RealmObject> cachedObject = cache.get(realmObject);
         AllTypes standaloneObject;
         if (cachedObject != null) {
             // Reuse cached object or recreate it because it was encountered at a lower depth.
             if (currentDepth >= cachedObject.minDepth) {
-                return cachedObject.object;
+                return (AllTypes)cachedObject.object;
             } else {
-                standaloneObject = cachedObject.object;
+                standaloneObject = (AllTypes)cachedObject.object;
                 cachedObject.minDepth = currentDepth;
             }
         } else {
