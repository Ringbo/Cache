diff --git a/components/camel-jmxconnect/src/main/java/org/apache/camel/jmxconnect/MBeanCamelServerConnectionClient.java b/components/camel-jmxconnect/src/main/java/org/apache/camel/jmxconnect/MBeanCamelServerConnectionClient.java
index 60ea8e8..1e835e4 100644
--- a/components/camel-jmxconnect/src/main/java/org/apache/camel/jmxconnect/MBeanCamelServerConnectionClient.java
+++ b/components/camel-jmxconnect/src/main/java/org/apache/camel/jmxconnect/MBeanCamelServerConnectionClient.java
@@ -42,7 +42,7 @@
     private MBeanCamelServerConnection serverConnection;
     private Endpoint replyToEndpoint;
     private List listeners = new CopyOnWriteArrayList();
-    private UuidGenerator idGenerator = new UuidGenerator();
+    private UuidGenerator idGenerator = UuidGenerator.get();
     private NotificationBroadcasterSupport localNotifier = new NotificationBroadcasterSupport();
 
     public MBeanCamelServerConnectionClient(MBeanCamelServerConnection serverConnection) {
@@ -68,7 +68,7 @@
     }
 
     public String generateId() {
-        return idGenerator.generateId();
+        return idGenerator.generateUuid();
     }
 
     /**
