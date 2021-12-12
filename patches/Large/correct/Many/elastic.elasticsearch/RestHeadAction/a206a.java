diff --git a/src/main/java/org/elasticsearch/rest/action/get/RestHeadAction.java b/src/main/java/org/elasticsearch/rest/action/get/RestHeadAction.java
index cccba25..c58b742 100644
--- a/src/main/java/org/elasticsearch/rest/action/get/RestHeadAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/get/RestHeadAction.java
@@ -67,7 +67,7 @@
                     } else {
                         channel.sendResponse(new StringRestResponse(OK));
                     }
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
