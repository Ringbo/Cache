diff --git a/modules/ggfs/src/test/java/org/gridgain/grid/kernal/processors/ggfs/GridGgfsStreamsSelfTest.java b/modules/ggfs/src/test/java/org/gridgain/grid/kernal/processors/ggfs/GridGgfsStreamsSelfTest.java
index 08a5f00..fa33eb9 100644
--- a/modules/ggfs/src/test/java/org/gridgain/grid/kernal/processors/ggfs/GridGgfsStreamsSelfTest.java
+++ b/modules/ggfs/src/test/java/org/gridgain/grid/kernal/processors/ggfs/GridGgfsStreamsSelfTest.java
@@ -210,8 +210,7 @@
     }
 
     /** @throws Exception If failed. */
-    // TODO Enable after GG-9154.
-    public void _testCreateFileFragmented() throws Exception {
+    public void testCreateFileFragmented() throws Exception {
         GridGgfsEx impl = (GridGgfsEx)grid(0).ggfs("ggfs");
 
         GridGgfsFragmentizerManager fragmentizer = impl.context().fragmentizer();
@@ -225,7 +224,8 @@
             GridGgfs fs1 = grid(1).ggfs("ggfs");
             GridGgfs fs2 = grid(2).ggfs("ggfs");
 
-            try (GridGgfsOutputStream out = fs0.create(path, false)) {
+            try (GridGgfsOutputStream out = fs0.create(path, 128, false, 1, CFG_GRP_SIZE,
+                F.asMap(GridGgfs.PROP_PREFER_LOCAL_WRITES, "true"))) {
                 // 1.5 blocks
                 byte[] data = new byte[CFG_BLOCK_SIZE * 3 / 2];
 
