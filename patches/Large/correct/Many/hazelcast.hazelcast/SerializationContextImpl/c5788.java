diff --git a/hazelcast/src/main/java/com/hazelcast/nio/serialization/SerializationContextImpl.java b/hazelcast/src/main/java/com/hazelcast/nio/serialization/SerializationContextImpl.java
index 9293dcc..12725d3 100644
--- a/hazelcast/src/main/java/com/hazelcast/nio/serialization/SerializationContextImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/nio/serialization/SerializationContextImpl.java
@@ -183,7 +183,7 @@
     }
 
     static long combineToLong(int x, int y) {
-        return ((long) x << 32) | ((long) y & 0xFFFFFFFL);
+        return ((long) x << 32) | ((long) y & 0xFFFFFFFFL);
     }
 
     static int extractInt(long value, boolean lowerBits) {
