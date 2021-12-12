diff --git a/src/test/java/org/elasticsearch/test/rest/spec/RestSpec.java b/src/test/java/org/elasticsearch/test/rest/spec/RestSpec.java
index 6da8591..52480a5 100644
--- a/src/test/java/org/elasticsearch/test/rest/spec/RestSpec.java
+++ b/src/test/java/org/elasticsearch/test/rest/spec/RestSpec.java
@@ -56,7 +56,7 @@
                     XContentParser parser = JsonXContent.jsonXContent.createParser(new FileInputStream(jsonFile));
                     RestApi restApi = new RestApiParser().parse(parser);
                     restSpec.addApi(restApi);
-                } catch (IOException ex) {
+                } catch (Throwable ex) {
                     throw new IOException("Can't parse rest spec file: [" + jsonFile + "]", ex);
                 }
             }
