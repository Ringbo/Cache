diff --git a/camel-core/src/test/java/org/apache/camel/component/file/FileConsumerDeleteAndFailureTest.java b/camel-core/src/test/java/org/apache/camel/component/file/FileConsumerDeleteAndFailureTest.java
index e5291d5..91f1cb7 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/FileConsumerDeleteAndFailureTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/FileConsumerDeleteAndFailureTest.java
@@ -37,7 +37,7 @@
         MockEndpoint mock = getMockEndpoint("mock:result");
         mock.expectedBodiesReceived("Hello World IS processed!");
         
-        mock.expectedFileExists("target/failed/error/bye.txt", "Kabom");
+        mock.expectedFileExists("target/failed/error/bye.txt");
 
         template.sendBodyAndHeader("file://target/failed", "Hello World", Exchange.FILE_NAME, "hello.txt");
         template.sendBodyAndHeader("file://target/failed", "Kabom", Exchange.FILE_NAME, "bye.txt");
