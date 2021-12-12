diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java
index 3f5b4fd..2c7ed0d 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java
@@ -583,7 +583,7 @@
         if (create) {
             return getSession();
         }
-        return session != null && isNotNoOps() ? b.request.getSession(false) : session;
+        return session == null && isNotNoOps() ? b.request.getSession(false) : session;
     }
 
     /**
