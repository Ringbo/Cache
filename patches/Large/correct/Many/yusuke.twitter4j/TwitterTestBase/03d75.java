diff --git a/twitter4j-core/src/test/java/twitter4j/TwitterTestBase.java b/twitter4j-core/src/test/java/twitter4j/TwitterTestBase.java
index 02b6b21..1f702e1 100644
--- a/twitter4j-core/src/test/java/twitter4j/TwitterTestBase.java
+++ b/twitter4j-core/src/test/java/twitter4j/TwitterTestBase.java
@@ -34,7 +34,7 @@
     protected final Properties p = new Properties();
 
     protected String numberId, numberPass, followsOneWay;
-    protected int numberIdId;
+    protected long numberIdId;
     protected TestUserInfo id1, id2, id3, bestFriend1, bestFriend2;
     protected Configuration conf1, conf2, conf3;
 
@@ -85,7 +85,7 @@
         numberId = p.getProperty("numberid.user");
         numberPass = p.getProperty("numberid.password");
 //        id1id = Integer.valueOf(p.getProperty("id1id"));
-        numberIdId = Integer.valueOf(p.getProperty("numberid.id"));
+        numberIdId = Long.valueOf(p.getProperty("numberid.id"));
 
         twitter1 = new TwitterFactory(conf1).getInstance();
 
