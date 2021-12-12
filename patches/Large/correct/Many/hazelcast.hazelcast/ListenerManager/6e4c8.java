diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/impl/ListenerManager.java b/hazelcast-client/src/main/java/com/hazelcast/client/impl/ListenerManager.java
index 4ad4190..43a49cf 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/impl/ListenerManager.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/impl/ListenerManager.java
@@ -99,7 +99,7 @@
                 entryListeners.put(name, new HashMap<Object, List<EntryListener<?, ?>>>());
             }
             if (!entryListeners.get(name).containsKey(key)) {
-                entryListeners.get(name).put(key, new ArrayList<EntryListener<?, ?>>());
+                entryListeners.get(name).put(key, new CopyOnWriteArrayList<EntryListener<?, ?>>());
             }
             entryListeners.get(name).get(key).add(entryListener);
         }
@@ -207,7 +207,7 @@
 
         public synchronized void registerMessageListener(String name, MessageListener messageListener) {
             if (!messageListeners.containsKey(name)) {
-                messageListeners.put(name, new ArrayList<MessageListener<Object>>());
+                messageListeners.put(name, new CopyOnWriteArrayList<MessageListener<Object>>());
             }
             messageListeners.get(name).add(messageListener);
         }
