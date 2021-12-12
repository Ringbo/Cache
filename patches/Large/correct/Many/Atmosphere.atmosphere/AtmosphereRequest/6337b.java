diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java
index b3babaf..624df74 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java
@@ -583,7 +583,7 @@
      */
     @Override
     public HttpSession getSession() {
-        return getSession(false);
+        return getSession(true);
     }
 
     /**
