diff --git a/jetty-nosql/src/main/java/org/eclipse/jetty/nosql/mongodb/MongoSessionManager.java b/jetty-nosql/src/main/java/org/eclipse/jetty/nosql/mongodb/MongoSessionManager.java
index 80b29b5..22285ca 100644
--- a/jetty-nosql/src/main/java/org/eclipse/jetty/nosql/mongodb/MongoSessionManager.java
+++ b/jetty-nosql/src/main/java/org/eclipse/jetty/nosql/mongodb/MongoSessionManager.java
@@ -143,7 +143,7 @@
             }
             else
             {
-                version = new Long(((Long)version).intValue() + 1);
+                version = new Long(((Number)version).longValue() + 1);
                 update.put("$inc",__version_1); 
             }
 
