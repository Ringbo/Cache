diff --git a/realm/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java b/realm/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java
index 4982352..c87b718 100644
--- a/realm/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java
+++ b/realm/realm-annotations-processor/src/test/resources/io/realm/BooleansRealmProxy.java
@@ -286,14 +286,14 @@
         if (currentDepth > maxDepth || realmObject == null) {
             return null;
         }
-        CacheData<Booleans> cachedObject = (CacheData) cache.get(realmObject);
+        CacheData<RealmObject> cachedObject = cache.get(realmObject);
         Booleans standaloneObject;
         if (cachedObject != null) {
             // Reuse cached object or recreate it because it was encountered at a lower depth.
             if (currentDepth >= cachedObject.minDepth) {
-                return cachedObject.object;
+                return (Booleans)cachedObject.object;
             } else {
-                standaloneObject = cachedObject.object;
+                standaloneObject = (Booleans)cachedObject.object;
                 cachedObject.minDepth = currentDepth;
             }
         } else {
