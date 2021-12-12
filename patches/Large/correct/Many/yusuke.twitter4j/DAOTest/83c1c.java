diff --git a/src/test/java/twitter4j/DAOTest.java b/src/test/java/twitter4j/DAOTest.java
index 943457b..6abbcfa 100644
--- a/src/test/java/twitter4j/DAOTest.java
+++ b/src/test/java/twitter4j/DAOTest.java
@@ -66,22 +66,22 @@
         HttpClient http = new HttpClient();
 
         // empty User list
-        List<User> users = User.createCursorSupportUserList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/statuses/friends/T4J_hudson.json"));
+        List<User> users = User.createUsersList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/statuses/friends/T4J_hudson.json"));
         assertTrue(users.size() == 0);
         trySerializeable(users);
 
         // empty Status list
-        List<Status> statuses = Status.constructStatuses(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/statuses/friends/T4J_hudson.json"));
+        List<Status> statuses = Status.createStatuseList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/statuses/friends/T4J_hudson.json"));
         assertTrue(statuses.size() == 0);
         trySerializeable(statuses);
 
         // empty DirectMessages list
-        List<DirectMessage> directMessages = DirectMessage.constructDirectMessages(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/statuses/friends/T4J_hudson.json"));
+        List<DirectMessage> directMessages = DirectMessage.createDirectMessageList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/statuses/friends/T4J_hudson.json"));
         assertTrue(directMessages.size() == 0);
         trySerializeable(directMessages);
 
         // empty Trends list
-        List<Trends> trends = Trends.constructTrendsList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/trends/daily-empty.json"));
+        List<Trends> trends = Trends.createTrendsList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/trends/daily-empty.json"));
         assertTrue(trends.size() == 0);
         trySerializeable(trends);
 
@@ -131,7 +131,7 @@
         List<User> users;
 
         // User list
-        users = User.createCursorSupportUserList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/statuses/followers/T4J_hudson.json"));
+        users = User.createUsersList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/statuses/followers/T4J_hudson.json"));
         assertTrue(users.size() > 0);
         trySerializeable(users);
     }
@@ -139,7 +139,7 @@
     public void testStatusAsJSON() throws Exception {
         // single Status
         HttpClient http = new HttpClient();
-        List<Status> statuses = Status.constructStatuses(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/statuses/public_timeline.json"));
+        List<Status> statuses = Status.createStatuseList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/statuses/public_timeline.json"));
         Status status = statuses.get(0);
         assertEquals(new Date(1259041785000l), status.getCreatedAt());
         assertEquals(6000554383l, status.getId());
@@ -175,7 +175,7 @@
 
     public void testDirectMessagesAsJSON() throws Exception {
         HttpClient http = new HttpClient();
-        List<DirectMessage> directMessages = DirectMessage.constructDirectMessages(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/direct_messages.json"));
+        List<DirectMessage> directMessages = DirectMessage.createDirectMessageList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/direct_messages.json"));
         DirectMessage dm = directMessages.get(0);
         assertEquals(new java.util.Date(1248177356000l),dm.getCreatedAt());
         assertEquals(6358482,dm.getRecipient().getId());
