diff --git a/security/subsystem/src/main/java/org/jboss/as/security/service/JaccService.java b/security/subsystem/src/main/java/org/jboss/as/security/service/JaccService.java
index b8a01b2..4cf780f 100644
--- a/security/subsystem/src/main/java/org/jboss/as/security/service/JaccService.java
+++ b/security/subsystem/src/main/java/org/jboss/as/security/service/JaccService.java
@@ -113,7 +113,7 @@
         final ClassLoader originalClassLoader;
         final ClassLoader jaccClassLoader;
         if (module != null) {
-            jaccClassLoader = SecurityActions.getModuleClassLoader(JACC_MODULE);
+            jaccClassLoader = SecurityActions.getModuleClassLoader(module);
             originalClassLoader = SecurityActions.setThreadContextClassLoader(jaccClassLoader);
         } else {
             jaccClassLoader = null;
