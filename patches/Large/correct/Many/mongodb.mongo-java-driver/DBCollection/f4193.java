diff --git a/src/main/com/mongodb/DBCollection.java b/src/main/com/mongodb/DBCollection.java
index c118bcc..b4f7c7e 100644
--- a/src/main/com/mongodb/DBCollection.java
+++ b/src/main/com/mongodb/DBCollection.java
@@ -267,7 +267,7 @@
             if (returnNew)
                 cmd.append( "new", returnNew );
             if (upsert)
-                cmd.append( "upsert", returnNew );
+                cmd.append( "upsert", upsert );
         }
         
         if (remove && !(update == null || update.keySet().isEmpty() || returnNew))
