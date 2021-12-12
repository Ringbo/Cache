diff --git a/hazelcast/src/main/java/com/hazelcast/spi/impl/EventServiceImpl.java b/hazelcast/src/main/java/com/hazelcast/spi/impl/EventServiceImpl.java
index 86269ab..2d7f192 100644
--- a/hazelcast/src/main/java/com/hazelcast/spi/impl/EventServiceImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/spi/impl/EventServiceImpl.java
@@ -417,7 +417,7 @@
         }
         private boolean hasRegistrations(String topic) {
             Collection<Registration> topicRegistrations = registrations.get(topic);
-            return !(topicRegistrations == null && topicRegistrations.isEmpty());
+            return !(topicRegistrations == null || topicRegistrations.isEmpty());
         }
 
 
