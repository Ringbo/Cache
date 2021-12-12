diff --git a/src/java/org/codehaus/groovy/grails/support/MockFileResource.java b/src/java/org/codehaus/groovy/grails/support/MockFileResource.java
index 8da6415..ad4ea84 100644
--- a/src/java/org/codehaus/groovy/grails/support/MockFileResource.java
+++ b/src/java/org/codehaus/groovy/grails/support/MockFileResource.java
@@ -29,7 +29,7 @@
 public class MockFileResource extends ByteArrayResource{
     private String fileName;
 
-    public MockFileResource(String fileName, String contents) {
+    public MockFileResource(String fileName, String contents) throws UnsupportedEncodingException {
         super(contents.getBytes("UTF-8"));
         this.fileName = fileName;
     }
