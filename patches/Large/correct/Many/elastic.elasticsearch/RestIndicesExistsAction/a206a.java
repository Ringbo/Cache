diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/exists/indices/RestIndicesExistsAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/exists/indices/RestIndicesExistsAction.java
index 608b976..164eb64 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/exists/indices/RestIndicesExistsAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/exists/indices/RestIndicesExistsAction.java
@@ -63,7 +63,7 @@
                     } else {
                         channel.sendResponse(new StringRestResponse(NOT_FOUND));
                     }
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
