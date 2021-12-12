diff --git a/h2o-hadoop/h2o-mapreduce-generic/src/main/java/water/JettyProxy.java b/h2o-hadoop/h2o-mapreduce-generic/src/main/java/water/JettyProxy.java
index ce77dd2..e9af043 100644
--- a/h2o-hadoop/h2o-mapreduce-generic/src/main/java/water/JettyProxy.java
+++ b/h2o-hadoop/h2o-mapreduce-generic/src/main/java/water/JettyProxy.java
@@ -53,7 +53,7 @@
 
     @Override
     protected void customizeExchange(HttpExchange exchange, HttpServletRequest request) {
-      exchange.addRequestHeader("Authorization", _basicAuth);
+      exchange.setRequestHeader("Authorization", _basicAuth);
     }
   }
 
