diff --git a/src/java/org/codehaus/groovy/grails/support/MockFileResource.java b/src/java/org/codehaus/groovy/grails/support/MockFileResource.java
index 1c06bd3..8da6415 100644
--- a/src/java/org/codehaus/groovy/grails/support/MockFileResource.java
+++ b/src/java/org/codehaus/groovy/grails/support/MockFileResource.java
@@ -30,7 +30,7 @@
     private String fileName;
 
     public MockFileResource(String fileName, String contents) {
-        super(contents.getBytes());
+        super(contents.getBytes("UTF-8"));
         this.fileName = fileName;
     }
 
