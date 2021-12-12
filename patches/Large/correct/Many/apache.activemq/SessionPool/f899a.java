diff --git a/activemq-core/src/main/java/org/activemq/pool/SessionPool.java b/activemq-core/src/main/java/org/activemq/pool/SessionPool.java
index 5ffcca0..1d9a5ab 100644
--- a/activemq-core/src/main/java/org/activemq/pool/SessionPool.java
+++ b/activemq-core/src/main/java/org/activemq/pool/SessionPool.java
@@ -71,7 +71,7 @@
         // lets check if we are already closed
         getConnection();
         try {
-            getSessionPool().returnObject(this);
+            getSessionPool().returnObject(session);
         }
         catch (Exception e) {
             throw JMSExceptionSupport.create("Failed to return session to pool: " + e, e);
