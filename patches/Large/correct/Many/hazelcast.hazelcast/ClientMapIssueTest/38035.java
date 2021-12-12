diff --git a/hazelcast-client-legacy/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java b/hazelcast-client-legacy/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java
index 7313840..982135f 100644
--- a/hazelcast-client-legacy/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java
+++ b/hazelcast-client-legacy/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java
@@ -88,7 +88,7 @@
                 assertEquals("there should be only one registration", 1, regs1.size());
                 assertEquals("there should be only one registration", 1, regs2.size());
             }
-        }, 10);
+        });
     }
 
     @Test
