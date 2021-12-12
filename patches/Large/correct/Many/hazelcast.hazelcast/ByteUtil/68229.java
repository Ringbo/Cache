diff --git a/hazelcast/src/main/java/com/hazelcast/util/ByteUtil.java b/hazelcast/src/main/java/com/hazelcast/util/ByteUtil.java
index d195b84..2233cae 100644
--- a/hazelcast/src/main/java/com/hazelcast/util/ByteUtil.java
+++ b/hazelcast/src/main/java/com/hazelcast/util/ByteUtil.java
@@ -131,7 +131,7 @@
     }
 
     public static long combineToLong(int x, int y) {
-        return ((long) x << 32) | ((long) y & 0xFFFFFFFL);
+        return ((long) x << 32) | ((long) y & 0xFFFFFFFFL);
     }
 
     public static int extractInt(long value, boolean lowerBits) {
