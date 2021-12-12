diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index 0e3d7ae..13647cf 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -5944,7 +5944,7 @@
             intent = mHomeIntent;
         }
 
-        startActivityAsUser(mHomeIntent, UserHandle.CURRENT);
+        startActivityAsUser(intent, UserHandle.CURRENT);
     }
 
     /**
