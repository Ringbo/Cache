diff --git a/src/main/java/org/elasticsearch/rest/action/mlt/RestMoreLikeThisAction.java b/src/main/java/org/elasticsearch/rest/action/mlt/RestMoreLikeThisAction.java
index e9702ae..44b07d9 100644
--- a/src/main/java/org/elasticsearch/rest/action/mlt/RestMoreLikeThisAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/mlt/RestMoreLikeThisAction.java
@@ -107,7 +107,7 @@
                     response.toXContent(builder, request);
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
