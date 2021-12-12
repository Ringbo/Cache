diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
index d8003b5..e4a7653 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
@@ -892,9 +892,9 @@
 
         if (e.getMessage() instanceof List && !((List) e.getMessage()).isEmpty()) {
 
-            List<Object> filteredMessage = new ArrayList<Object>();
+            LinkedList<Object> filteredMessage = new LinkedList<Object>();
             for (Object o : ((List) e.getMessage())) {
-                filteredMessage.add(perRequestFilter(r, new Entry(o, r, f, o), false));
+                filteredMessage.addLast(perRequestFilter(r, new Entry(o, r, f, o), false));
             }
 
             e.setMessage(filteredMessage);
