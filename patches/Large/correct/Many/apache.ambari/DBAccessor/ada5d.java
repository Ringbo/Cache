diff --git a/ambari-server/src/main/java/org/apache/ambari/server/orm/DBAccessor.java b/ambari-server/src/main/java/org/apache/ambari/server/orm/DBAccessor.java
index bbc978b..f3cc80b 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/orm/DBAccessor.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/orm/DBAccessor.java
@@ -262,7 +262,7 @@
     private boolean isNullable;
 
     public DBColumnInfo(String name, Class type, Integer length) {
-      this(name, type, length, null, false);
+      this(name, type, length, null, true);
     }
 
     public DBColumnInfo(String name, Class type, Integer length,
