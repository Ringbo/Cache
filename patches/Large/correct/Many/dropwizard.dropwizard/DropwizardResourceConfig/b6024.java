diff --git a/dropwizard-jersey/src/main/java/io/dropwizard/jersey/DropwizardResourceConfig.java b/dropwizard-jersey/src/main/java/io/dropwizard/jersey/DropwizardResourceConfig.java
index a01c9ef..a943189 100644
--- a/dropwizard-jersey/src/main/java/io/dropwizard/jersey/DropwizardResourceConfig.java
+++ b/dropwizard-jersey/src/main/java/io/dropwizard/jersey/DropwizardResourceConfig.java
@@ -189,7 +189,7 @@
             }
         }
 
-        private String normalizePath(String basePath, String path) {
+        private static String normalizePath(String basePath, String path) {
             if (path == null) {
                 return basePath;
             }
