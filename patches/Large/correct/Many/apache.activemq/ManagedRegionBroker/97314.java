diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/jmx/ManagedRegionBroker.java b/activemq-core/src/main/java/org/apache/activemq/broker/jmx/ManagedRegionBroker.java
index 3b1f080..9c0a481 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/jmx/ManagedRegionBroker.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/jmx/ManagedRegionBroker.java
@@ -186,7 +186,7 @@
     }
 
     public void unregisterSubscription(Subscription sub){
-        ObjectName name=(ObjectName) subscriptionMap.get(sub);
+        ObjectName name=(ObjectName) subscriptionMap.remove(sub);
         if(name!=null){
             try{
                 unregisterSubscription(name);
@@ -331,7 +331,7 @@
             try{
                 c[i]=OpenTypeSupport.convert((Message) messages.get(i));
             }catch(Throwable e){
-                e.printStackTrace();
+                log.error("failed to browse : " + view,e);
             }
         }
         return c;
