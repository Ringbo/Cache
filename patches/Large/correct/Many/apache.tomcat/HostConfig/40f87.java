diff --git a/java/org/apache/catalina/startup/HostConfig.java b/java/org/apache/catalina/startup/HostConfig.java
index 40a4a49..6df1c2e 100644
--- a/java/org/apache/catalina/startup/HostConfig.java
+++ b/java/org/apache/catalina/startup/HostConfig.java
@@ -478,7 +478,7 @@
 
         File appBase = appBase();
         File configBase = configBase();
-        ContextName cn = new ContextName(name);
+        ContextName cn = new ContextName(name, null);
         String baseName = cn.getBaseName();
         
         // Deploy XML descriptors from configBase
