diff --git a/app/controllers/MessagesController.java b/app/controllers/MessagesController.java
index d4e3b2a..e44326f 100644
--- a/app/controllers/MessagesController.java
+++ b/app/controllers/MessagesController.java
@@ -127,7 +127,7 @@
             Map<String, Object> result = Maps.newHashMap();
             result.put("id", message.getId());
             if (filtered)
-                result.put("fields", message.getFormattedFields());
+                result.put("fields", message.getFilteredFields());
             else
                 result.put("fields", message.getFields());
 
