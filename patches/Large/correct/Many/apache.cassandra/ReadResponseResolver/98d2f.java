diff --git a/src/java/org/apache/cassandra/service/ReadResponseResolver.java b/src/java/org/apache/cassandra/service/ReadResponseResolver.java
index 8171cf9..2e7b39d 100644
--- a/src/java/org/apache/cassandra/service/ReadResponseResolver.java
+++ b/src/java/org/apache/cassandra/service/ReadResponseResolver.java
@@ -202,7 +202,7 @@
             ReadResponse result = results.get(message);
             if (result == null)
                 continue; // arrived concurrently
-            if (result.isDigestQuery())
+            if (!result.isDigestQuery())
                 return true;
         }
         return false;
