diff --git a/src/main/java/org/elasticsearch/rest/action/delete/RestDeleteAction.java b/src/main/java/org/elasticsearch/rest/action/delete/RestDeleteAction.java
index afc9b0c..12fc50f 100644
--- a/src/main/java/org/elasticsearch/rest/action/delete/RestDeleteAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/delete/RestDeleteAction.java
@@ -92,7 +92,7 @@
                         status = NOT_FOUND;
                     }
                     channel.sendResponse(new XContentRestResponse(request, status, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
