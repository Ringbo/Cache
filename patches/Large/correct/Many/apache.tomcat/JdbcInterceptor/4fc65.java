diff --git a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/JdbcInterceptor.java b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/JdbcInterceptor.java
index 254032f..2cea49d 100644
--- a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/JdbcInterceptor.java
+++ b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/JdbcInterceptor.java
@@ -92,7 +92,7 @@
     
     @Override
     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
-        if (getNext()!=null) return getNext().invoke(this,method,args);
+        if (getNext()!=null) return getNext().invoke(proxy,method,args);
         else throw new NullPointerException();
     }
 
