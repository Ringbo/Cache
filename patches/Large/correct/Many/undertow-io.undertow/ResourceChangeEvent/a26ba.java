diff --git a/core/src/main/java/io/undertow/server/handlers/resource/ResourceChangeEvent.java b/core/src/main/java/io/undertow/server/handlers/resource/ResourceChangeEvent.java
index a25eff0..6709b1c 100644
--- a/core/src/main/java/io/undertow/server/handlers/resource/ResourceChangeEvent.java
+++ b/core/src/main/java/io/undertow/server/handlers/resource/ResourceChangeEvent.java
@@ -7,15 +7,15 @@
  */
 public class ResourceChangeEvent {
 
-    private final Resource resource;
+    private final String resource;
     private final Type type;
 
-    public ResourceChangeEvent(Resource resource, Type type) {
+    public ResourceChangeEvent(String resource, Type type) {
         this.resource = resource;
         this.type = type;
     }
 
-    public Resource getResource() {
+    public String getResource() {
         return resource;
     }
 
