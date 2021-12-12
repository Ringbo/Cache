diff --git a/src/java/org/jivesoftware/openfire/commands/admin/group/GetListGroups.java b/src/java/org/jivesoftware/openfire/commands/admin/group/GetListGroups.java
index 024ad48..be786bc 100644
--- a/src/java/org/jivesoftware/openfire/commands/admin/group/GetListGroups.java
+++ b/src/java/org/jivesoftware/openfire/commands/admin/group/GetListGroups.java
@@ -99,7 +99,7 @@
             }
         }
         int maxItems = 100000;
-        if (max_items != null && "none".equals(max_items)) {
+        if (max_items != null && !"none".equals(max_items)) {
             try {
                 maxItems = Integer.parseInt(max_items);
             }
