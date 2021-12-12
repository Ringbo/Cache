diff --git a/src/main/java/org/elasticsearch/rest/action/deletebyquery/RestDeleteByQueryAction.java b/src/main/java/org/elasticsearch/rest/action/deletebyquery/RestDeleteByQueryAction.java
index fc4b241..f0abdab 100644
--- a/src/main/java/org/elasticsearch/rest/action/deletebyquery/RestDeleteByQueryAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/deletebyquery/RestDeleteByQueryAction.java
@@ -120,7 +120,7 @@
 
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
