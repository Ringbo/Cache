diff --git a/realm/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java b/realm/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java
index 22cba74..9935490 100644
--- a/realm/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java
+++ b/realm/realm-annotations-processor/src/test/resources/io/realm/SimpleRealmProxy.java
@@ -208,14 +208,14 @@
         if (currentDepth > maxDepth || realmObject == null) {
             return null;
         }
-        CacheData<Simple> cachedObject = (CacheData) cache.get(realmObject);
+        CacheData<RealmObject> cachedObject = cache.get(realmObject);
         Simple standaloneObject;
         if (cachedObject != null) {
             // Reuse cached object or recreate it because it was encountered at a lower depth.
             if (currentDepth >= cachedObject.minDepth) {
-                return cachedObject.object;
+                return (Simple)cachedObject.object;
             } else {
-                standaloneObject = cachedObject.object;
+                standaloneObject = (Simple)cachedObject.object;
                 cachedObject.minDepth = currentDepth;
             }
         } else {
