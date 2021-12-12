diff --git a/realm/realm-annotations-processor/src/test/resources/io/realm/NullTypesRealmProxy.java b/realm/realm-annotations-processor/src/test/resources/io/realm/NullTypesRealmProxy.java
index 95e845b..a096482 100644
--- a/realm/realm-annotations-processor/src/test/resources/io/realm/NullTypesRealmProxy.java
+++ b/realm/realm-annotations-processor/src/test/resources/io/realm/NullTypesRealmProxy.java
@@ -1129,14 +1129,14 @@
         if (currentDepth > maxDepth || realmObject == null) {
             return null;
         }
-        CacheData<NullTypes> cachedObject = (CacheData) cache.get(realmObject);
+        CacheData<RealmObject> cachedObject = cache.get(realmObject);
         NullTypes standaloneObject;
         if (cachedObject != null) {
             // Reuse cached object or recreate it because it was encountered at a lower depth.
             if (currentDepth >= cachedObject.minDepth) {
-                return cachedObject.object;
+                return (NullTypes)cachedObject.object;
             } else {
-                standaloneObject = cachedObject.object;
+                standaloneObject = (NullTypes)cachedObject.object;
                 cachedObject.minDepth = currentDepth;
             }
         } else {
