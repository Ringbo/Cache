diff --git a/scribejava-apis/src/test/java/com/github/scribejava/apis/examples/Box20Example.java b/scribejava-apis/src/test/java/com/github/scribejava/apis/examples/Box20Example.java
index 9fd966a..cc5adff 100644
--- a/scribejava-apis/src/test/java/com/github/scribejava/apis/examples/Box20Example.java
+++ b/scribejava-apis/src/test/java/com/github/scribejava/apis/examples/Box20Example.java
@@ -24,7 +24,7 @@
     public static void main(String... args) throws IOException {
         //Replace these with your client id and secret
         final String clientId = "your client id";
-        final string clientSecret = "your client secret";
+        final String clientSecret = "your client secret";
         final String secretState = "secret" + new Random().nextInt(999_999);
         final OAuth20Service service = new ServiceBuilder()
                 .apiKey(clientId)
