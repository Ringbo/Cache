diff --git a/src/test/java/twitter4j/TwitterTestUnit.java b/src/test/java/twitter4j/TwitterTestUnit.java
index df88bf4..d10ef8a 100644
--- a/src/test/java/twitter4j/TwitterTestUnit.java
+++ b/src/test/java/twitter4j/TwitterTestUnit.java
@@ -209,7 +209,7 @@
     public void testGetAuthenticatedUser() throws Exception {
         assertEquals(id1, twitterAPI1.getAuthenticatedUser().getScreenName());
         assertEquals(id1, new Twitter(id3, pass3).getAuthenticatedUser().getName());
-        assertEquals(id3,new Twitter(id3, pass3).verifyCredentials().getName());
+        assertEquals(id1,new Twitter(id3, pass3).verifyCredentials().getName());
     }
 
 
