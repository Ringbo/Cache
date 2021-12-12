diff --git a/modules/cpr/src/main/java/org/atmosphere/client/MessageLengthInterceptor.java b/modules/cpr/src/main/java/org/atmosphere/client/MessageLengthInterceptor.java
index 4315f5e..97626a0 100644
--- a/modules/cpr/src/main/java/org/atmosphere/client/MessageLengthInterceptor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/client/MessageLengthInterceptor.java
@@ -71,7 +71,7 @@
 
                     @Override
                     public AsyncIOWriter write(String data) throws IOException {
-                        response.write(data + END);
+                        response.write(data + end);
                         return this;
                     }
 
@@ -103,7 +103,7 @@
 
                  @Override
                  public String filter(AtmosphereResponse r, String message) {
-                     return message + END;
+                     return message + end;
                  }
 
                  @Override
@@ -136,6 +136,6 @@
 
     @Override
     public String toString() {
-        return END + " End Message Interceptor";
+        return end + " End Message Interceptor";
     }
 }
