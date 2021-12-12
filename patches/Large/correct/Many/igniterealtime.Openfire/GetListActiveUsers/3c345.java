diff --git a/src/java/org/jivesoftware/wildfire/commands/admin/GetListActiveUsers.java b/src/java/org/jivesoftware/wildfire/commands/admin/GetListActiveUsers.java
index f8888ba..3a9d323 100644
--- a/src/java/org/jivesoftware/wildfire/commands/admin/GetListActiveUsers.java
+++ b/src/java/org/jivesoftware/wildfire/commands/admin/GetListActiveUsers.java
@@ -58,7 +58,7 @@
     public void execute(SessionData data, Element command) {
         String max_items = data.getData().get("max_items").get(0);
         int maxItems = -1;
-        if (max_items != null && "none".equals(maxItems)) {
+        if (max_items != null && "none".equals(max_items)) {
             try {
                 maxItems = Integer.parseInt(max_items);
             }
