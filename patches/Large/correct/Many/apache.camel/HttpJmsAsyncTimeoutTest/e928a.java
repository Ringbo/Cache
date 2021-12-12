diff --git a/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpJmsAsyncTimeoutTest.java b/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpJmsAsyncTimeoutTest.java
index c1e6dac..122e0f8 100644
--- a/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpJmsAsyncTimeoutTest.java
+++ b/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpJmsAsyncTimeoutTest.java
@@ -41,7 +41,7 @@
             fail("Should have thrown exception");
         } catch (CamelExecutionException e) {
             HttpOperationFailedException cause = assertIsInstanceOf(HttpOperationFailedException.class, e.getCause());
-            assertEquals(503, cause.getStatusCode());
+            assertEquals(504, cause.getStatusCode());
         }
     }
 
