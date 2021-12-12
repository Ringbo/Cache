diff --git a/fabric/fabric-api/src/main/java/org/fusesource/fabric/api/ContainerOptions.java b/fabric/fabric-api/src/main/java/org/fusesource/fabric/api/ContainerOptions.java
index a73cfea..8ec6ad8 100644
--- a/fabric/fabric-api/src/main/java/org/fusesource/fabric/api/ContainerOptions.java
+++ b/fabric/fabric-api/src/main/java/org/fusesource/fabric/api/ContainerOptions.java
@@ -58,7 +58,7 @@
             this.minimumPort = Integer.parseInt(System.getProperty("minimum.port", String.valueOf(minimumPort)));
             this.maximumPort = Integer.parseInt(System.getProperty("maximum.port", String.valueOf(maximumPort)));
             this.profiles(System.getProperty(PROFILES, ""));
-            this.profiles(System.getProperty(VERSION, DEFAULT_VERSION));
+            this.version(System.getProperty(VERSION, DEFAULT_VERSION));
             return (B) this;
         }
 
