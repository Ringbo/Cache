diff --git a/camel-core/src/test/java/org/apache/camel/processor/async/AsyncRouteWaitIfReplyExpectedTest.java b/camel-core/src/test/java/org/apache/camel/processor/async/AsyncRouteWaitIfReplyExpectedTest.java
index a190888..85b4bcf 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/async/AsyncRouteWaitIfReplyExpectedTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/async/AsyncRouteWaitIfReplyExpectedTest.java
@@ -85,7 +85,7 @@
                             // so we do a bit of delay to simulate heavy work that takes time
                         .to("mock:foo")
                             // wait a litter longer for the slow box
-                        .delay(500)
+                        .delay(1000)
                             // and we also work with the message so we can prepare a response
                         .process(new MyProcessor())
                             // and we use mocks for unit testing
