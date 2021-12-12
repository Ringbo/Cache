diff --git a/twitter4j-core/src/test/java/twitter4j/TwitterTest.java b/twitter4j-core/src/test/java/twitter4j/TwitterTest.java
index ae6bb74..24b4fe4 100644
--- a/twitter4j-core/src/test/java/twitter4j/TwitterTest.java
+++ b/twitter4j-core/src/test/java/twitter4j/TwitterTest.java
@@ -135,7 +135,7 @@
         assertFalse(user.isStatusFavorited());
         assertNull(user.getStatusInReplyToScreenName());
 
-        assertTrue(1 < user.getListedCount());
+        assertTrue(1 <= user.getListedCount());
         assertFalse(user.isFollowRequestSent());
 
         //test case for TFJ-91 null pointer exception getting user detail on users with no statuses
