diff --git a/collector/src/main/java/com/navercorp/pinpoint/collector/mapper/thrift/stat/JvmGcDetailedBoMapper.java b/collector/src/main/java/com/navercorp/pinpoint/collector/mapper/thrift/stat/JvmGcDetailedBoMapper.java
index 06ea407..2d56166 100644
--- a/collector/src/main/java/com/navercorp/pinpoint/collector/mapper/thrift/stat/JvmGcDetailedBoMapper.java
+++ b/collector/src/main/java/com/navercorp/pinpoint/collector/mapper/thrift/stat/JvmGcDetailedBoMapper.java
@@ -31,7 +31,7 @@
     public JvmGcDetailedBo map(TJvmGcDetailed tJvmGcDetailed) {
         JvmGcDetailedBo jvmGcDetailedBo = new JvmGcDetailedBo();
         jvmGcDetailedBo.setGcNewCount(tJvmGcDetailed.getJvmGcNewCount());
-        jvmGcDetailedBo.setGcNewTime(tJvmGcDetailed.getJvmGcNewCount());
+        jvmGcDetailedBo.setGcNewTime(tJvmGcDetailed.getJvmGcNewTime());
         jvmGcDetailedBo.setCodeCacheUsed(tJvmGcDetailed.getJvmPoolCodeCacheUsed());
         jvmGcDetailedBo.setNewGenUsed(tJvmGcDetailed.getJvmPoolNewGenUsed());
         jvmGcDetailedBo.setOldGenUsed(tJvmGcDetailed.getJvmPoolOldGenUsed());
