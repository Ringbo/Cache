diff --git a/src/java/org/apache/cassandra/streaming/StreamCoordinator.java b/src/java/org/apache/cassandra/streaming/StreamCoordinator.java
index 425b5b1..ed94f89 100644
--- a/src/java/org/apache/cassandra/streaming/StreamCoordinator.java
+++ b/src/java/org/apache/cassandra/streaming/StreamCoordinator.java
@@ -223,7 +223,7 @@
             // get
             else
             {
-                if (lastReturned == streamSessions.size() - 1)
+                if (lastReturned >= streamSessions.size() - 1)
                     lastReturned = 0;
 
                 return streamSessions.get(lastReturned++);
