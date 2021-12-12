diff --git a/common/src/main/java/org/apache/kylin/common/KylinConfig.java b/common/src/main/java/org/apache/kylin/common/KylinConfig.java
index f215f32..6267257 100644
--- a/common/src/main/java/org/apache/kylin/common/KylinConfig.java
+++ b/common/src/main/java/org/apache/kylin/common/KylinConfig.java
@@ -514,7 +514,7 @@
 
     public static InputStream getKylinPropertiesAsInputSteam() {
 
-        String kylinHome = System.getProperty(KYLIN_HOME);
+        String kylinHome = System.getenv(KYLIN_HOME);
         if (StringUtils.isEmpty(kylinHome)) {
             logger.error("KYLIN_HOME has not been set");
             throw new RuntimeException("KYLIN_HOME has not been set");
