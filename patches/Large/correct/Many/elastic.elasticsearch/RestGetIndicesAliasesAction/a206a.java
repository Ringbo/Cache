diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/alias/RestGetIndicesAliasesAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/alias/RestGetIndicesAliasesAction.java
index 19e4aa1..a8b5920 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/alias/RestGetIndicesAliasesAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/alias/RestGetIndicesAliasesAction.java
@@ -86,7 +86,7 @@
                     builder.endObject();
 
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
