diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/DefaultCookie.java b/codec-http/src/main/java/io/netty/handler/codec/http/DefaultCookie.java
index e94e5dc..cb5d3c6 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/DefaultCookie.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/DefaultCookie.java
@@ -273,7 +273,7 @@
 
         if (getPath() == null && that.getPath() != null) {
             return false;
-        } else if (that.getPath() == null) {
+        } else if (that.getPath() == null && getPath() != null) {
             return false;
         }
         if (!getPath().equals(that.getPath())) {
@@ -282,7 +282,7 @@
 
         if (getDomain() == null && that.getDomain() != null) {
             return false;
-        } else if (that.getDomain() == null) {
+        } else if (that.getDomain() == null && getDomain() != null) {
             return false;
         }
         return getDomain().equalsIgnoreCase(that.getDomain());
@@ -298,7 +298,7 @@
 
         if (getPath() == null && c.getPath() != null) {
             return -1;
-        } else if (c.getPath() == null) {
+        } else if (c.getPath() == null && getPath() != null) {
             return 1;
         }
         v = getPath().compareTo(c.getPath());
@@ -308,7 +308,7 @@
 
         if (getDomain() == null && c.getDomain() != null) {
             return -1;
-        } else if (c.getDomain() == null) {
+        } else if (c.getDomain() == null && getDomain() != null) {
             return 1;
         }
         v = getDomain().compareToIgnoreCase(c.getDomain());
