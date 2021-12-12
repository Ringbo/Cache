diff --git a/src/main/java/org/elasticsearch/rest/action/explain/RestExplainAction.java b/src/main/java/org/elasticsearch/rest/action/explain/RestExplainAction.java
index ffafde3..a65cee3 100644
--- a/src/main/java/org/elasticsearch/rest/action/explain/RestExplainAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/explain/RestExplainAction.java
@@ -126,7 +126,7 @@
                     }
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, response.isExists() ? OK : NOT_FOUND, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
