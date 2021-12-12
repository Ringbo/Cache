diff --git a/src/main/java/org/elasticsearch/rest/action/index/RestIndexAction.java b/src/main/java/org/elasticsearch/rest/action/index/RestIndexAction.java
index 1827dd3..c89e8bb 100644
--- a/src/main/java/org/elasticsearch/rest/action/index/RestIndexAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/index/RestIndexAction.java
@@ -128,7 +128,7 @@
                         status = CREATED;
                     }
                     channel.sendResponse(new XContentRestResponse(request, status, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
