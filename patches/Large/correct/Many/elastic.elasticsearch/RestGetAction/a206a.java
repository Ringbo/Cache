diff --git a/src/main/java/org/elasticsearch/rest/action/get/RestGetAction.java b/src/main/java/org/elasticsearch/rest/action/get/RestGetAction.java
index 590e88d..7e23f2a 100644
--- a/src/main/java/org/elasticsearch/rest/action/get/RestGetAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/get/RestGetAction.java
@@ -79,7 +79,7 @@
                     } else {
                         channel.sendResponse(new XContentRestResponse(request, OK, builder));
                     }
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
