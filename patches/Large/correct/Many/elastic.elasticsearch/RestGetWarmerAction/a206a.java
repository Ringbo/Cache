diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/warmer/get/RestGetWarmerAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/warmer/get/RestGetWarmerAction.java
index d5a23d0..adfe3bc 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/warmer/get/RestGetWarmerAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/warmer/get/RestGetWarmerAction.java
@@ -121,7 +121,7 @@
                     }
 
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
