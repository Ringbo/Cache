diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/alias/RestIndicesAliasesAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/alias/RestIndicesAliasesAction.java
index cdba81b..dc6f775 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/alias/RestIndicesAliasesAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/alias/RestIndicesAliasesAction.java
@@ -162,7 +162,7 @@
                             .field("acknowledged", response.isAcknowledged())
                             .endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
