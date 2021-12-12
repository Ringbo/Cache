diff --git a/lib/src/main/java/com/google/samples/apps/iosched/signin/RegistrationStatusService.java b/lib/src/main/java/com/google/samples/apps/iosched/signin/RegistrationStatusService.java
index 53d14c1..3704afe 100644
--- a/lib/src/main/java/com/google/samples/apps/iosched/signin/RegistrationStatusService.java
+++ b/lib/src/main/java/com/google/samples/apps/iosched/signin/RegistrationStatusService.java
@@ -86,8 +86,7 @@
 
         firebaseConnect(acct);
 
-        // TODO (see b/37012781)
-        return START_NOT_STICKY;  // Retry intent if service exits prematurely
+        return START_REDELIVER_INTENT;  // Retry intent if service exits prematurely
     }
 
     /**
