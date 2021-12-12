diff --git a/src/main/java/org/elasticsearch/rest/action/count/RestCountAction.java b/src/main/java/org/elasticsearch/rest/action/count/RestCountAction.java
index dbc9114..75a4d79 100644
--- a/src/main/java/org/elasticsearch/rest/action/count/RestCountAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/count/RestCountAction.java
@@ -112,7 +112,7 @@
 
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
