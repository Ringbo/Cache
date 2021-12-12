diff --git a/java/java-tests/testSrc/com/intellij/refactoring/PullUpMultifileTest.java b/java/java-tests/testSrc/com/intellij/refactoring/PullUpMultifileTest.java
index 77a52fb..fcfbec4 100644
--- a/java/java-tests/testSrc/com/intellij/refactoring/PullUpMultifileTest.java
+++ b/java/java-tests/testSrc/com/intellij/refactoring/PullUpMultifileTest.java
@@ -54,7 +54,7 @@
   }
 
   protected Sdk getTestProjectJdk() {
-    return JavaSdkImpl.getMockJdk15("java 1.5");
+    return JavaSdkImpl.getMockJdk17("java 1.5");
   }
 
 
