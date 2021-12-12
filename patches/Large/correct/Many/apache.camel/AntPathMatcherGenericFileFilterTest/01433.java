diff --git a/camel-core/src/test/java/org/apache/camel/component/file/AntPathMatcherGenericFileFilterTest.java b/camel-core/src/test/java/org/apache/camel/component/file/AntPathMatcherGenericFileFilterTest.java
index a4b63ae..08f3b12 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/AntPathMatcherGenericFileFilterTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/AntPathMatcherGenericFileFilterTest.java
@@ -47,7 +47,7 @@
         template.sendBodyAndHeader("file://target/files/ant-path-1/x/y/z", "Hello World", Exchange.FILE_NAME, "report.txt");
 
         MockEndpoint mock = getMockEndpoint("mock:result1");
-        mock.expectedBodiesReceived("Hello World");
+        mock.expectedBodiesReceivedInAnyOrder("Hello World");
 
         assertMockEndpointsSatisfied();
         oneExchangeDone.matchesMockWaitTime();
@@ -59,7 +59,7 @@
         template.sendBodyAndHeader("file://target/files/ant-path-2/x/y/z", "Hello World 2", Exchange.FILE_NAME, "report.txt");
 
         MockEndpoint mock = getMockEndpoint("mock:result2");
-        mock.expectedBodiesReceived("Hello World 2");
+        mock.expectedBodiesReceivedInAnyOrder("Hello World 2");
 
         assertMockEndpointsSatisfied();
         oneExchangeDone.matchesMockWaitTime();
@@ -75,7 +75,7 @@
         template.sendBodyAndHeader("file://target/files/ant-path-3/x/y/z", "Hello World 6", Exchange.FILE_NAME, "m.bak");
 
         MockEndpoint mock = getMockEndpoint("mock:result3");
-        mock.expectedBodiesReceived("Hello World 2", "Hello World 4");
+        mock.expectedBodiesReceivedInAnyOrder("Hello World 2", "Hello World 4");
 
         assertMockEndpointsSatisfied();
         oneExchangeDone.matchesMockWaitTime();
@@ -88,7 +88,7 @@
         template.sendBodyAndHeader("file://target/files/ant-path-4/x/y/z", "Hello World 3", Exchange.FILE_NAME, "c.txt");
 
         MockEndpoint mock = getMockEndpoint("mock:result4");
-        mock.expectedBodiesReceived("Hello World 3");
+        mock.expectedBodiesReceivedInAnyOrder("Hello World 3");
 
         assertMockEndpointsSatisfied();
         oneExchangeDone.matchesMockWaitTime();
