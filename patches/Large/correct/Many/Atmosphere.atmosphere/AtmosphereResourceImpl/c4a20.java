diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
index 19e868b..fbf1508 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResourceImpl.java
@@ -574,7 +574,7 @@
         if (serializer != null) {
             serializer.write(os, o);
         } else {
-            response.getOutputStream().write(o.toString().getBytes());
+            response.getOutputStream().write(o.toString().getBytes(response.getCharacterEncoding()));
         }
         return this;
     }
