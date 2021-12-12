diff --git a/java/org/apache/catalina/webresources/AbstractArchiveResourceSet.java b/java/org/apache/catalina/webresources/AbstractArchiveResourceSet.java
index 802000b..3802032 100644
--- a/java/org/apache/catalina/webresources/AbstractArchiveResourceSet.java
+++ b/java/org/apache/catalina/webresources/AbstractArchiveResourceSet.java
@@ -219,7 +219,7 @@
             if (pathInJar.equals("")) {
                 // Special case
                 return new JarResourceRoot(root, new File(getBase()),
-                        pathInJar, path);
+                        baseUrlString, path);
             } else {
                 JarEntry jarEntry = null;
                 if (!(pathInJar.charAt(pathInJar.length() - 1) == '/')) {
