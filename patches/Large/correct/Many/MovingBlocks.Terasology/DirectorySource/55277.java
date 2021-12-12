diff --git a/engine/src/main/java/org/terasology/asset/sources/DirectorySource.java b/engine/src/main/java/org/terasology/asset/sources/DirectorySource.java
index f636b45..7d51f03 100644
--- a/engine/src/main/java/org/terasology/asset/sources/DirectorySource.java
+++ b/engine/src/main/java/org/terasology/asset/sources/DirectorySource.java
@@ -52,7 +52,7 @@
                 } else if (Files.isRegularFile(child)) {
                     Path relativePath = basePath.relativize(child);
                     Path modulePath = relativePath.subpath(0, 1);
-                    AssetUri uri = getUri(modulePath.toString(), modulePath.relativize(child));
+                    AssetUri uri = getUri(modulePath.toString(), modulePath.relativize(relativePath));
                     if (uri != null) {
                         try {
                             addOverride(uri, child.toUri().toURL());
