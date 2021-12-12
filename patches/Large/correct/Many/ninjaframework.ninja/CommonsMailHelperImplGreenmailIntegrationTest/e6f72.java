diff --git a/ninja-postoffice/src/test/java/ninja/postoffice/commonsmail/CommonsMailHelperImplGreenmailIntegrationTest.java b/ninja-postoffice/src/test/java/ninja/postoffice/commonsmail/CommonsMailHelperImplGreenmailIntegrationTest.java
index 9fa0e27..b3c3285 100644
--- a/ninja-postoffice/src/test/java/ninja/postoffice/commonsmail/CommonsMailHelperImplGreenmailIntegrationTest.java
+++ b/ninja-postoffice/src/test/java/ninja/postoffice/commonsmail/CommonsMailHelperImplGreenmailIntegrationTest.java
@@ -53,7 +53,7 @@
     @Before
     public void setUp() throws Exception {
 
-        SMTP_TEST_PORT = findAvailablePort(1000, 10000);
+        SMTP_TEST_PORT = findAvailablePort(2000, 10000);
 
         greenMail = new GreenMail(new ServerSetup(SMTP_TEST_PORT, null, "smtp"));
         greenMail.start();
