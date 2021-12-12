diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index d8cb240..930ef9a 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -5956,7 +5956,7 @@
             intent = mHomeIntent;
         }
 
-        startActivityAsUser(mHomeIntent, UserHandle.CURRENT);
+        startActivityAsUser(intent, UserHandle.CURRENT);
     }
 
     /**
