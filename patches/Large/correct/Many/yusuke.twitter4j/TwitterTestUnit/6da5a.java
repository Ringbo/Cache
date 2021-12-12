diff --git a/src/test/java/twitter4j/TwitterTestUnit.java b/src/test/java/twitter4j/TwitterTestUnit.java
index d5d040f..270696e 100644
--- a/src/test/java/twitter4j/TwitterTestUnit.java
+++ b/src/test/java/twitter4j/TwitterTestUnit.java
@@ -247,9 +247,10 @@
 
     public void testAccountMethods() throws Exception{
         User original = twitterAPI1.verifyCredentials();
-        if(original.getScreenName().endsWith("new")){
+        if(original.getScreenName().endsWith("new") ||
+                original.getName().endsWith("new")){
             original = twitterAPI1.updateProfile(
-                    original.getName(), null, "http://yusuke.homeip.net/twitter4j/"
+                    "twit4j", null, "http://yusuke.homeip.net/twitter4j/"
                     , "location:" , "Hi there, I do test a lot!new");
 
         }
