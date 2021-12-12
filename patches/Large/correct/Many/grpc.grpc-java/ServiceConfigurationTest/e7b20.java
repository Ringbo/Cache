diff --git a/core/src/test/java/io/grpc/internal/ServiceConfigurationTest.java b/core/src/test/java/io/grpc/internal/ServiceConfigurationTest.java
index 0d453ac..4df9c07 100644
--- a/core/src/test/java/io/grpc/internal/ServiceConfigurationTest.java
+++ b/core/src/test/java/io/grpc/internal/ServiceConfigurationTest.java
@@ -74,30 +74,30 @@
             Arrays.asList(
                 new MethodConfig(
                     Arrays.asList(new Name("SimpleService", "Foo")),
-                    /*waitForReady=*/ true,
-                    /*timeout=*/ null,
-                    /*maxRequestMessageBytes=*/ null,
-                    /*maxResponseMessageBytes=*/ null,
-                    /*retryPolicy=*/ null,
-                    /*hedgingPolicy=*/ null),
+                    /* waitForReady */ true,
+                    /* timeout */ null,
+                    /* maxRequestMessageBytes */ null,
+                    /* maxResponseMessageBytes */ null,
+                    /* retryPolicy */ null,
+                    /* hedgingPolicy */ null),
                 new MethodConfig(
                     Arrays.asList(new Name("SimpleService", "FooTwo")),
-                    /*waitForReady=*/ null,
-                    /*timeout=*/ null,
-                    /*maxRequestMessageBytes=*/ null,
-                    /*maxResponseMessageBytes=*/ null,
-                    /*retryPolicy=*/ null,
-                    /*hedgingPolicy=*/ null),
+                    /* waitForReady */ null,
+                    /* timeout */ null,
+                    /* maxRequestMessageBytes */ null,
+                    /* maxResponseMessageBytes */ null,
+                    /* retryPolicy */ null,
+                    /* hedgingPolicy */ null),
                 new MethodConfig(
                     Arrays.asList(new Name("SimpleService", "FooTwelve")),
-                    /*waitForReady=*/ false,
-                    /*timeout=*/ null,
-                    /*maxRequestMessageBytes=*/ null,
-                    /*maxResponseMessageBytes=*/ null,
-                    /*retryPolicy=*/ null,
-                    /*hedgingPolicy=*/ null)),
-            /*retryThrottlingPolicy=*/null);
+                    /* waitForReady */ false,
+                    /* timeout */ null,
+                    /* maxRequestMessageBytes */ null,
+                    /* maxResponseMessageBytes */ null,
+                    /* retryPolicy */ null,
+                    /* hedgingPolicy */ null)),
+            /* retryThrottlingPolicy */ null);
 
-    assertEquals(actual, expected);
+    assertEquals(expected, actual);
   }
 }
