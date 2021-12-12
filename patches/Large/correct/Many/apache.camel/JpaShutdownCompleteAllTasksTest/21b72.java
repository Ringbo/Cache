diff --git a/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaShutdownCompleteAllTasksTest.java b/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaShutdownCompleteAllTasksTest.java
index 2a0c0e9..4a37c83 100644
--- a/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaShutdownCompleteAllTasksTest.java
+++ b/components/camel-jpa/src/test/java/org/apache/camel/processor/jpa/JpaShutdownCompleteAllTasksTest.java
@@ -75,15 +75,15 @@
                 from("jpa://" + SendEmail.class.getName()).routeId("route1")
                      // let it complete all tasks
                      .shutdownRunningTask(ShutdownRunningTask.CompleteAllTasks)
-                     .delay(1000).to("seda:foo");
+                     .to("seda:foo");
 
-                from("seda:foo").routeId("route2").to("mock:bar");
+                from("seda:foo").delay(1000).to("mock:bar");
             }
         });
         context.start();
 
         MockEndpoint bar = getMockEndpoint("mock:bar");
-        bar.expectedMinimumMessageCount(1);
+        bar.expectedMinimumMessageCount(2);
 
         assertMockEndpointsSatisfied();
 
