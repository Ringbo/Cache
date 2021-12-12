diff --git a/src/java/org/jivesoftware/openfire/commands/admin/GetUsersPresence.java b/src/java/org/jivesoftware/openfire/commands/admin/GetUsersPresence.java
index e1c6d08..dc8749e 100644
--- a/src/java/org/jivesoftware/openfire/commands/admin/GetUsersPresence.java
+++ b/src/java/org/jivesoftware/openfire/commands/admin/GetUsersPresence.java
@@ -73,7 +73,7 @@
 	public void execute(SessionData data, Element command) {
         String max_items = data.getData().get("max_items").get(0);
         int maxItems = -1;
-        if (max_items != null && "none".equals(max_items)) {
+        if (max_items != null && !"none".equals(max_items)) {
             try {
                 maxItems = Integer.parseInt(max_items);
             }
