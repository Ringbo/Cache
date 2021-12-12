diff --git a/engine/src/main/java/org/terasology/entitySystem/entity/internal/BaseEntityRef.java b/engine/src/main/java/org/terasology/entitySystem/entity/internal/BaseEntityRef.java
index c0cc75d..9f30c1c 100644
--- a/engine/src/main/java/org/terasology/entitySystem/entity/internal/BaseEntityRef.java
+++ b/engine/src/main/java/org/terasology/entitySystem/entity/internal/BaseEntityRef.java
@@ -105,7 +105,7 @@
     public AssetUri getPrefabURI() {
         if (exists()) {
             EntityInfoComponent info = getComponent(EntityInfoComponent.class);
-            if (info != null && !info.parentPrefab.exists()) {
+            if (info != null && info.parentPrefab.exists()) {
                 return new AssetUri(AssetType.PREFAB, info.parentPrefab.getName());
             }
         }
