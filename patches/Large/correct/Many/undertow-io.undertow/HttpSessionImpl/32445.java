diff --git a/servlet/src/main/java/io/undertow/servlet/spec/HttpSessionImpl.java b/servlet/src/main/java/io/undertow/servlet/spec/HttpSessionImpl.java
index d306856..9a05968 100644
--- a/servlet/src/main/java/io/undertow/servlet/spec/HttpSessionImpl.java
+++ b/servlet/src/main/java/io/undertow/servlet/spec/HttpSessionImpl.java
@@ -134,7 +134,7 @@
             } else if(old == null) {
                 applicationListeners.httpSessionAttributeAdded(this, name, value);
             } else {
-                applicationListeners.httpSessionAttributeReplaced(this, name, value);
+                applicationListeners.httpSessionAttributeReplaced(this, name, old);
             }
         } catch (IOException e) {
             throw new RuntimeException(e);
