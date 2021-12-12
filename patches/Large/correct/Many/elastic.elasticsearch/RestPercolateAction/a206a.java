diff --git a/src/main/java/org/elasticsearch/rest/action/percolate/RestPercolateAction.java b/src/main/java/org/elasticsearch/rest/action/percolate/RestPercolateAction.java
index 1012524..8fbf4bb 100644
--- a/src/main/java/org/elasticsearch/rest/action/percolate/RestPercolateAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/percolate/RestPercolateAction.java
@@ -77,7 +77,7 @@
                     builder.endObject();
 
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
