diff --git a/twitter4j-core/src/test/java/twitter4j/SiteStreamsTest.java b/twitter4j-core/src/test/java/twitter4j/SiteStreamsTest.java
index 07b7ca4..bda5951 100644
--- a/twitter4j-core/src/test/java/twitter4j/SiteStreamsTest.java
+++ b/twitter4j-core/src/test/java/twitter4j/SiteStreamsTest.java
@@ -56,21 +56,21 @@
             this.wait(200);
         }
         assertEquals("onfriendlist", received.get(0)[0]);
-        assertEquals(6358482, received.get(0)[1]);
+        assertEquals(6358482l, received.get(0)[1]);
         received.clear();
         siteStreams.next(listeners);
         synchronized (this) {
             this.wait(200);
         }
         assertEquals("onfriendlist", received.get(0)[0]);
-        assertEquals(6358481, received.get(0)[1]);
+        assertEquals(6358481l, received.get(0)[1]);
         received.clear();
         siteStreams.next(listeners);
         synchronized (this) {
             this.wait(200);
         }
         assertEquals("onfriendlist", received.get(0)[0]);
-        assertEquals(4933401, received.get(0)[1]);
+        assertEquals(4933401l, received.get(0)[1]);
     }
 
     public void testSiteStream() throws Exception {
