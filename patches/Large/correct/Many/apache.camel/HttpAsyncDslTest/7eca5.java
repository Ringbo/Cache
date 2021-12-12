diff --git a/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncDslTest.java b/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncDslTest.java
index 62d1a32..2e218db 100644
--- a/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncDslTest.java
+++ b/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncDslTest.java
@@ -115,7 +115,7 @@
                     // use a pool of 20 threads for the point forward
                     .threads(20)
                     // do some CPU heavy processing of the message (we simulate and delay just 500 ms)
-                    .unmarshal(mySecureDataFormat).delay(1000).to("bean:handleOrder").to("mock:order");
+                    .unmarshal(mySecureDataFormat).delay(500).to("bean:handleOrder").to("mock:order");
                 // END SNIPPET: e1
             }
         };
