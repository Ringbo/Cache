diff --git a/src/main/java/org/elasticsearch/rest/action/get/RestMultiGetAction.java b/src/main/java/org/elasticsearch/rest/action/get/RestMultiGetAction.java
index 7789487..2694ef3 100644
--- a/src/main/java/org/elasticsearch/rest/action/get/RestMultiGetAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/get/RestMultiGetAction.java
@@ -83,7 +83,7 @@
                     XContentBuilder builder = restContentBuilder(request);
                     response.toXContent(builder, request);
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
