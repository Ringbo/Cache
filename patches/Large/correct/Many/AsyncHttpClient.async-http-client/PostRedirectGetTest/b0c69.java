diff --git a/client/src/test/java/org/asynchttpclient/PostRedirectGetTest.java b/client/src/test/java/org/asynchttpclient/PostRedirectGetTest.java
index 5b6d9f7..13a7100 100644
--- a/client/src/test/java/org/asynchttpclient/PostRedirectGetTest.java
+++ b/client/src/test/java/org/asynchttpclient/PostRedirectGetTest.java
@@ -41,27 +41,27 @@
 
     // ------------------------------------------------------------ Test Methods
 
-    @Test(groups = { "standalone", "post_redirect_get" }, enabled = false)
+    @Test(groups = { "standalone", "post_redirect_get" })
     public void postRedirectGet302Test() throws Exception {
         doTestPositive(302);
     }
 
-    @Test(groups = { "standalone", "post_redirect_get" }, enabled = false)
+    @Test(groups = { "standalone", "post_redirect_get" })
     public void postRedirectGet302StrictTest() throws Exception {
         doTestNegative(302, true);
     }
 
-    @Test(groups = { "standalone", "post_redirect_get" }, enabled = false)
+    @Test(groups = { "standalone", "post_redirect_get" })
     public void postRedirectGet303Test() throws Exception {
         doTestPositive(303);
     }
 
-    @Test(groups = { "standalone", "post_redirect_get" }, enabled = false)
+    @Test(groups = { "standalone", "post_redirect_get" })
     public void postRedirectGet301Test() throws Exception {
-        doTestNegative(301, false);
+        doTestPositive(301);
     }
 
-    @Test(groups = { "standalone", "post_redirect_get" }, enabled = false)
+    @Test(groups = { "standalone", "post_redirect_get" })
     public void postRedirectGet307Test() throws Exception {
         doTestNegative(307, false);
     }
