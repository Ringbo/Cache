diff --git a/java/org/apache/catalina/loader/WebappClassLoader.java b/java/org/apache/catalina/loader/WebappClassLoader.java
index 46c88a6..ce24da5 100644
--- a/java/org/apache/catalina/loader/WebappClassLoader.java
+++ b/java/org/apache/catalina/loader/WebappClassLoader.java
@@ -2022,7 +2022,7 @@
             }
             Class<?> lpClass =
                 defineClass("org.apache.catalina.loader.JdbcLeakPrevention",
-                    classBytes, 0, offset);
+                    classBytes, 0, offset, this.getClass().getProtectionDomain());
             Object obj = lpClass.newInstance();
             @SuppressWarnings("unchecked") // clearJdbcDriverRegistrations() returns List<String> 
             List<String> driverNames = (List<String>) obj.getClass().getMethod(
