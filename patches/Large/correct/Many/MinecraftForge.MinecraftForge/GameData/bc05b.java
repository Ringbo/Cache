diff --git a/src/main/java/net/minecraftforge/fml/common/registry/GameData.java b/src/main/java/net/minecraftforge/fml/common/registry/GameData.java
index 9745f12..514c08b 100644
--- a/src/main/java/net/minecraftforge/fml/common/registry/GameData.java
+++ b/src/main/java/net/minecraftforge/fml/common/registry/GameData.java
@@ -1010,7 +1010,7 @@
             .put("minecraft:items", Item.class).build());
 
     private void findSuperTypes(Class<?> type, Set<Class<?>> types) {
-        if (type == Object.class) {
+        if (type == null || type == Object.class) {
             return;
         }
         types.add(type);
