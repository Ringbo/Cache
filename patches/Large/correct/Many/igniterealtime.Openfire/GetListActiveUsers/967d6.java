diff --git a/src/java/org/jivesoftware/openfire/commands/admin/GetListActiveUsers.java b/src/java/org/jivesoftware/openfire/commands/admin/GetListActiveUsers.java
index 1abd1c3..bb3e2e5 100644
--- a/src/java/org/jivesoftware/openfire/commands/admin/GetListActiveUsers.java
+++ b/src/java/org/jivesoftware/openfire/commands/admin/GetListActiveUsers.java
@@ -69,7 +69,7 @@
 	public void execute(SessionData data, Element command) {
         String max_items = data.getData().get("max_items").get(0);
         int maxItems = -1;
-        if (max_items != null && "none".equals(max_items)) {
+        if (max_items != null && !"none".equals(max_items)) {
             try {
                 maxItems = Integer.parseInt(max_items);
             }
