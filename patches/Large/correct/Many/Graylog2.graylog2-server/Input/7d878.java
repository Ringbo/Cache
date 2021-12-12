diff --git a/src/main/java/org/graylog2/restclient/models/Input.java b/src/main/java/org/graylog2/restclient/models/Input.java
index 219c5ee..6e62b67 100644
--- a/src/main/java/org/graylog2/restclient/models/Input.java
+++ b/src/main/java/org/graylog2/restclient/models/Input.java
@@ -237,7 +237,7 @@
                 .expect(200, 404)
                 .execute();
 
-            if (response == null) {
+            if (response == null || response.value == null) {
                 return -1L;
             } else {
                 return response.value;
