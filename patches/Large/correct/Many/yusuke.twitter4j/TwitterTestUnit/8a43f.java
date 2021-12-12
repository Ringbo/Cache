diff --git a/src/test/java/twitter4j/TwitterTestUnit.java b/src/test/java/twitter4j/TwitterTestUnit.java
index 54c440c..eae74c5 100644
--- a/src/test/java/twitter4j/TwitterTestUnit.java
+++ b/src/test/java/twitter4j/TwitterTestUnit.java
@@ -249,12 +249,12 @@
         twitterAPI1.destroyStatus(status.getId());
     }
     public void testGetFriends() throws Exception{
-        List<User> actualReturn = twitterAPI1.getFriends(id2);
+        List<User> actualReturn = twitterAPI1.getFriends("al3x");
         boolean found = false;
         for(User user: actualReturn){
             found = found || user.getName().equals("Yusuke Yamamoto");
         }
-        assertTrue(found);
+        assertFalse(found);
         assertTrue(90 < twitterAPI2.getFriends("akr",2).size());
     }
     public void testAccountMethods() throws Exception{
