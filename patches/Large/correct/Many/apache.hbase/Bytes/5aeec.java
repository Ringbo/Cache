diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/util/Bytes.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/util/Bytes.java
index 1b66341..b085b3e 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/util/Bytes.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/util/Bytes.java
@@ -1127,7 +1127,7 @@
    * @return the short value
    */
   public static short toShort(byte[] bytes) {
-    return toShortUnsafe(bytes, 0);
+    return toShort(bytes, 0, SIZEOF_SHORT);
   }
 
   /**
