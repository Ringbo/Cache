diff --git a/worldedit-core/src/main/java/com/sk89q/worldedit/extent/ChangeSetExtent.java b/worldedit-core/src/main/java/com/sk89q/worldedit/extent/ChangeSetExtent.java
index 84af07a..7941833 100644
--- a/worldedit-core/src/main/java/com/sk89q/worldedit/extent/ChangeSetExtent.java
+++ b/worldedit-core/src/main/java/com/sk89q/worldedit/extent/ChangeSetExtent.java
@@ -68,7 +68,7 @@
     @Override
     public Entity createEntity(Location location, BaseEntity state) {
         Entity entity = super.createEntity(location, state);
-        if (state != null) {
+        if (entity != null) {
             changeSet.add(new EntityCreate(location, state, entity));
         }
         return entity;
