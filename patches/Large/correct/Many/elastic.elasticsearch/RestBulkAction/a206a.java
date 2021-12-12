diff --git a/src/main/java/org/elasticsearch/rest/action/bulk/RestBulkAction.java b/src/main/java/org/elasticsearch/rest/action/bulk/RestBulkAction.java
index a3ad989..76b2e1a 100644
--- a/src/main/java/org/elasticsearch/rest/action/bulk/RestBulkAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/bulk/RestBulkAction.java
@@ -133,7 +133,7 @@
 
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
