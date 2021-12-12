diff --git a/jme3-core/src/main/java/com/jme3/util/MaterialDebugAppState.java b/jme3-core/src/main/java/com/jme3/util/MaterialDebugAppState.java
index 9fb6c9e..1c512e4 100644
--- a/jme3-core/src/main/java/com/jme3/util/MaterialDebugAppState.java
+++ b/jme3-core/src/main/java/com/jme3/util/MaterialDebugAppState.java
@@ -317,7 +317,7 @@
                     if (field.getType().isInstance(p)) {
                         field.setAccessible(true);
                         p = (Filter.Pass) field.get(filter);
-                        if (p.getPassMaterial() != null) {
+                        if (p!= null && p.getPassMaterial() != null) {
                             Material mat = reloadMaterial(p.getPassMaterial());
                             if (mat == null) {
                                 return;
