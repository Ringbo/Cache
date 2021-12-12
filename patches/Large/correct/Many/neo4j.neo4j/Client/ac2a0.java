diff --git a/enterprise/com/src/main/java/org/neo4j/com/Client.java b/enterprise/com/src/main/java/org/neo4j/com/Client.java
index 39afe6d..76d68f5 100644
--- a/enterprise/com/src/main/java/org/neo4j/com/Client.java
+++ b/enterprise/com/src/main/java/org/neo4j/com/Client.java
@@ -170,7 +170,7 @@
                 }
 
                 String msg = Client.this.getClass().getSimpleName() + " could not connect to " + address;
-                msgLog.info( msg, true );
+                msgLog.debug( msg, true );
                 throw traceComException( new ComException( msg, channelFuture.getCause() ), "Client.start" );
             }
 
