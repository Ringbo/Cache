diff --git a/src/main/java/org/elasticsearch/rest/action/search/RestSearchScrollAction.java b/src/main/java/org/elasticsearch/rest/action/search/RestSearchScrollAction.java
index a4269d6..75f0b4d 100644
--- a/src/main/java/org/elasticsearch/rest/action/search/RestSearchScrollAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/search/RestSearchScrollAction.java
@@ -93,7 +93,7 @@
                     response.toXContent(builder, request);
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, response.status(), builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
