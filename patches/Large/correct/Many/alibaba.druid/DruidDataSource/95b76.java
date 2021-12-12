diff --git a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
index db71050..0d291cc 100644
--- a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
+++ b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
@@ -1065,7 +1065,7 @@
 
             String errorMessage = buf.toString();
 
-            if (this.createError == null) {
+            if (this.createError != null) {
                 throw new GetConnectionTimeoutException(errorMessage, createError);
             } else {
                 throw new GetConnectionTimeoutException(errorMessage);
