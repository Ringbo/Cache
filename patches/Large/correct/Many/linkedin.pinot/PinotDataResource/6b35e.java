diff --git a/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotDataResource.java b/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotDataResource.java
index 41f5bcd..ccc6599 100644
--- a/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotDataResource.java
+++ b/pinot-controller/src/main/java/com/linkedin/pinot/controller/api/reslet/resources/PinotDataResource.java
@@ -167,7 +167,7 @@
         }
         ret.put("resources", retArray);
 
-        presentation = new StringRepresentation(ret.toString());
+        presentation = new StringRepresentation(ret.toString(), MediaType.APPLICATION_JSON);
       } else {
         final JSONObject ret = new JSONObject();
         for (final String resource : manager.getAllResourceNames()) {
@@ -184,7 +184,7 @@
         JSONObject resourceGetRet = new JSONObject();
         resourceGetRet.put(CommonConstants.Helix.DataSource.RESOURCE_NAME, resourceName);
         resourceGetRet.put("config", resourceName);
-        presentation = new StringRepresentation(resourceGetRet.toString());
+        presentation = new StringRepresentation(resourceGetRet.toString(), MediaType.APPLICATION_JSON);
       }
     } catch (final Exception e) {
       presentation = exceptionToStringRepresentation(e);
