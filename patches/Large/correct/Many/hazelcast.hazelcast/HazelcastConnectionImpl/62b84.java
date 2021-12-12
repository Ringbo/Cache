diff --git a/hazelcast-ra/hazelcast-jca/src/main/java/com/hazelcast/jca/HazelcastConnectionImpl.java b/hazelcast-ra/hazelcast-jca/src/main/java/com/hazelcast/jca/HazelcastConnectionImpl.java
index 89f1836..8a7c8cb 100644
--- a/hazelcast-ra/hazelcast-jca/src/main/java/com/hazelcast/jca/HazelcastConnectionImpl.java
+++ b/hazelcast-ra/hazelcast-jca/src/main/java/com/hazelcast/jca/HazelcastConnectionImpl.java
@@ -104,8 +104,7 @@
      */
     @Override
     public ResultSetInfo getResultSetInfo() throws NotSupportedException {
-        //as per spec 15.11.3
-        throw new NotSupportedException();
+        throw new NotSupportedException("getResultSetInfo() is not supported by this resource adapter as per spec 15.11.3");
     }
 
     @Override
@@ -333,12 +332,12 @@
 
     @Override
     public LifecycleService getLifecycleService() {
-        throw new UnsupportedOperationException("Hazelcast Lifecycle is only managed by JEE Container");
+        throw new UnsupportedOperationException("Hazelcast Lifecycle is only managed by JCA Container");
     }
 
     @Override
     public void shutdown() {
-        throw new UnsupportedOperationException("Hazelcast Lifecycle is only managed by JEE Container");
+        throw new UnsupportedOperationException("Hazelcast Lifecycle is only managed by JCA Container");
     }
 
     @Override
