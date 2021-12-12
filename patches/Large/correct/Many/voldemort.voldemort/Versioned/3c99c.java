diff --git a/src/java/voldemort/versioning/Versioned.java b/src/java/voldemort/versioning/Versioned.java
index 807fe15..f46ae0a 100644
--- a/src/java/voldemort/versioning/Versioned.java
+++ b/src/java/voldemort/versioning/Versioned.java
@@ -44,7 +44,8 @@
         this.object = object;
     }
 
-    public VectorClock getVersion() {
+    // public VectorClock getVersion() {
+    public Version getVersion() {
         return version;
     }
 
