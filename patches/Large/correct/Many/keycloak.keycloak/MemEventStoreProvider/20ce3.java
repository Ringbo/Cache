diff --git a/examples/providers/event-store-mem/src/main/java/org/keycloak/examples/providers/events/MemEventStoreProvider.java b/examples/providers/event-store-mem/src/main/java/org/keycloak/examples/providers/events/MemEventStoreProvider.java
index 8a00b7e..fc5e474 100644
--- a/examples/providers/event-store-mem/src/main/java/org/keycloak/examples/providers/events/MemEventStoreProvider.java
+++ b/examples/providers/event-store-mem/src/main/java/org/keycloak/examples/providers/events/MemEventStoreProvider.java
@@ -59,7 +59,7 @@
 
     @Override
     public void onEvent(Event event) {
-        events.add(event);
+        events.add(0, event);
     }
 
     @Override
