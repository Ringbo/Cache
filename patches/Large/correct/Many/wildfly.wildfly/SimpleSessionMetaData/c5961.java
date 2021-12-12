diff --git a/clustering/web/infinispan/src/main/java/org/wildfly/clustering/web/infinispan/session/SimpleSessionMetaData.java b/clustering/web/infinispan/src/main/java/org/wildfly/clustering/web/infinispan/session/SimpleSessionMetaData.java
index 9735cb1..2123346 100644
--- a/clustering/web/infinispan/src/main/java/org/wildfly/clustering/web/infinispan/session/SimpleSessionMetaData.java
+++ b/clustering/web/infinispan/src/main/java/org/wildfly/clustering/web/infinispan/session/SimpleSessionMetaData.java
@@ -52,7 +52,7 @@
     @Override
     public boolean isExpired() {
         long maxInactiveInterval = this.getMaxInactiveInterval(TimeUnit.MILLISECONDS);
-        return (maxInactiveInterval > 0) ? (System.currentTimeMillis() - this.lastAccessedTime.getTime()) > maxInactiveInterval : false;
+        return (maxInactiveInterval > 0) ? (System.currentTimeMillis() - this.lastAccessedTime.getTime()) >= maxInactiveInterval : false;
     }
 
     @Override
