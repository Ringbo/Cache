diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java
index 5552111..1253ae5 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/map/ClientMapIssueTest.java
@@ -25,7 +25,7 @@
 public class ClientMapIssueTest {
 
     @After
-    public static void destroy() {
+    public void destroy() {
         HazelcastClient.shutdownAll();
         Hazelcast.shutdownAll();
     }
