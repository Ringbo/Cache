diff --git a/community/shell/src/test/java/org/neo4j/shell/TestApps.java b/community/shell/src/test/java/org/neo4j/shell/TestApps.java
index 3d7586e..e471bba 100644
--- a/community/shell/src/test/java/org/neo4j/shell/TestApps.java
+++ b/community/shell/src/test/java/org/neo4j/shell/TestApps.java
@@ -1202,7 +1202,7 @@
             {
                 try
                 {
-                    Thread.sleep(100);
+                    Thread.sleep(1);
                     server.terminate( clientId );
                 }
                 catch ( Exception e )
