diff --git a/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/cluster/ClusteredWebTestCase.java b/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/cluster/ClusteredWebTestCase.java
index 3341b58..48a0618 100644
--- a/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/cluster/ClusteredWebTestCase.java
+++ b/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/cluster/ClusteredWebTestCase.java
@@ -71,7 +71,7 @@
     public static Archive<?> deployment0() {
         WebArchive war = ShrinkWrap.create(WebArchive.class, "distributable.war");
         war.addClass(SimpleServlet.class);
-        war.addAsWebInfResource(ClusteredWebTestCase.class.getPackage(), "web.xml");
+        war.setWebXML(ClusteredWebTestCase.class.getPackage(), "web.xml");
         System.out.println(war.toString(true));
         return war;
     }
@@ -81,7 +81,7 @@
     public static Archive<?> deployment1() {
         WebArchive war = ShrinkWrap.create(WebArchive.class, "distributable.war");
         war.addClass(SimpleServlet.class);
-        war.addAsWebInfResource(ClusteredWebTestCase.class.getPackage(), "web.xml");
+        war.setWebXML(ClusteredWebTestCase.class.getPackage(), "web.xml");
         war.addAsWebInfResource(EmptyAsset.INSTANCE, "force-hashcode-change.txt");
         System.out.println(war.toString(true));
         return war;
@@ -115,7 +115,7 @@
     }
 
     @Test
-    @Ignore("AS7-2738 and AS7-2837")
+    @Ignore("AS7-2704 StackOverflowError on creating a web session in cluster")
     @OperateOnDeployment("deployment-1") // For change, operate on the 2nd deployment first
     public void testSessionReplication(@ArquillianResource(SimpleServlet.class) URL baseURL) throws IllegalStateException, IOException, InterruptedException {
         DefaultHttpClient client = new DefaultHttpClient();
