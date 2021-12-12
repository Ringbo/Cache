diff --git a/src/main/java/io/netty/handler/codec/serialization/CompactObjectInputStream.java b/src/main/java/io/netty/handler/codec/serialization/CompactObjectInputStream.java
index baa9f16..7bfc0bf 100644
--- a/src/main/java/io/netty/handler/codec/serialization/CompactObjectInputStream.java
+++ b/src/main/java/io/netty/handler/codec/serialization/CompactObjectInputStream.java
@@ -55,7 +55,7 @@
         case CompactObjectOutputStream.TYPE_THIN_DESCRIPTOR:
             String className = readUTF();
             Class<?> clazz = classResolver.resolve(className);
-            return ObjectStreamClass.lookupAny(clazz);
+            return ObjectStreamClass.lookup(clazz);
         default:
             throw new StreamCorruptedException(
                     "Unexpected class descriptor type: " + type);
