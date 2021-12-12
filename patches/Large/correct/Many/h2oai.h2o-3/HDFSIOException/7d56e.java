diff --git a/h2o-core/src/main/java/water/api/HDFSIOException.java b/h2o-core/src/main/java/water/api/HDFSIOException.java
index 747513c..026b747 100644
--- a/h2o-core/src/main/java/water/api/HDFSIOException.java
+++ b/h2o-core/src/main/java/water/api/HDFSIOException.java
@@ -1,9 +1,10 @@
 package water.api;
 
 public class HDFSIOException extends APIException {
-  public HDFSIOException(String hdfsURI, String hdfsConf, Throwable t) {
+  public HDFSIOException(String hdfsURI, String hdfsConf, Exception e) {
     super( "HDFS IO Failure: \n"
-            + " accessed URI : " + hdfsURI
-            + " configuration: " + hdfsConf, t);
+            + " accessed URI : " + hdfsURI + "\n"
+            + " configuration: " + hdfsConf + "\n"
+            + " " + e);
   }
 }
