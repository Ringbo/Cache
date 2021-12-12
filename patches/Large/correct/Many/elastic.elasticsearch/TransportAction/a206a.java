diff --git a/src/main/java/org/elasticsearch/action/support/TransportAction.java b/src/main/java/org/elasticsearch/action/support/TransportAction.java
index 4cf1c58..32dccae 100644
--- a/src/main/java/org/elasticsearch/action/support/TransportAction.java
+++ b/src/main/java/org/elasticsearch/action/support/TransportAction.java
@@ -59,7 +59,7 @@
         }
         try {
             doExecute(request, listener);
-        } catch (Exception e) {
+        } catch (Throwable e) {
             logger.trace("Error during transport action execution.", e);
             listener.onFailure(e);
         }
@@ -85,7 +85,7 @@
                 public void run() {
                     try {
                         listener.onResponse(response);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         listener.onFailure(e);
                     }
                 }
