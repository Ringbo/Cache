diff --git a/src/main/java/org/elasticsearch/rest/action/search/RestMultiSearchAction.java b/src/main/java/org/elasticsearch/rest/action/search/RestMultiSearchAction.java
index 0438d56..0243728 100644
--- a/src/main/java/org/elasticsearch/rest/action/search/RestMultiSearchAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/search/RestMultiSearchAction.java
@@ -87,7 +87,7 @@
                     response.toXContent(builder, request);
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
