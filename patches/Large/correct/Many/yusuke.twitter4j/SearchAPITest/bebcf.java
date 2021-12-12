diff --git a/twitter4j-core/src/test/java/twitter4j/SearchAPITest.java b/twitter4j-core/src/test/java/twitter4j/SearchAPITest.java
index ec67f52..eaf5ae5 100644
--- a/twitter4j-core/src/test/java/twitter4j/SearchAPITest.java
+++ b/twitter4j-core/src/test/java/twitter4j/SearchAPITest.java
@@ -47,7 +47,7 @@
     public void testQuery() throws Exception {
         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
         Query query = new Query("test")
-                .until(format.format(new java.util.Date()));
+                .until(format.format(new java.util.Date(System.currentTimeMillis() - 3600*24)));
         HttpParameter[] params = query.asHttpParameterArray();
         assertTrue(findParameter(params,"q"));
         assertTrue(findParameter(params,"until"));
