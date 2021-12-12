diff --git a/src/org/xmlrpc/android/ApiHelper.java b/src/org/xmlrpc/android/ApiHelper.java
index d0e56f1..c9927fa 100644
--- a/src/org/xmlrpc/android/ApiHelper.java
+++ b/src/org/xmlrpc/android/ApiHelper.java
@@ -424,7 +424,7 @@
                 return -1;
             }
 
-            String blogId = String.valueOf(blog.getRemoteBlogId());
+            String blogId = String.valueOf(blog.getLocalTableBlogId());
             
             client = new XMLRPCClient(blog.getUrl(),
                     blog.getHttpuser(),
@@ -590,7 +590,7 @@
                 return null;
             }
             
-            String blogId = String.valueOf(blog.getRemoteBlogId());
+            String blogId = String.valueOf(blog.getLocalTableBlogId());
             
             client = new XMLRPCClient(blog.getUrl(),
                     blog.getHttpuser(),
