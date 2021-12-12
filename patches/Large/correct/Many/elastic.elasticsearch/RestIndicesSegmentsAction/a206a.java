diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/segments/RestIndicesSegmentsAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/segments/RestIndicesSegmentsAction.java
index a99cf17..0aa6630 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/segments/RestIndicesSegmentsAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/segments/RestIndicesSegmentsAction.java
@@ -73,7 +73,7 @@
                     response.toXContent(builder, request);
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
