diff --git a/hadoop-tools/hadoop-sls/src/main/java/org/apache/hadoop/yarn/sls/RumenToSLSConverter.java b/hadoop-tools/hadoop-sls/src/main/java/org/apache/hadoop/yarn/sls/RumenToSLSConverter.java
index 63d022b..0d0745c 100644
--- a/hadoop-tools/hadoop-sls/src/main/java/org/apache/hadoop/yarn/sls/RumenToSLSConverter.java
+++ b/hadoop-tools/hadoop-sls/src/main/java/org/apache/hadoop/yarn/sls/RumenToSLSConverter.java
@@ -110,7 +110,7 @@
     if (! nodeFile.getParentFile().exists()
             && ! nodeFile.getParentFile().mkdirs()) {
       System.err.println("ERROR: Cannot create output directory in path: "
-              + jsonFile.getParentFile().getAbsoluteFile());
+              + nodeFile.getParentFile().getAbsoluteFile());
       System.exit(1);
     }
 
