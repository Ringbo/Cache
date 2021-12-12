diff --git a/src/main/java/org/elasticsearch/rest/action/main/RestMainAction.java b/src/main/java/org/elasticsearch/rest/action/main/RestMainAction.java
index bf8a656..1112bea 100644
--- a/src/main/java/org/elasticsearch/rest/action/main/RestMainAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/main/RestMainAction.java
@@ -79,7 +79,7 @@
                     builder.field("tagline", "You Know, for Search");
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, status, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
