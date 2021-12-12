diff --git a/plugins-management/src/com/intellij/ide/plugins/PluginManager.java b/plugins-management/src/com/intellij/ide/plugins/PluginManager.java
index 76b82ff..e98c353 100644
--- a/plugins-management/src/com/intellij/ide/plugins/PluginManager.java
+++ b/plugins-management/src/com/intellij/ide/plugins/PluginManager.java
@@ -659,23 +659,23 @@
           }
         }
         else {
-          getLogger().error("Unknown classloader: " + loader.getClass().getName());
+          getLogger().warn("Unknown classloader: " + loader.getClass().getName());
         }
       }
       catch (ClassCastException e) {
-        getLogger().error("Unknown classloader [CCE]: " + e.getMessage());
+        getLogger().warn("Unknown classloader [CCE]: " + e.getMessage());
       }
       catch (ClassNotFoundException e) {
-        getLogger().error("Unknown classloader [CNFE]: " + loader.getClass().getName());
+        getLogger().warn("Unknown classloader [CNFE]: " + loader.getClass().getName());
       }
       catch (NoSuchMethodException e) {
-        getLogger().error("Unknown classloader [NSME]: " + e.getMessage());
+        getLogger().warn("Unknown classloader [NSME]: " + e.getMessage());
       }
       catch (IllegalAccessException e) {
-        getLogger().error("Unknown classloader [IAE]: " + e.getMessage());
+        getLogger().warn("Unknown classloader [IAE]: " + e.getMessage());
       }
       catch (InvocationTargetException e) {
-        getLogger().error("Unknown classloader [ITE]: " + e.getMessage());
+        getLogger().warn("Unknown classloader [ITE]: " + e.getMessage());
       }
     }
   }
