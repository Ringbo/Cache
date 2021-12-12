diff --git a/src/main/java/io/netty/handler/codec/serialization/CompactObjectOutputStream.java b/src/main/java/io/netty/handler/codec/serialization/CompactObjectOutputStream.java
index d386ce3..2e88e7c 100644
--- a/src/main/java/io/netty/handler/codec/serialization/CompactObjectOutputStream.java
+++ b/src/main/java/io/netty/handler/codec/serialization/CompactObjectOutputStream.java
@@ -39,7 +39,7 @@
     @Override
     protected void writeClassDescriptor(ObjectStreamClass desc) throws IOException {
         Class<?> clazz = desc.forClass();
-        if (clazz.isPrimitive() || clazz.isArray()) {
+        if (clazz.isPrimitive() || clazz.isArray() || desc.getSerialVersionUID() == 0) {
             write(TYPE_FAT_DESCRIPTOR);
             super.writeClassDescriptor(desc);
         } else {
