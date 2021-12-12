diff --git a/fml/common/cpw/mods/fml/common/ProxyInjector.java b/fml/common/cpw/mods/fml/common/ProxyInjector.java
index fdf8f3e..7b16a55 100644
--- a/fml/common/cpw/mods/fml/common/ProxyInjector.java
+++ b/fml/common/cpw/mods/fml/common/ProxyInjector.java
@@ -47,7 +47,7 @@
         }
         else if (type == Side.BUKKIT)
         {
-            return this.bukkitName.isEmpty();
+            return !this.bukkitName.isEmpty();
         }
         return false;
     }
