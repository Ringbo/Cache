diff --git a/engine/src/main/java/org/terasology/config/Config.java b/engine/src/main/java/org/terasology/config/Config.java
index 271016b..4e7c2c4 100644
--- a/engine/src/main/java/org/terasology/config/Config.java
+++ b/engine/src/main/java/org/terasology/config/Config.java
@@ -202,7 +202,7 @@
                     return Optional.of(userConfig.getAsJsonObject());
                 }
             } catch (IOException e) {
-                logger.error("Failed to load config file {}, falling back on default config");
+                logger.error("Failed to load config file {}, falling back on default config", configPath);
             }
         }
         return Optional.empty();
