diff --git a/hazelcast-client-new/src/test/java/com/hazelcast/client/executor/ClientExecutorServiceSubmitTest.java b/hazelcast-client-new/src/test/java/com/hazelcast/client/executor/ClientExecutorServiceSubmitTest.java
index c8d3bca..5ec6abb 100644
--- a/hazelcast-client-new/src/test/java/com/hazelcast/client/executor/ClientExecutorServiceSubmitTest.java
+++ b/hazelcast-client-new/src/test/java/com/hazelcast/client/executor/ClientExecutorServiceSubmitTest.java
@@ -586,7 +586,7 @@
             }
         });
 
-        assertOpenEventually("responseLatch", responseLatch, 5);
+        assertOpenEventually("responseLatch", responseLatch);
         assertEquals(msg + AppendCallable.APPENDAGE, result.get());
     }
 
