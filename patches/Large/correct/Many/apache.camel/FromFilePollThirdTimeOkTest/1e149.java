diff --git a/camel-core/src/test/java/org/apache/camel/component/file/FromFilePollThirdTimeOkTest.java b/camel-core/src/test/java/org/apache/camel/component/file/FromFilePollThirdTimeOkTest.java
index 293b5c9..c24162d 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/FromFilePollThirdTimeOkTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/FromFilePollThirdTimeOkTest.java
@@ -47,7 +47,7 @@
         assertMockEndpointsSatisfied();
 
         // give time to delete file
-        Thread.sleep(200);
+        Thread.sleep(500);
 
         assertEquals(3, counter);
 
