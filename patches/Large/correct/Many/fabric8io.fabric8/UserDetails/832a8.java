diff --git a/forge/fabric8-forge-core/src/main/java/io/fabric8/forge/rest/main/UserDetails.java b/forge/fabric8-forge-core/src/main/java/io/fabric8/forge/rest/main/UserDetails.java
index 1e3e139..98bd29c 100644
--- a/forge/fabric8-forge-core/src/main/java/io/fabric8/forge/rest/main/UserDetails.java
+++ b/forge/fabric8-forge-core/src/main/java/io/fabric8/forge/rest/main/UserDetails.java
@@ -97,7 +97,7 @@
 
             @Override
             public String toString() {
-                return "UsernamePasswordCredentialsProvider{user: " + getUser() + ", password length: " + (Strings.isNotBlank(password) ? 0 : password.length()) + "}";
+                return "UsernamePasswordCredentialsProvider{user: " + getUser() + ", password length: " + (Strings.isNullOrBlank(password) ? 0 : password.length()) + "}";
             }
         };
     }
