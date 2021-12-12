diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/impl/EntryListenerManager.java b/hazelcast-client/src/main/java/com/hazelcast/client/impl/EntryListenerManager.java
index d7f723b..7954764 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/impl/EntryListenerManager.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/impl/EntryListenerManager.java
@@ -66,7 +66,7 @@
         }
 
         public void notifyEntryListeners(Packet packet) {
-            EntryEvent event = new EntryEvent(packet.getName(), (int) packet.getLongValue(), toObject(packet.getKey()), toObject(packet.getValue()));
+        EntryEvent event = new EntryEvent(packet.getName(), null, (int) packet.getLongValue(), toObject(packet.getKey()), toObject(packet.getValue()));
             String name = event.getName();
             Object key = event.getKey();
             if (entryListeners.get(name) != null) {
