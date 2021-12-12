diff --git a/src/main/java/org/elasticsearch/rest/action/suggest/RestSuggestAction.java b/src/main/java/org/elasticsearch/rest/action/suggest/RestSuggestAction.java
index 15ea748..6c33ab0 100644
--- a/src/main/java/org/elasticsearch/rest/action/suggest/RestSuggestAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/suggest/RestSuggestAction.java
@@ -105,7 +105,7 @@
                     }
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
