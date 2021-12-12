diff --git a/hazelcast/src/main/java/com/hazelcast/nio/SerializationHelper.java b/hazelcast/src/main/java/com/hazelcast/nio/SerializationHelper.java
index 889d70f..f544f3e 100644
--- a/hazelcast/src/main/java/com/hazelcast/nio/SerializationHelper.java
+++ b/hazelcast/src/main/java/com/hazelcast/nio/SerializationHelper.java
@@ -38,7 +38,7 @@
             out.writeDouble((Double) obj);
         } else if (obj instanceof Float) {
             out.writeByte(5);
-            out.writeDouble((Float) obj);
+            out.writeFloat((Float) obj);
         } else if (obj instanceof Boolean) {
             out.writeByte(6);
             out.writeBoolean((Boolean) obj);
@@ -66,7 +66,7 @@
         if (type == 0) {
             return null;
         } else if (type == 1) {
-            return in.readInt();
+            return in.readLong();
         } else if (type == 2) {
             return in.readInt();
         } else if (type == 3) {
