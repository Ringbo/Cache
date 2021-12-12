diff --git a/h2/src/main/org/h2/security/auth/ConfigProperties.java b/h2/src/main/org/h2/security/auth/ConfigProperties.java
index c862e0a..56a70d7 100644
--- a/h2/src/main/org/h2/security/auth/ConfigProperties.java
+++ b/h2/src/main/org/h2/security/auth/ConfigProperties.java
@@ -75,7 +75,7 @@
         if (result == null) {
             return defaultValue;
         }
-        return Utils.parseBoolean(name, defaultValue, true);
+        return Utils.parseBoolean(result, defaultValue, true);
     }
 
 }
