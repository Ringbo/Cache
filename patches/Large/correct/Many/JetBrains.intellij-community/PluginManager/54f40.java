diff --git a/plugins-management/src/com/intellij/ide/plugins/PluginManager.java b/plugins-management/src/com/intellij/ide/plugins/PluginManager.java
index 7229bb6..bd2c0fd 100644
--- a/plugins-management/src/com/intellij/ide/plugins/PluginManager.java
+++ b/plugins-management/src/com/intellij/ide/plugins/PluginManager.java
@@ -596,7 +596,9 @@
     else {
       try {
         Class antClassLoaderClass = Class.forName("org.apache.tools.ant.AntClassLoader");
-        if (antClassLoaderClass.isInstance(loader)) {
+        if (antClassLoaderClass.isInstance(loader) ||
+            loader.getClass().getName().equals("org.apache.tools.ant.AntClassLoader") ||
+            loader.getClass().getName().equals("org.apache.tools.ant.loader.AntClassLoader2")) {
           //noinspection HardCodedStringLiteral
           final String classpath =
             (String)antClassLoaderClass.getDeclaredMethod("getClasspath", ArrayUtil.EMPTY_CLASS_ARRAY).invoke(loader, ArrayUtil.EMPTY_OBJECT_ARRAY);
@@ -611,19 +613,19 @@
         }
       }
       catch (ClassCastException e) {
-        getLogger().error("Unknown classloader: " + e.getMessage());
+        getLogger().error("Unknown classloader [CCE]: " + e.getMessage());
       }
       catch (ClassNotFoundException e) {
-        getLogger().error("Unknown classloader: " + loader.getClass().getName());
+        getLogger().error("Unknown classloader [CNFE]: " + loader.getClass().getName());
       }
       catch (NoSuchMethodException e) {
-        getLogger().error("Unknown classloader: " + e.getMessage());
+        getLogger().error("Unknown classloader [NSME]: " + e.getMessage());
       }
       catch (IllegalAccessException e) {
-        getLogger().error("Unknown classloader: " + e.getMessage());
+        getLogger().error("Unknown classloader [IAE]: " + e.getMessage());
       }
       catch (InvocationTargetException e) {
-        getLogger().error("Unknown classloader: " + e.getMessage());
+        getLogger().error("Unknown classloader [ITE]: " + e.getMessage());
       }
     }
   }
