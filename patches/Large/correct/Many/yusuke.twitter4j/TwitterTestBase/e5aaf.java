diff --git a/twitter4j-core/src/test/java/twitter4j/TwitterTestBase.java b/twitter4j-core/src/test/java/twitter4j/TwitterTestBase.java
index 5f40514..cd8fa39 100644
--- a/twitter4j-core/src/test/java/twitter4j/TwitterTestBase.java
+++ b/twitter4j-core/src/test/java/twitter4j/TwitterTestBase.java
@@ -40,14 +40,14 @@
     protected class TestUserInfo {
         public String screenName;
         public String password;
-        public int id;
+        public long id;
         public String accessToken;
         public String accessTokenSecret;
 
         TestUserInfo(String screenName) {
             this.screenName = p.getProperty(screenName + ".user");
             this.password = p.getProperty(screenName + ".password");
-            this.id = Integer.valueOf(p.getProperty(screenName + ".id"));
+            this.id = Long.valueOf(p.getProperty(screenName + ".id"));
             this.accessToken = p.getProperty(screenName + ".oauth.accessToken");
             this.accessTokenSecret = p.getProperty(screenName + ".oauth.accessTokenSecret");
         }
