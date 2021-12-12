diff --git a/src/main/java/net/minecraftforge/fml/client/registry/RenderingRegistry.java b/src/main/java/net/minecraftforge/fml/client/registry/RenderingRegistry.java
index 607d736..d8c3071 100644
--- a/src/main/java/net/minecraftforge/fml/client/registry/RenderingRegistry.java
+++ b/src/main/java/net/minecraftforge/fml/client/registry/RenderingRegistry.java
@@ -36,27 +36,27 @@
      * @param entityClass
      * @param renderer
      */
-    public static void registerEntityRenderingHandler(Class<? extends Entity> entityClass, Render renderer)
+    public static void registerEntityRenderingHandler(Class<? extends Entity> entityClass, Render<? extends Entity> renderer)
     {
         INSTANCE.entityRenderers.add(new EntityRendererInfo(entityClass, renderer));
     }
 
     private static class EntityRendererInfo
     {
-        public EntityRendererInfo(Class<? extends Entity> target, Render renderer)
+        public EntityRendererInfo(Class<? extends Entity> target, Render<? extends Entity> renderer)
         {
             this.target = target;
             this.renderer = renderer;
         }
         private Class<? extends Entity> target;
-        private Render renderer;
+        private Render<? extends Entity> renderer;
     }
 
-    public static void loadEntityRenderers(Map<Class<? extends Entity>, Render> rendererMap)
+    public static void loadEntityRenderers(Map<Class<? extends Entity>, Render<? extends Entity>> entityRenderMap)
     {
         for (EntityRendererInfo info : INSTANCE.entityRenderers)
         {
-            rendererMap.put(info.target, info.renderer);
+            entityRenderMap.put(info.target, info.renderer);
         }
     }
 }
