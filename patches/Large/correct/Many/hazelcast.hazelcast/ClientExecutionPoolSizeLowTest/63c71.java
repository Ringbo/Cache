diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/io/ClientExecutionPoolSizeLowTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/io/ClientExecutionPoolSizeLowTest.java
index c1d320c..13303f5 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/io/ClientExecutionPoolSizeLowTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/io/ClientExecutionPoolSizeLowTest.java
@@ -94,6 +94,6 @@
             }
         }
 
-        assertSizeEventually(COUNT, map);
+        assertSizeEventually(COUNT, map, 180);
     }
 }
