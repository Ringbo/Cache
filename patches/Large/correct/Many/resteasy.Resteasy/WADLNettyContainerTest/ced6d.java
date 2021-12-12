diff --git a/resteasy-wadl/src/test/java/org/jboss/resteasy/test/nextgen/wadl/WADLNettyContainerTest.java b/resteasy-wadl/src/test/java/org/jboss/resteasy/test/nextgen/wadl/WADLNettyContainerTest.java
index 550ed42..f7aa9e5 100644
--- a/resteasy-wadl/src/test/java/org/jboss/resteasy/test/nextgen/wadl/WADLNettyContainerTest.java
+++ b/resteasy-wadl/src/test/java/org/jboss/resteasy/test/nextgen/wadl/WADLNettyContainerTest.java
@@ -59,7 +59,7 @@
 
    @Test
    public void test() throws Exception {
-      WadlTests basicTest = new WadlTests();
+      TestWadlFunctions basicTest = new TestWadlFunctions();
       basicTest.setClient(client);
       basicTest.testBasicSet();
       basicTest.testResteasy1246();
