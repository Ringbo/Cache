diff --git a/xmppserver/src/main/java/org/jivesoftware/openfire/group/GroupManager.java b/xmppserver/src/main/java/org/jivesoftware/openfire/group/GroupManager.java
index fe00125..6e32bb8 100644
--- a/xmppserver/src/main/java/org/jivesoftware/openfire/group/GroupManager.java
+++ b/xmppserver/src/main/java/org/jivesoftware/openfire/group/GroupManager.java
@@ -499,7 +499,7 @@
         ArrayList<String> groupNames = (ArrayList<String>)groupMetaCache.get(key);
         if (groupNames == null) {
             synchronized((userName + MUTEX_SUFFIX_USER).intern()) {
-                groupNames = (ArrayList<String>)groupMetaCache.get(userName);
+                groupNames = (ArrayList<String>)groupMetaCache.get(key);
                 if (groupNames == null) {
                     // assume this is a local user
                     groupNames = new ArrayList(provider.getSharedGroupNames(new JID(userName,
@@ -607,11 +607,11 @@
      * @return all groups that an entity belongs to.
      */
     public Collection<Group> getGroups(JID user) {
-        String key = user.toBareJID();
+        String key = USER_GROUPS_KEY + user.toBareJID();
 
         ArrayList<String> groupNames = (ArrayList<String>)groupMetaCache.get(key);
         if (groupNames == null) {
-            synchronized((key + MUTEX_SUFFIX_USER).intern()) {
+            synchronized((user.getNode() + MUTEX_SUFFIX_USER).intern()) {
                 groupNames = (ArrayList<String>)groupMetaCache.get(key);
                 if (groupNames == null) {
                     groupNames = new ArrayList<>(provider.getGroupNames(user));
