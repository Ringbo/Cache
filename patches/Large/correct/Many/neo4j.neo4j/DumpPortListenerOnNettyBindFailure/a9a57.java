diff --git a/enterprise/server-enterprise/src/test/java/org/neo4j/server/enterprise/functional/DumpPortListenerOnNettyBindFailure.java b/enterprise/server-enterprise/src/test/java/org/neo4j/server/enterprise/functional/DumpPortListenerOnNettyBindFailure.java
index 15ce55e..6c64aa8 100644
--- a/enterprise/server-enterprise/src/test/java/org/neo4j/server/enterprise/functional/DumpPortListenerOnNettyBindFailure.java
+++ b/enterprise/server-enterprise/src/test/java/org/neo4j/server/enterprise/functional/DumpPortListenerOnNettyBindFailure.java
@@ -71,7 +71,7 @@
                 }
                 catch ( Throwable failure )
                 {
-                    for ( Throwable cause = failure; cause != null; cause = failure.getCause() )
+                    for ( Throwable cause = failure; cause != null; cause = cause.getCause() )
                     {
                         if ( cause instanceof ChannelException )
                         {
