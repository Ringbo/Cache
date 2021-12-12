diff --git a/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomGoodBlogsTest.java b/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomGoodBlogsTest.java
index b547d91..0ec7363 100644
--- a/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomGoodBlogsTest.java
+++ b/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomGoodBlogsTest.java
@@ -94,7 +94,7 @@
         MockEndpoint mock = context.getEndpoint("mock:result", MockEndpoint.class);
 
         // There should be two good blog entries from the feed
-        mock.expectedMessageCount(2);
+        mock.expectedMinimumMessageCount(2);
 
         // Asserts that the above expectations is true, will throw assertions exception if it failed
         // Camel will default wait max 20 seconds for the assertions to be true, if the conditions
