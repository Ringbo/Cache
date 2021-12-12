diff --git a/camel-core/src/test/java/org/apache/camel/component/timer/TimerRouteWithTracerTest.java b/camel-core/src/test/java/org/apache/camel/component/timer/TimerRouteWithTracerTest.java
index c33d763..bd763cb 100644
--- a/camel-core/src/test/java/org/apache/camel/component/timer/TimerRouteWithTracerTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/timer/TimerRouteWithTracerTest.java
@@ -30,7 +30,7 @@
         return new RouteBuilder() {
             public void configure() {
                 getContext().addInterceptStrategy(new Tracer());
-                from("timer://foo?fixedRate=true&delay=0&period=500").to("bean:myBean");
+                from("timer://foo?fixedRate=true&delay=0&period=500").to("bean:myBean", "mock:result");
             }
         };
     }
