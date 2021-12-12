diff --git a/community/server/src/main/java/org/neo4j/server/rest/repr/OutputFormat.java b/community/server/src/main/java/org/neo4j/server/rest/repr/OutputFormat.java
index ac4e8de..c9ae870 100644
--- a/community/server/src/main/java/org/neo4j/server/rest/repr/OutputFormat.java
+++ b/community/server/src/main/java/org/neo4j/server/rest/repr/OutputFormat.java
@@ -171,7 +171,7 @@
                     {
                         throw new WebApplicationException( badRequest( e ) );
                     }
-                    throw new WebApplicationException( serverError( e ) );
+                    throw new WebApplicationException( e, serverError( e ) );
                 }
                 finally
                 {
