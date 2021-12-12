diff --git a/src/plugins/search/src/java/org/jivesoftware/messenger/plugin/SearchPlugin.java b/src/plugins/search/src/java/org/jivesoftware/messenger/plugin/SearchPlugin.java
index e9e2593..19e70f1 100644
--- a/src/plugins/search/src/java/org/jivesoftware/messenger/plugin/SearchPlugin.java
+++ b/src/plugins/search/src/java/org/jivesoftware/messenger/plugin/SearchPlugin.java
@@ -268,7 +268,7 @@
         Iterator userIter = users.iterator();
         while (userIter.hasNext()) {
             User user = (User) userIter.next();
-            String username = user.getName();
+            String username = user.getUsername();
 
             ArrayList<XFormFieldImpl> items = new ArrayList<XFormFieldImpl>();
 
