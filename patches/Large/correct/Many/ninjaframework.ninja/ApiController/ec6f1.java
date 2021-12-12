diff --git a/ninja-servlet-jpa-blog-integration-test/src/main/java/controllers/ApiController.java b/ninja-servlet-jpa-blog-integration-test/src/main/java/controllers/ApiController.java
index 44679e0..569a0f5 100644
--- a/ninja-servlet-jpa-blog-integration-test/src/main/java/controllers/ApiController.java
+++ b/ninja-servlet-jpa-blog-integration-test/src/main/java/controllers/ApiController.java
@@ -70,7 +70,7 @@
         if (!succeeded) {
             return Results.notFound();
         } else {
-            return Results.ok();
+            return Results.json();
         }
 
     }
@@ -84,7 +84,7 @@
         if (!succeeded) {
             return Results.notFound();
         } else {
-            return Results.ok();
+            return Results.xml();
         }
 
     }
