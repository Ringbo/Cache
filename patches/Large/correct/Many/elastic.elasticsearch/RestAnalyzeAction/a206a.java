diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/analyze/RestAnalyzeAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/analyze/RestAnalyzeAction.java
index 00c76fb..8e99d0a 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/analyze/RestAnalyzeAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/analyze/RestAnalyzeAction.java
@@ -81,7 +81,7 @@
                     response.toXContent(builder, request);
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
