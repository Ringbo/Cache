diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index dfc5a77..4664aa3 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -5943,7 +5943,7 @@
             intent = mHomeIntent;
         }
 
-        startActivityAsUser(mHomeIntent, UserHandle.CURRENT);
+        startActivityAsUser(intent, UserHandle.CURRENT);
     }
 
     /**
