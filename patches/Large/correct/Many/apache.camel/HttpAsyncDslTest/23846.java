diff --git a/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncDslTest.java b/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncDslTest.java
index 9a39def..abc97ea 100644
--- a/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncDslTest.java
+++ b/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncDslTest.java
@@ -111,8 +111,8 @@
                     // if the JMS ReplyTo was set then we expect a reply, otherwise not
                     // use a pool of 20 threads for the point forward
                     .threads(20)
-                    // do some CPU heavy processing of the message (we simulate and delay just 100 ms)
-                    .unmarshal(mySecureDataFormat).delay(100).to("bean:handleOrder").to("mock:order");
+                    // do some CPU heavy processing of the message (we simulate and delay just 500 ms)
+                    .unmarshal(mySecureDataFormat).delay(500).to("bean:handleOrder").to("mock:order");
                 // END SNIPPET: e1
             }
         };
