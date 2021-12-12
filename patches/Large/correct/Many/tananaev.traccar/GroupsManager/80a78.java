diff --git a/src/org/traccar/database/GroupsManager.java b/src/org/traccar/database/GroupsManager.java
index c1a07a4..262f155 100644
--- a/src/org/traccar/database/GroupsManager.java
+++ b/src/org/traccar/database/GroupsManager.java
@@ -76,9 +76,9 @@
     }
 
     @Override
-    protected void updateCachedItem(Group group) {
+    public void updateItem(Group group) throws SQLException {
         checkGroupCycles(group);
-        super.updateCachedItem(group);
+        super.updateItem(group);
     }
 
     @Override
