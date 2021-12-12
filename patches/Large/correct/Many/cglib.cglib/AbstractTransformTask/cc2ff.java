diff --git a/src/proxy/net/sf/cglib/transform/AbstractTransformTask.java b/src/proxy/net/sf/cglib/transform/AbstractTransformTask.java
index d804b08..cee667f 100644
--- a/src/proxy/net/sf/cglib/transform/AbstractTransformTask.java
+++ b/src/proxy/net/sf/cglib/transform/AbstractTransformTask.java
@@ -137,7 +137,7 @@
             
             ZipInputStream zip = new ZipInputStream(new FileInputStream(file));
             try {
-                FileOutputStream fout = new FileOutputStream(tempFile, false);
+                FileOutputStream fout = new FileOutputStream(tempFile);
                 try{
                  ZipOutputStream out = new ZipOutputStream(fout);
                                 
