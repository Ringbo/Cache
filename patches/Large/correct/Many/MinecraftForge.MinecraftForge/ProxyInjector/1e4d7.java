diff --git a/fml/common/cpw/mods/fml/common/ProxyInjector.java b/fml/common/cpw/mods/fml/common/ProxyInjector.java
index 079462e..b3c4055 100644
--- a/fml/common/cpw/mods/fml/common/ProxyInjector.java
+++ b/fml/common/cpw/mods/fml/common/ProxyInjector.java
@@ -33,7 +33,7 @@
     public static void inject(ModContainer mod, ASMDataTable data, Side side)
     {
         FMLLog.fine("Attempting to inject @SidedProxy classes into %s", mod.getModId());
-        Set<ASMData> targets = data.getAnnotationsFor(mod).get(Type.getDescriptor(SidedProxy.class));
+        Set<ASMData> targets = data.getAnnotationsFor(mod).get(SidedProxy.class.getName());
         ClassLoader mcl = Loader.instance().getModClassLoader();
 
         for (ASMData targ : targets)
@@ -52,7 +52,7 @@
                 String targetType = side.isClient() ? target.getAnnotation(SidedProxy.class).clientSide() : target.getAnnotation(SidedProxy.class).serverSide();
                 Object proxy=Class.forName(targetType, true, mcl).newInstance();
 
-                if ((target.getModifiers() & Modifier.STATIC) != 0 )
+                if ((target.getModifiers() & Modifier.STATIC) == 0 )
                 {
                     FMLLog.severe("Attempted to load a proxy type %s into %s.%s, but the field is not static", targetType, targ.getClassName(), targ.getObjectName());
                     throw new LoaderException();
