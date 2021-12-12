diff --git a/camel-core/src/test/java/org/apache/camel/component/file/stress/FileAsyncStressReadLockLockFileTest.java b/camel-core/src/test/java/org/apache/camel/component/file/stress/FileAsyncStressReadLockLockFileTest.java
index 58c60e7..39bae9a 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/stress/FileAsyncStressReadLockLockFileTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/stress/FileAsyncStressReadLockLockFileTest.java
@@ -41,7 +41,7 @@
                         public void process(Exchange exchange) throws Exception {
                             // simulate some work with random time to complete
                             Random ran = new Random();
-                            int delay = ran.nextInt(500) + 10;
+                            int delay = ran.nextInt(250) + 10;
                             Thread.sleep(delay);
                         }
                     }).to("mock:result");
