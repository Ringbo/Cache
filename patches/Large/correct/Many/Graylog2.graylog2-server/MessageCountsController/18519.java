diff --git a/app/controllers/MessageCountsController.java b/app/controllers/MessageCountsController.java
index e9609c0..13f9c18 100644
--- a/app/controllers/MessageCountsController.java
+++ b/app/controllers/MessageCountsController.java
@@ -37,9 +37,9 @@
     private MessagesService messagesService;
 
     public Result total() {
-        int countResult = messagesService.total();
+        long countResult = messagesService.total();
 
-        Map<String, Integer> result = Maps.newHashMap();
+        Map<String, Long> result = Maps.newHashMap();
         result.put("events", countResult);
 
         return ok(new Gson().toJson(result)).as("application/json");
