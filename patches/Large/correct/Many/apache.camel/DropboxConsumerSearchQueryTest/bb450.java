diff --git a/components/camel-dropbox/src/test/java/org/apache/camel/component/dropbox/integration/consumer/DropboxConsumerSearchQueryTest.java b/components/camel-dropbox/src/test/java/org/apache/camel/component/dropbox/integration/consumer/DropboxConsumerSearchQueryTest.java
index d343a75..6ed78f4 100644
--- a/components/camel-dropbox/src/test/java/org/apache/camel/component/dropbox/integration/consumer/DropboxConsumerSearchQueryTest.java
+++ b/components/camel-dropbox/src/test/java/org/apache/camel/component/dropbox/integration/consumer/DropboxConsumerSearchQueryTest.java
@@ -31,7 +31,7 @@
         final String content = "Hi camels";
         createFile(FILE_NAME, content);
 
-        context.startRoute("consumer");
+        context.start();
 
         MockEndpoint mock = getMockEndpoint("mock:result");
         mock.expectedMinimumMessageCount(1);
