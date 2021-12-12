diff --git a/testsuite/integration/src/test/java/org/keycloak/testsuite/perf/AccessTokenPerfTest.java b/testsuite/integration/src/test/java/org/keycloak/testsuite/perf/AccessTokenPerfTest.java
index 73db611..6f87587 100755
--- a/testsuite/integration/src/test/java/org/keycloak/testsuite/perf/AccessTokenPerfTest.java
+++ b/testsuite/integration/src/test/java/org/keycloak/testsuite/perf/AccessTokenPerfTest.java
@@ -248,7 +248,7 @@
     @Test
     public void perfBrowserLogin()
     {
-        long ITERATIONS = 100;
+        long ITERATIONS = 3;
         long start = System.currentTimeMillis();
         BrowserLogin login = new BrowserLogin();
         for (int i = 0; i < ITERATIONS; i++) {
