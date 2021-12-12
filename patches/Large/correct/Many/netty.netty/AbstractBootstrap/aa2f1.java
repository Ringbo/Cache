diff --git a/transport/src/main/java/io/netty/bootstrap/AbstractBootstrap.java b/transport/src/main/java/io/netty/bootstrap/AbstractBootstrap.java
index ad57262..99173c1 100644
--- a/transport/src/main/java/io/netty/bootstrap/AbstractBootstrap.java
+++ b/transport/src/main/java/io/netty/bootstrap/AbstractBootstrap.java
@@ -461,7 +461,7 @@
             }
         } catch (Throwable t) {
             logger.warn(
-                    "Failed to set channel option '{}' with value '{}' for channel '{}'", option, channel, channel, t);
+                    "Failed to set channel option '{}' with value '{}' for channel '{}'", option, value, channel, t);
         }
     }
 
