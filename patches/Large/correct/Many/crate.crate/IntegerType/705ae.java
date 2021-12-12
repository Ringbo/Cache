diff --git a/sql/src/main/java/io/crate/protocols/postgres/types/IntegerType.java b/sql/src/main/java/io/crate/protocols/postgres/types/IntegerType.java
index b794d1e..a659067 100644
--- a/sql/src/main/java/io/crate/protocols/postgres/types/IntegerType.java
+++ b/sql/src/main/java/io/crate/protocols/postgres/types/IntegerType.java
@@ -42,9 +42,9 @@
 
     @Override
     public int writeAsBinary(ChannelBuffer buffer, @Nonnull Object value) {
-        buffer.writeInt(INT32_BYTE_SIZE);
+        buffer.writeInt(TYPE_LEN);
         buffer.writeInt(((int) value));
-        return 8;
+        return INT32_BYTE_SIZE + TYPE_LEN;
     }
 
     @Override
@@ -54,7 +54,8 @@
 
     @Override
     public Object readBinaryValue(ChannelBuffer buffer, int valueLength) {
-        assert valueLength == 4 : "length should be 4 because int is int32. Actual length: " + valueLength;
+        assert valueLength == TYPE_LEN : "length should be " + TYPE_LEN + " because int is int32. Actual length: " +
+                                         valueLength;
         return buffer.readInt();
     }
 
