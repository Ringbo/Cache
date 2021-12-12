diff --git a/liquibase-core/src/main/java/liquibase/servicelocator/DefaultPackageScanClassResolver.java b/liquibase-core/src/main/java/liquibase/servicelocator/DefaultPackageScanClassResolver.java
index e813195..15004a8 100644
--- a/liquibase-core/src/main/java/liquibase/servicelocator/DefaultPackageScanClassResolver.java
+++ b/liquibase-core/src/main/java/liquibase/servicelocator/DefaultPackageScanClassResolver.java
@@ -383,7 +383,7 @@
             JarEntry entry;
             while ((entry = jarStream.getNextJarEntry()) != null) {
                 String name = entry.getName();
-                if (name != null) {
+                if (name != null && name.contains(parent)) {
                     name = name.trim();
                     if (!entry.isDirectory() && name.endsWith(".class")) {
                         loadClass(name, loader);
