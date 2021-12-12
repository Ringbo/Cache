diff --git a/src/main/java/org/elasticsearch/action/update/TransportUpdateAction.java b/src/main/java/org/elasticsearch/action/update/TransportUpdateAction.java
index 0149ef4..99e9b23 100644
--- a/src/main/java/org/elasticsearch/action/update/TransportUpdateAction.java
+++ b/src/main/java/org/elasticsearch/action/update/TransportUpdateAction.java
@@ -173,7 +173,7 @@
                         // we have the index, do it
                         try {
                             innerExecute(request, listener);
-                        } catch (Exception e1) {
+                        } catch (Throwable e1) {
                             listener.onFailure(e1);
                         }
                     } else {
