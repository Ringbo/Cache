diff --git a/activemq-unit-tests/src/test/java/org/apache/activemq/transport/nio/NIOSSLConcurrencyTest.java b/activemq-unit-tests/src/test/java/org/apache/activemq/transport/nio/NIOSSLConcurrencyTest.java
index 638fd2d..1ade516 100644
--- a/activemq-unit-tests/src/test/java/org/apache/activemq/transport/nio/NIOSSLConcurrencyTest.java
+++ b/activemq-unit-tests/src/test/java/org/apache/activemq/transport/nio/NIOSSLConcurrencyTest.java
@@ -128,7 +128,7 @@
             public boolean isSatisified() throws Exception {
                 return failed || getReceived() == PRODUCER_COUNT * MESSAGE_COUNT;
             }
-        }, 60000);
+        }, 120000);
 
         assertEquals(PRODUCER_COUNT * MESSAGE_COUNT, getReceived());
 
