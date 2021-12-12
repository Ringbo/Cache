diff --git a/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/single/web/SimpleWebTestCase.java b/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/single/web/SimpleWebTestCase.java
index 20b33dd..4e17206 100644
--- a/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/single/web/SimpleWebTestCase.java
+++ b/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/single/web/SimpleWebTestCase.java
@@ -55,7 +55,7 @@
     public static Archive<?> deployment() {
         WebArchive war = ShrinkWrap.create(WebArchive.class, "distributable.war");
         war.addClass(SimpleServlet.class);
-        war.addAsWebInfResource(SimpleWebTestCase.class.getPackage(), "web.xml");
+        war.setWebXML(SimpleWebTestCase.class.getPackage(), "web.xml");
         System.out.println(war.toString(true));
         return war;
     }
