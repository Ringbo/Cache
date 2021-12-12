diff --git a/core/src/main/java/com/graphhopper/storage/GraphBuilder.java b/core/src/main/java/com/graphhopper/storage/GraphBuilder.java
index 40bc7db..ade6c75 100644
--- a/core/src/main/java/com/graphhopper/storage/GraphBuilder.java
+++ b/core/src/main/java/com/graphhopper/storage/GraphBuilder.java
@@ -44,7 +44,7 @@
      * <p/>
      * @see LevelGraph
      */
-    GraphBuilder setLevelGraph( boolean level )
+    public GraphBuilder setLevelGraph( boolean level )
     {
         this.level = level;
         return this;
@@ -103,7 +103,7 @@
      * Afterwards you'll need to call GraphStorage.create to have a useable object. Better use
      * create.
      */
-    GraphStorage build()
+    public GraphStorage build()
     {
         Directory dir;
         if (mmap)
