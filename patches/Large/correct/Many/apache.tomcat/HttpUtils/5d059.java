diff --git a/java/javax/servlet/http/HttpUtils.java b/java/javax/servlet/http/HttpUtils.java
index ba756e6..e7e1b91 100644
--- a/java/javax/servlet/http/HttpUtils.java
+++ b/java/javax/servlet/http/HttpUtils.java
@@ -182,7 +182,7 @@
             } while ((len - offset) > 0);
 
         } catch (IOException e) {
-            throw new IllegalArgumentException(e.getMessage());
+            throw new IllegalArgumentException(e.getMessage(), e);
         }
 
         // XXX we shouldn't assume that the only kind of POST body
@@ -194,7 +194,7 @@
         } catch (java.io.UnsupportedEncodingException e) {
             // XXX function should accept an encoding parameter & throw this
             // exception.  Otherwise throw something expected.
-            throw new IllegalArgumentException(e.getMessage());
+            throw new IllegalArgumentException(e.getMessage(), e);
         }
     }
 
