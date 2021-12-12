diff --git a/core/src/main/java/io/undertow/server/handlers/resource/FileResource.java b/core/src/main/java/io/undertow/server/handlers/resource/FileResource.java
index 3ae153b..2c1f50b 100644
--- a/core/src/main/java/io/undertow/server/handlers/resource/FileResource.java
+++ b/core/src/main/java/io/undertow/server/handlers/resource/FileResource.java
@@ -90,7 +90,7 @@
     public List<Resource> list() {
         final List<Resource> resources = new ArrayList<Resource>();
         for (String child : file.list()) {
-            resources.add(new FileResource(new File(child), resourceManagerRoot));
+            resources.add(new FileResource(new File(this.file, child), resourceManagerRoot));
         }
         return resources;
     }
