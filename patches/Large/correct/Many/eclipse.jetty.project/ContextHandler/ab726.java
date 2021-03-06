diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java b/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java
index e22ebb8..c6c98f1 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java
@@ -2191,7 +2191,7 @@
             if (dot<0)
                 return false;
             String suffix=path.substring(dot);
-            return resource.getAlias().toString().endsWith(suffix);
+            return resource.toString().endsWith(suffix);
         }
     }
     
@@ -2206,10 +2206,10 @@
         public boolean check(String path, Resource resource)
         {
             int slash = path.lastIndexOf('/');
-            if (slash<0)
+            if (slash<0 || slash==path.length()-1)
                 return false;
             String suffix=path.substring(slash);
-            return resource.getAlias().toString().endsWith(suffix);
+            return resource.toString().endsWith(suffix);
         }
     }
     /* ------------------------------------------------------------ */
@@ -2222,7 +2222,7 @@
         public boolean check(String path, Resource resource)
         {
             int slash = path.lastIndexOf('/');
-            if (slash<0)
+            if (slash<0 || resource.exists())
                 return false;
             String suffix=path.substring(slash);
             return resource.getAlias().toString().endsWith(suffix);
