diff --git a/clustering/ejb/infinispan/src/main/java/org/wildfly/clustering/ejb/infinispan/bean/InfinispanBean.java b/clustering/ejb/infinispan/src/main/java/org/wildfly/clustering/ejb/infinispan/bean/InfinispanBean.java
index 76f0661..92249c1 100644
--- a/clustering/ejb/infinispan/src/main/java/org/wildfly/clustering/ejb/infinispan/bean/InfinispanBean.java
+++ b/clustering/ejb/infinispan/src/main/java/org/wildfly/clustering/ejb/infinispan/bean/InfinispanBean.java
@@ -80,7 +80,7 @@
         if (this.timeout == null) return false;
         Date lastAccessedTime = this.entry.getLastAccessedTime();
         long timeout = this.timeout.convert(TimeUnit.MILLISECONDS);
-        return (lastAccessedTime != null) && (timeout > 0) ? ((System.currentTimeMillis() - lastAccessedTime.getTime()) > timeout) : false;
+        return (lastAccessedTime != null) && (timeout > 0) ? ((System.currentTimeMillis() - lastAccessedTime.getTime()) >= timeout) : false;
     }
 
     @Override
