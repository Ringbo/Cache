diff --git a/src/java/org/jivesoftware/wildfire/commands/admin/GetUsersPresence.java b/src/java/org/jivesoftware/wildfire/commands/admin/GetUsersPresence.java
index 230888d..7bc80e0 100644
--- a/src/java/org/jivesoftware/wildfire/commands/admin/GetUsersPresence.java
+++ b/src/java/org/jivesoftware/wildfire/commands/admin/GetUsersPresence.java
@@ -60,7 +60,7 @@
     public void execute(SessionData data, Element command) {
         String max_items = data.getData().get("max_items").get(0);
         int maxItems = -1;
-        if (max_items != null && "none".equals(maxItems)) {
+        if (max_items != null && "none".equals(max_items)) {
             try {
                 maxItems = Integer.parseInt(max_items);
             }
