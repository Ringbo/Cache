diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/log/Log.java b/jetty-util/src/main/java/org/eclipse/jetty/util/log/Log.java
index a7c15ee..f82e775 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/log/Log.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/log/Log.java
@@ -171,7 +171,7 @@
 
             try
             {
-                Class<?> log_class = __logClass==null?null:Loader.loadClass(__logClass);
+                Class<?> log_class = __logClass==null?null:Loader.loadClass(Log.class,__logClass);
                 if (LOG == null || (log_class!=null && !LOG.getClass().equals(log_class)))
                 {
                     LOG = (Logger)log_class.newInstance();
