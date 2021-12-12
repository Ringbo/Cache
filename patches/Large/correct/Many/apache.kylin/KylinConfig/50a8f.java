diff --git a/common/src/main/java/org/apache/kylin/common/KylinConfig.java b/common/src/main/java/org/apache/kylin/common/KylinConfig.java
index 203633a..de8ca57 100644
--- a/common/src/main/java/org/apache/kylin/common/KylinConfig.java
+++ b/common/src/main/java/org/apache/kylin/common/KylinConfig.java
@@ -300,7 +300,7 @@
     }
 
     public void overrideKylinJobJarPath(String path) {
-        kylinConfig.setProperty(KYLIN_JOB_JAR, path);
+        System.setProperty(KYLIN_JOB_JAR, path);
     }
 
     private static final Pattern COPROCESSOR_JAR_NAME_PATTERN = Pattern.compile("kylin-coprocessor-(.+)\\.jar");
@@ -333,7 +333,7 @@
     }
 
     public void overrideCoprocessorLocalJar(String path) {
-        kylinConfig.setProperty(COPROCESSOR_LOCAL_JAR, path);
+        System.setProperty(COPROCESSOR_LOCAL_JAR, path);
     }
 
     public int getCoprocessorScanBitsThreshold() {
