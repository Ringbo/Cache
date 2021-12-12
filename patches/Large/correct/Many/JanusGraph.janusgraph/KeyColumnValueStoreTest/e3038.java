diff --git a/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/KeyColumnValueStoreTest.java b/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/KeyColumnValueStoreTest.java
index 19f563e..075d0ef 100644
--- a/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/KeyColumnValueStoreTest.java
+++ b/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/KeyColumnValueStoreTest.java
@@ -17,7 +17,7 @@
 
 public abstract class KeyColumnValueStoreTest {
 
-    private Logger log = LoggerFactory.getLogger(KeyValueStoreTest.class);
+    private Logger log = LoggerFactory.getLogger(KeyColumnValueStoreTest.class);
 
     int numKeys = 500;
     int numColumns = 50;
