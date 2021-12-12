diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/exists/types/RestTypesExistsAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/exists/types/RestTypesExistsAction.java
index d427680..1eb5002a7 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/exists/types/RestTypesExistsAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/exists/types/RestTypesExistsAction.java
@@ -64,7 +64,7 @@
                     } else {
                         channel.sendResponse(new StringRestResponse(NOT_FOUND));
                     }
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
