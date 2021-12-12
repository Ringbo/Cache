diff --git a/java/org/apache/catalina/startup/CatalinaBaseConfigurationSource.java b/java/org/apache/catalina/startup/CatalinaBaseConfigurationSource.java
index b62df22..8846bd8 100644
--- a/java/org/apache/catalina/startup/CatalinaBaseConfigurationSource.java
+++ b/java/org/apache/catalina/startup/CatalinaBaseConfigurationSource.java
@@ -64,7 +64,8 @@
                 }
             }
         }
-        if (result == null) {
+
+        if (result == null && ioe != null) {
             throw ioe;
         } else {
             return result;
