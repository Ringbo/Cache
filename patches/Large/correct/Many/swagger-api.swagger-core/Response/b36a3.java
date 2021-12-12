diff --git a/modules/swagger-models/src/main/java/io/swagger/models/Response.java b/modules/swagger-models/src/main/java/io/swagger/models/Response.java
index b0cf545..53d624c 100644
--- a/modules/swagger-models/src/main/java/io/swagger/models/Response.java
+++ b/modules/swagger-models/src/main/java/io/swagger/models/Response.java
@@ -8,15 +8,15 @@
  * Created by russellb337 on 7/9/15.
  */
 public interface Response {
-    ResponseImpl schema(Property property);
+    Response schema(Property property);
 
-    ResponseImpl description(String description);
+    Response description(String description);
 
-    ResponseImpl example(String type, Object example);
+    Response example(String type, Object example);
 
-    ResponseImpl header(String name, Property property);
+    Response header(String name, Property property);
 
-    ResponseImpl headers(Map<String, Property> headers);
+    Response headers(Map<String, Property> headers);
 
     String getDescription();
 
