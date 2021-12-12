diff --git a/src/main/java/org/elasticsearch/action/index/TransportIndexAction.java b/src/main/java/org/elasticsearch/action/index/TransportIndexAction.java
index a08470b..1c39c68 100644
--- a/src/main/java/org/elasticsearch/action/index/TransportIndexAction.java
+++ b/src/main/java/org/elasticsearch/action/index/TransportIndexAction.java
@@ -106,7 +106,7 @@
                         // we have the index, do it
                         try {
                             innerExecute(request, listener);
-                        } catch (Exception e1) {
+                        } catch (Throwable e1) {
                             listener.onFailure(e1);
                         }
                     } else {
