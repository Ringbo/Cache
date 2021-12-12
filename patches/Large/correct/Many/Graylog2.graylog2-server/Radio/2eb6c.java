diff --git a/app/models/Radio.java b/app/models/Radio.java
index e980c08..9514ca6 100644
--- a/app/models/Radio.java
+++ b/app/models/Radio.java
@@ -147,16 +147,16 @@
 
     public boolean launchExistingInput(String inputId) {
         try {
-            api.get(EmptyResponse.class)
-                    .path("/system/inputs/{0}", inputId)
+            api.get(InputLaunchResponse.class)
+                    .path("/system/inputs/{0}/launch", inputId)
                     .radio(this)
                     .expect(Http.Status.ACCEPTED)
                     .execute();
             return true;
         } catch (APIException e) {
-            log.error("Could not terminate input " + inputId, e);
+            log.error("Could not launch input " + inputId, e);
         } catch (IOException e) {
-            log.error("Could not terminate input " + inputId, e);
+            log.error("Could not launch input " + inputId, e);
         }
 
         return false;
