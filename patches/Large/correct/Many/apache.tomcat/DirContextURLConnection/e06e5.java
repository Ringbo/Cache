diff --git a/java/org/apache/naming/resources/DirContextURLConnection.java b/java/org/apache/naming/resources/DirContextURLConnection.java
index 76278f8..89e54fe 100644
--- a/java/org/apache/naming/resources/DirContextURLConnection.java
+++ b/java/org/apache/naming/resources/DirContextURLConnection.java
@@ -342,7 +342,8 @@
         if (object != null)
             return object;
         
-        throw new FileNotFoundException();
+        throw new FileNotFoundException(
+                getURL() == null ? "null" : getURL().toString());
         
     }
     
@@ -378,7 +379,8 @@
             connect();
         
         if (resource == null) {
-            throw new FileNotFoundException();
+            throw new FileNotFoundException(
+                    getURL() == null ? "null" : getURL().toString());
         }
 
         // Reopen resource
@@ -418,7 +420,8 @@
         }
         
         if ((resource == null) && (collection == null)) {
-            throw new FileNotFoundException();
+            throw new FileNotFoundException(
+                    getURL() == null ? "null" : getURL().toString());
         }
         
         Vector<String> result = new Vector<String>();
@@ -446,7 +449,8 @@
                 }
             } catch (NamingException e) {
                 // Unexpected exception
-                throw new FileNotFoundException();
+                throw new FileNotFoundException(
+                        getURL() == null ? "null" : getURL().toString());
             }
         }
         
