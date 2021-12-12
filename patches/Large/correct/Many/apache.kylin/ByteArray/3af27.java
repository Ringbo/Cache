diff --git a/core-common/src/main/java/org/apache/kylin/common/util/ByteArray.java b/core-common/src/main/java/org/apache/kylin/common/util/ByteArray.java
index 2288419..921d161 100644
--- a/core-common/src/main/java/org/apache/kylin/common/util/ByteArray.java
+++ b/core-common/src/main/java/org/apache/kylin/common/util/ByteArray.java
@@ -141,10 +141,10 @@
         if (data == null) {
             return 0;
         } else {
-            if (length <= Bytes.SIZEOF_LONG) {
+            if (length <= Bytes.SIZEOF_LONG && length > 0) {
                 //to avoid hash collision of byte arrays those are converted from nearby integers/longs, 
                 //which is the case for kylin dictionary
-                return Long.valueOf(Bytes.toLong(data, offset, length)).hashCode();
+                return Long.valueOf(BytesUtil.readLong(data, offset, length)).hashCode();
             }
             return Bytes.hashCode(data, offset, length);
         }
