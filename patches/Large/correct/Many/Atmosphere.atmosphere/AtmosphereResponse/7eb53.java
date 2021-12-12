diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java
index abb4f9b..9056a33 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java
@@ -426,7 +426,7 @@
             for (Cookie c : cookies) {
                 headers.put("Set-Cookie", c.toString());
             }
-            headerHandled = false;
+            headerHandled = true;
         }
         return headers;
     }
