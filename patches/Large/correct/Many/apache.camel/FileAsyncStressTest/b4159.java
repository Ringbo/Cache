diff --git a/camel-core/src/test/java/org/apache/camel/component/file/stress/FileAsyncStressTest.java b/camel-core/src/test/java/org/apache/camel/component/file/stress/FileAsyncStressTest.java
index 294f9ea..b115bbd 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/stress/FileAsyncStressTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/stress/FileAsyncStressTest.java
@@ -61,7 +61,7 @@
                         public void process(Exchange exchange) throws Exception {
                             // simulate some work with random time to complete
                             Random ran = new Random();
-                            int delay = ran.nextInt(500) + 10;
+                            int delay = ran.nextInt(250) + 10;
                             Thread.sleep(delay);
                         }
                     }).to("mock:result");
