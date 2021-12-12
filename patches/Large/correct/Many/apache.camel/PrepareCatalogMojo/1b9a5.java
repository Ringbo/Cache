diff --git a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/PrepareCatalogMojo.java b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/PrepareCatalogMojo.java
index 924cdb1..68a3685 100644
--- a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/PrepareCatalogMojo.java
+++ b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/PrepareCatalogMojo.java
@@ -701,14 +701,14 @@
             File[] components = componentsDir.listFiles();
             if (components != null) {
                 for (File dir : components) {
-                    if (dir.isDirectory() && !"target".equals(dir.getName())) {
+                    if (dir.isDirectory() && !"target".equals(dir.getName()) && !dir.getName().startsWith(".")) {
                         File target = new File(dir, "src/main/docs");
 
                         int before = adocFiles.size();
                         findAsciiDocFilesRecursive(target, adocFiles, new CamelAsciiDocFileFilter());
                         int after = adocFiles.size();
 
-                        if (before != after) {
+                        if (before == after) {
                             missingAdocFiles.add(dir);
                         }
                     }
