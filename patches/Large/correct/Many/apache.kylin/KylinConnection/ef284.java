diff --git a/jdbc/src/main/java/org/apache/kylin/jdbc/KylinConnection.java b/jdbc/src/main/java/org/apache/kylin/jdbc/KylinConnection.java
index 6c7fae4..991eca3 100644
--- a/jdbc/src/main/java/org/apache/kylin/jdbc/KylinConnection.java
+++ b/jdbc/src/main/java/org/apache/kylin/jdbc/KylinConnection.java
@@ -57,7 +57,7 @@
         assert temps.length >= 2;
 
         this.project = temps[temps.length - 1];
-        this.baseUrl = odbcUrl.substring(0, odbcUrl.indexOf(project) - 1);
+        this.baseUrl = odbcUrl.substring(0, odbcUrl.lastIndexOf(project) - 1);
 
         logger.debug("Kylin base url " + this.baseUrl + ", project name " + this.project);
 
