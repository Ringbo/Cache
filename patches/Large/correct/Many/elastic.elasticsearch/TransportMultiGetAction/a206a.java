diff --git a/src/main/java/org/elasticsearch/action/get/TransportMultiGetAction.java b/src/main/java/org/elasticsearch/action/get/TransportMultiGetAction.java
index 6d58b79..22a393d 100644
--- a/src/main/java/org/elasticsearch/action/get/TransportMultiGetAction.java
+++ b/src/main/java/org/elasticsearch/action/get/TransportMultiGetAction.java
@@ -132,7 +132,7 @@
                 public void onResponse(MultiGetResponse response) {
                     try {
                         channel.sendResponse(response);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
