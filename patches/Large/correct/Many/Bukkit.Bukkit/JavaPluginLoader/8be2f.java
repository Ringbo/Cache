diff --git a/src/org/bukkit/plugin/java/JavaPluginLoader.java b/src/org/bukkit/plugin/java/JavaPluginLoader.java
index 085e96f..bd6d0f8 100644
--- a/src/org/bukkit/plugin/java/JavaPluginLoader.java
+++ b/src/org/bukkit/plugin/java/JavaPluginLoader.java
@@ -41,7 +41,7 @@
             Constructor<? extends JavaPlugin> constructor = plugin.getConstructor(PluginLoader.class, Server.class, PluginDescriptionFile.class, File.class, ClassLoader.class);
 
             result = constructor.newInstance(this, server, description, file, loader);
-        } catch (Exception ex) {
+        } catch (Throwable ex) {
             throw new InvalidPluginException(ex);
         }
 
