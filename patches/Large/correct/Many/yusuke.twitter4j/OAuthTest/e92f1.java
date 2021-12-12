diff --git a/twitter4j-core/src/test/java/twitter4j/auth/OAuthTest.java b/twitter4j-core/src/test/java/twitter4j/auth/OAuthTest.java
index 87e287c..158a4a4 100644
--- a/twitter4j-core/src/test/java/twitter4j/auth/OAuthTest.java
+++ b/twitter4j-core/src/test/java/twitter4j/auth/OAuthTest.java
@@ -76,6 +76,7 @@
         Twitter unauthenticated = new TwitterFactory().getInstance();
         unauthenticated.setOAuthConsumer(desktopConsumerKey, desktopConsumerSecret);
         RequestToken rt = unauthenticated.getOAuthRequestToken();
+        //noinspection ResultOfMethodCallIgnored
         rt.hashCode();
         // trying to get an access token without permitting the request token.
         try {
@@ -91,7 +92,7 @@
             twitter.getOAuthAccessToken(rt.getToken(), rt.getTokenSecret());
             fail();
         } catch (TwitterException te) {
-            assertEquals(401, te.getStatusCode());
+            assertEquals(403, te.getStatusCode());
         }
         AccessToken at = getAccessToken(twitter, rt.getAuthorizationURL(), rt, numberId, numberPass, true);
         try {
@@ -156,9 +157,9 @@
         String authorizeURL = catchPattern(resStr, "<form action=\"", "\" id=\"oauth_form\"");
         HttpParameter[] params = new HttpParameter[4];
         params[0] = new HttpParameter("authenticity_token"
-                , catchPattern(resStr, "\"authenticity_token\" type=\"hidden\" value=\"", "\" />"));
+                , catchPattern(resStr, "\"authenticity_token\" type=\"hidden\" value=\"", "\">"));
         params[1] = new HttpParameter("oauth_token",
-                catchPattern(resStr, "name=\"oauth_token\" type=\"hidden\" value=\"", "\" />"));
+                catchPattern(resStr, "name=\"oauth_token\" type=\"hidden\" value=\"", "\">"));
         params[2] = new HttpParameter("session[username_or_email]", screenName);
         params[3] = new HttpParameter("session[password]", password);
         response = http.request(new HttpRequest(RequestMethod.POST, authorizeURL, params, null, props));
@@ -310,7 +311,7 @@
             props.load(is);
             Configuration conf = new PropertyConfiguration(props);
             twitter = new TwitterFactory(conf).getInstance();
-            AccessToken at = twitter.getOAuthAccessToken(id1.screenName, id1.password);
+            twitter.getOAuthAccessToken(id1.screenName, id1.password);
             twitter.updateStatus(new Date() + ": xAuth test.");
 
             twitter = new TwitterFactory().getInstance();
