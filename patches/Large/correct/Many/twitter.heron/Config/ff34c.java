diff --git a/heron/common/src/java/com/twitter/heron/common/config/Config.java b/heron/common/src/java/com/twitter/heron/common/config/Config.java
index 6ac2d3a..1b06128 100644
--- a/heron/common/src/java/com/twitter/heron/common/config/Config.java
+++ b/heron/common/src/java/com/twitter/heron/common/config/Config.java
@@ -38,7 +38,7 @@
   }
 
   public String getEnv() {
-    return this.role;
+    return this.env;
   }
 
   public String getTopologyName() {
@@ -46,7 +46,7 @@
   }
 
   public String getConfigPath() {
-    return this.getConfigPath();
+    return this.configPath;
   }
 
   public static class Builder {
