diff --git a/src/test/java/twitter4j/DAOTest.java b/src/test/java/twitter4j/DAOTest.java
index 06b1210..51ad79f 100644
--- a/src/test/java/twitter4j/DAOTest.java
+++ b/src/test/java/twitter4j/DAOTest.java
@@ -81,7 +81,7 @@
         trySerializeable(directMessages);
 
         // empty Trends list
-        List<Trends> trends = Trends.constructTrendsList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/statuses/friends/T4J_hudson.json"));
+        List<Trends> trends = Trends.constructTrendsList(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/trends/daily-empty.json"));
         assertTrue(trends.size() == 0);
         trySerializeable(trends);
 
@@ -91,7 +91,7 @@
         // single User
         HttpClient http = new HttpClient();
         User user = new User(http.get("http://yusuke.homeip.net/twitter4j/en/testcases/users/show/twit4j.json"));
-        assertFalse(user.isGeoEnabled());
+        assertTrue(user.isGeoEnabled());
         assertFalse(user.isVerified());
         assertEquals(id1, user.getName());
         assertEquals(id1, user.getScreenName());
