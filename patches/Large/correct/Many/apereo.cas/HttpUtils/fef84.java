diff --git a/core/cas-server-core-util-api/src/main/java/org/apereo/cas/util/HttpUtils.java b/core/cas-server-core-util-api/src/main/java/org/apereo/cas/util/HttpUtils.java
index 9bc29bb..876c4c0 100644
--- a/core/cas-server-core-util-api/src/main/java/org/apereo/cas/util/HttpUtils.java
+++ b/core/cas-server-core-util-api/src/main/java/org/apereo/cas/util/HttpUtils.java
@@ -474,7 +474,7 @@
             });
             
             val writer = new StringWriter();
-            try (val httpResponseReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
+            try (val httpResponseReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), StandardCharsets.UTF_8))) {
                 var lineRead = StringUtils.EMPTY;
                 while ((lineRead = httpResponseReader.readLine()) != null) {
                     writer.write(lineRead);
