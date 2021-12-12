diff --git a/components/camel-aws-sqs/src/test/java/org/apache/camel/component/aws/sqs/SqsFilterMessagesWithNoDeleteTest.java b/components/camel-aws-sqs/src/test/java/org/apache/camel/component/aws/sqs/SqsFilterMessagesWithNoDeleteTest.java
index 4b0cdc2..b5c2237 100644
--- a/components/camel-aws-sqs/src/test/java/org/apache/camel/component/aws/sqs/SqsFilterMessagesWithNoDeleteTest.java
+++ b/components/camel-aws-sqs/src/test/java/org/apache/camel/component/aws/sqs/SqsFilterMessagesWithNoDeleteTest.java
@@ -67,7 +67,7 @@
         });
         MockEndpoint result = MockEndpoint.resolve(ctx, "mock:result");
         clientMock.setScheduler(ctx.getExecutorServiceManager().newScheduledThreadPool(clientMock, "ClientMock Scheduler", 1));
-        registry.put("amazonSQSClient", clientMock);
+        registry.bind("amazonSQSClient", clientMock);
 
         result.expectedMessageCount(0);
 
@@ -111,7 +111,7 @@
             }
         });
         MockEndpoint result = MockEndpoint.resolve(ctx, "mock:result");
-        registry.put("amazonSQSClient", clientMock);
+        registry.bind("amazonSQSClient", clientMock);
         clientMock.setScheduler(ctx.getExecutorServiceManager().newScheduledThreadPool(clientMock, "ClientMock Scheduler", 1));
 
         result.expectedMessageCount(1);
