diff --git a/src/main/java/org/elasticsearch/rest/action/update/RestUpdateAction.java b/src/main/java/org/elasticsearch/rest/action/update/RestUpdateAction.java
index dc264b5..b154fe8 100644
--- a/src/main/java/org/elasticsearch/rest/action/update/RestUpdateAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/update/RestUpdateAction.java
@@ -153,7 +153,7 @@
                         status = CREATED;
                     }
                     channel.sendResponse(new XContentRestResponse(request, status, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
