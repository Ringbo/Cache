diff --git a/modules/core/src/main/java/org/apache/ignite/internal/visor/util/VisorTaskUtils.java b/modules/core/src/main/java/org/apache/ignite/internal/visor/util/VisorTaskUtils.java
index 83dbda0..9be8c35 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/visor/util/VisorTaskUtils.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/visor/util/VisorTaskUtils.java
@@ -434,11 +434,11 @@
                     lastFound.set(true);
 
                 // Retains events by lastOrder, period and type.
-                return e.localOrder() > lastOrder && e.timestamp() > notOlderThan && F.contains(evtTypes, e.type());
+                return e.localOrder() > lastOrder && e.timestamp() > notOlderThan;
             }
         };
 
-        Collection<Event> evts = ignite.events().localQuery(p);
+        Collection<Event> evts = ignite.events().localQuery(p, evtTypes);
 
         // Update latest order in node local, if not empty.
         if (!evts.isEmpty()) {
