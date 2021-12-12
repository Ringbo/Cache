diff --git a/camel-core/src/test/java/org/apache/camel/processor/ShutdownDeferTest.java b/camel-core/src/test/java/org/apache/camel/processor/ShutdownDeferTest.java
index b1ed53b..cd805b4 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/ShutdownDeferTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/ShutdownDeferTest.java
@@ -32,7 +32,7 @@
 
         MockEndpoint bar = getMockEndpoint("mock:bar");
         bar.expectedMinimumMessageCount(1);
-        bar.setResultWaitTime(3000);
+        bar.setResultWaitTime(1000);
 
         template.sendBody("seda:foo", "A");
         template.sendBody("seda:foo", "B");
@@ -59,7 +59,7 @@
             public void configure() throws Exception {
                 from("seda:foo")
                     .startupOrder(1)
-                    .delay(1000).to("file://target/deferred");
+                    .delay(500).to("file://target/deferred");
 
                 // use file component to transfer files from route 1 -> route 2 as it
                 // will normally suspend, but by deferring this we can let route 1
