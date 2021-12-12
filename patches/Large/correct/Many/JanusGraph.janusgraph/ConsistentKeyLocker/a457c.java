diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/locking/consistentkey/ConsistentKeyLocker.java b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/locking/consistentkey/ConsistentKeyLocker.java
index 063cb26..0908c03 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/locking/consistentkey/ConsistentKeyLocker.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/locking/consistentkey/ConsistentKeyLocker.java
@@ -128,7 +128,7 @@
 
     private static final StaticBuffer zeroBuf = BufferUtil.getIntBuffer(0); // TODO this does not belong here
 
-    public static final StaticBuffer LOCK_COL_START = BufferUtil.zeroBuffer(9);
+    public static final StaticBuffer LOCK_COL_START = BufferUtil.zeroBuffer(1);
     public static final StaticBuffer LOCK_COL_END   = BufferUtil.oneBuffer(9);
 
     private static final Logger log = LoggerFactory.getLogger(ConsistentKeyLocker.class);
