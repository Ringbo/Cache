diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/idmanagement/ConsistentKeyIDAuthority.java b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/idmanagement/ConsistentKeyIDAuthority.java
index cb5179a..bf20a9e 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/idmanagement/ConsistentKeyIDAuthority.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/idmanagement/ConsistentKeyIDAuthority.java
@@ -50,7 +50,7 @@
 
     private static final Logger log = LoggerFactory.getLogger(ConsistentKeyIDAuthority.class);
 
-    private static final StaticBuffer LOWER_SLICE = BufferUtil.zeroBuffer(16);
+    private static final StaticBuffer LOWER_SLICE = BufferUtil.zeroBuffer(1);
     private static final StaticBuffer UPPER_SLICE = BufferUtil.oneBuffer(16);
 
     private final StoreManager manager;
