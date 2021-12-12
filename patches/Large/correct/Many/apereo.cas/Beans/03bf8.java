diff --git a/cas-server-core-configuration/src/main/java/org/apereo/cas/configuration/support/Beans.java b/cas-server-core-configuration/src/main/java/org/apereo/cas/configuration/support/Beans.java
index 40b4b4d..c865387 100644
--- a/cas-server-core-configuration/src/main/java/org/apereo/cas/configuration/support/Beans.java
+++ b/cas-server-core-configuration/src/main/java/org/apereo/cas/configuration/support/Beans.java
@@ -207,7 +207,7 @@
 
             case LOWERCASE:
                 final ConvertCasePrincipalNameTransformer t1 = new ConvertCasePrincipalNameTransformer(res);
-                t1.setToUpperCase(true);
+                t1.setToUpperCase(false);
                 return t1;
         }
         return res;
