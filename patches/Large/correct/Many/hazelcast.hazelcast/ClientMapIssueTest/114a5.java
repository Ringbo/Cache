diff --git a/hazelcast-client-new/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java b/hazelcast-client-new/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java
index 2b13302..f3eea11 100644
--- a/hazelcast-client-new/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java
+++ b/hazelcast-client-new/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java
@@ -87,7 +87,7 @@
                 assertEquals("there should be only one registration", 1, regs1.size());
                 assertEquals("there should be only one registration", 1, regs2.size());
             }
-        }, 10);
+        });
     }
 
     @Test
