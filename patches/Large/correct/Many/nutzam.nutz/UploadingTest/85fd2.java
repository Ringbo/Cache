diff --git a/test/org/nutz/mvc/upload/UploadingTest.java b/test/org/nutz/mvc/upload/UploadingTest.java
index 49c249a..8e3b149 100644
--- a/test/org/nutz/mvc/upload/UploadingTest.java
+++ b/test/org/nutz/mvc/upload/UploadingTest.java
@@ -38,7 +38,7 @@
 		}
 
 		Properties p = new Properties();
-		p.load(Streams.fileInr(f));
+		p.load(Streams.fileIn(f));
 		MockProperties.setMockProperties(p);
 
 		out.println("Begin ...");
