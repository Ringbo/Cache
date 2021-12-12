diff --git a/plugin/security/src/test/java/org/elasticsearch/xpack/ssl/SSLClientAuthTests.java b/plugin/security/src/test/java/org/elasticsearch/xpack/ssl/SSLClientAuthTests.java
index f827030..0c88584 100644
--- a/plugin/security/src/test/java/org/elasticsearch/xpack/ssl/SSLClientAuthTests.java
+++ b/plugin/security/src/test/java/org/elasticsearch/xpack/ssl/SSLClientAuthTests.java
@@ -68,7 +68,7 @@
         try (RestClient restClient = createRestClient(httpClientBuilder -> httpClientBuilder.setSSLStrategy(sessionStrategy), "https")) {
             restClient.performRequest("GET", "/");
             fail("Expected SSLHandshakeException");
-        } catch (SSLHandshakeException e) {
+        } catch (IOException e) {
             Throwable t = ExceptionsHelper.unwrap(e, CertPathBuilderException.class);
             assertThat(t, instanceOf(CertPathBuilderException.class));
             assertThat(t.getMessage(), containsString("unable to find valid certification path to requested target"));
