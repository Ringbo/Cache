diff --git a/api/src/main/java/net/md_5/bungee/api/plugin/PluginManager.java b/api/src/main/java/net/md_5/bungee/api/plugin/PluginManager.java
index 07cd79b..1a5f386 100644
--- a/api/src/main/java/net/md_5/bungee/api/plugin/PluginManager.java
+++ b/api/src/main/java/net/md_5/bungee/api/plugin/PluginManager.java
@@ -166,11 +166,11 @@
                 Plugin plugin = (Plugin) main.getDeclaredConstructor().newInstance();
 
                 plugin.init(desc);
-                plugins.put(pdf.getName(), plugin);
+                plugins.put(desc.getName(), plugin);
                 plugin.onLoad();
                 ProxyServer.getInstance().getLogger().log(Level.INFO, "Loaded plugin {0} version {1} by {2}", new Object[]
                         {
-                            plugin.getDescription().getName(), plugin.getDescription().getVersion(), plugin.getDescription().getAuthor()
+                            desc.getName(), desc.getVersion(), desc.getAuthor()
                         });
             }
         }
