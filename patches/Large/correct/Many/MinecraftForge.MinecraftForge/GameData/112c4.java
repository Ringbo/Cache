diff --git a/src/main/java/net/minecraftforge/fml/common/registry/GameData.java b/src/main/java/net/minecraftforge/fml/common/registry/GameData.java
index 0d278bc..0526043 100644
--- a/src/main/java/net/minecraftforge/fml/common/registry/GameData.java
+++ b/src/main/java/net/minecraftforge/fml/common/registry/GameData.java
@@ -1014,7 +1014,7 @@
             .put("minecraft:items", Item.class).build());
 
     private void findSuperTypes(Class<?> type, Set<Class<?>> types) {
-        if (type == Object.class) {
+        if (type == null || type == Object.class) {
             return;
         }
         types.add(type);
