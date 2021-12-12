diff --git a/test/tsd/TestHttpQuery.java b/test/tsd/TestHttpQuery.java
index a87fa66..5660ce0 100644
--- a/test/tsd/TestHttpQuery.java
+++ b/test/tsd/TestHttpQuery.java
@@ -791,9 +791,9 @@
     assertEquals(HttpResponseStatus.INTERNAL_SERVER_ERROR, 
         query.response().getStatus());
     assertEquals(
-        "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">", 
+        "<!DOCTYPE html>", 
         query.response().getContent().toString(Charset.forName("UTF-8"))
-        .substring(0, 63));
+        .substring(0, 15));
   }
   
   @Test
@@ -845,9 +845,9 @@
     }
     assertEquals(HttpResponseStatus.BAD_REQUEST, query.response().getStatus());    
     assertEquals(
-        "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">", 
+        "<!DOCTYPE html>", 
         query.response().getContent().toString(Charset.forName("UTF-8"))
-        .substring(0, 63));
+        .substring(0, 15));
   }
   
   @Test
@@ -926,9 +926,9 @@
     query.badRequest("Bad user error");
     assertEquals(HttpResponseStatus.BAD_REQUEST, query.response().getStatus());    
     assertEquals(
-        "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">", 
+        "<!DOCTYPE html>", 
         query.response().getContent().toString(Charset.forName("UTF-8"))
-        .substring(0, 63));
+        .substring(0, 15));
   }
   
   @Test
@@ -967,9 +967,9 @@
     query.notFound();
     assertEquals(HttpResponseStatus.NOT_FOUND, query.response().getStatus());    
     assertEquals(
-        "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">", 
+        "<!DOCTYPE html>", 
         query.response().getContent().toString(Charset.forName("UTF-8"))
-        .substring(0, 63));
+        .substring(0, 15));
   }
   
   @Test
