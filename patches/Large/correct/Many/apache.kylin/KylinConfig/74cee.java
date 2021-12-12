diff --git a/common/src/main/java/org/apache/kylin/common/KylinConfig.java b/common/src/main/java/org/apache/kylin/common/KylinConfig.java
index 0809a1f..deb2eda 100644
--- a/common/src/main/java/org/apache/kylin/common/KylinConfig.java
+++ b/common/src/main/java/org/apache/kylin/common/KylinConfig.java
@@ -452,7 +452,7 @@
     }
 
     public String getHbaseDefaultCompressionCodec() {
-        return getOptional(HTABLE_DEFAULT_COMPRESSION_CODEC);
+        return getOptional(HTABLE_DEFAULT_COMPRESSION_CODEC, "");
 
     }
 
