diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/validate/query/RestValidateQueryAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/validate/query/RestValidateQueryAction.java
index 53a7fd1..e383b25 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/validate/query/RestValidateQueryAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/validate/query/RestValidateQueryAction.java
@@ -132,7 +132,7 @@
                     }
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
