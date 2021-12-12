diff --git a/java/org/apache/catalina/authenticator/jaspic/PrincipalGroupCallback.java b/java/org/apache/catalina/authenticator/jaspic/PrincipalGroupCallback.java
index 625576e..15385be 100644
--- a/java/org/apache/catalina/authenticator/jaspic/PrincipalGroupCallback.java
+++ b/java/org/apache/catalina/authenticator/jaspic/PrincipalGroupCallback.java
@@ -60,7 +60,7 @@
             return callerPrincipalCallback.getSubject();
         }
         if (groupPrincipalCallback != null) {
-            return callerPrincipalCallback.getSubject();
+            return groupPrincipalCallback.getSubject();
         }
         return null;
     }
