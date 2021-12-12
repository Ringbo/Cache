diff --git a/twitter4j-core/src/test/java/twitter4j/TwitterTest.java b/twitter4j-core/src/test/java/twitter4j/TwitterTest.java
index 7b07d4e..2431734 100644
--- a/twitter4j-core/src/test/java/twitter4j/TwitterTest.java
+++ b/twitter4j-core/src/test/java/twitter4j/TwitterTest.java
@@ -277,7 +277,7 @@
         /*List Member Methods*/
         User user = null;
         try {
-            user = twitter1.checkUserListMembership(id1.screenName, id2.id, userList.getId());
+            user = twitter1.checkUserListMembership(id1.screenName, userList.getId(), id2.id);
             fail("id2 shouldn't be a member of the userList yet. expecting a TwitterException");
         } catch (TwitterException te) {
             assertEquals(404, te.getStatusCode());
@@ -380,7 +380,7 @@
 //        assertEquals(1, userLists.size()); workarounding issue 1300
 
         try {
-            user = twitter1.checkUserListSubscription(id1.screenName, id2.id, userList.getId());
+            user = twitter1.checkUserListSubscription(id1.screenName, userList.getId(), id2.id);
             fail("id2 shouldn't be a subscriber the userList. expecting a TwitterException");
         } catch (TwitterException ignore) {
             assertEquals(404, ignore.getStatusCode());
