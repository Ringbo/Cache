diff --git a/liquibase-core/src/main/java/liquibase/resource/ClassLoaderResourceAccessor.java b/liquibase-core/src/main/java/liquibase/resource/ClassLoaderResourceAccessor.java
index 07bd415..830f7c0 100644
--- a/liquibase-core/src/main/java/liquibase/resource/ClassLoaderResourceAccessor.java
+++ b/liquibase-core/src/main/java/liquibase/resource/ClassLoaderResourceAccessor.java
@@ -107,12 +107,12 @@
                     while (entries.hasMoreElements()) {
                         JarEntry entry = entries.nextElement();
 
-                        if (entry.getName().startsWith(resourcePath)) {
+                        if (entry.getName().startsWith(path)) {
 
                             if (!recursive) {
-                                String pathAsDir = resourcePath.endsWith("/")
-                                        ? resourcePath
-                                        : resourcePath + "/";
+                                String pathAsDir = path.endsWith("/")
+                                        ? path
+                                        : path + "/";
                                 if (!entry.getName().startsWith(pathAsDir)
                                  || entry.getName().substring(pathAsDir.length()).contains("/")) {
                                     continue;
