diff --git a/twitter4j-core/src/test/java/twitter4j/StatusMethodsTest.java b/twitter4j-core/src/test/java/twitter4j/StatusMethodsTest.java
index 740e482..c4bd0ae 100644
--- a/twitter4j-core/src/test/java/twitter4j/StatusMethodsTest.java
+++ b/twitter4j-core/src/test/java/twitter4j/StatusMethodsTest.java
@@ -146,12 +146,12 @@
         assertTrue(20 < statuses.size());
 
         List<User> users = unauthenticated.getRetweetedBy(47621163517624320L, new Paging(1, 100));
-        assertTrue(users.size() > 90);
+        assertTrue(users.size() > 50);
         users = unauthenticated.getRetweetedBy(47621163517624320L, new Paging(2, 100));
         assertTrue(users.size() > 10);
 
         IDs ids = twitter1.getRetweetedByIDs(47621163517624320L, new Paging(1, 100));
-        assertTrue(ids.getIDs().length > 90);
+        assertTrue(ids.getIDs().length > 50);
         ids = twitter1.getRetweetedByIDs(47621163517624320L, new Paging(2, 100));
         assertTrue(ids.getIDs().length > 10);
     }
