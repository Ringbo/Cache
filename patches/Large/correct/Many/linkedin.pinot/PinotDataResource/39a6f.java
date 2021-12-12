diff --git a/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotDataResource.java b/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotDataResource.java
index ccc6599..e454f48 100644
--- a/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotDataResource.java
+++ b/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotDataResource.java
@@ -183,7 +183,7 @@
         }
         JSONObject resourceGetRet = new JSONObject();
         resourceGetRet.put(CommonConstants.Helix.DataSource.RESOURCE_NAME, resourceName);
-        resourceGetRet.put("config", resourceName);
+        resourceGetRet.put("config", ret);
         presentation = new StringRepresentation(resourceGetRet.toString(), MediaType.APPLICATION_JSON);
       }
     } catch (final Exception e) {
