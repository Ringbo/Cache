diff --git a/support/cas-server-support-oauth-services/src/main/java/org/apereo/cas/support/oauth/services/OAuthRegisteredService.java b/support/cas-server-support-oauth-services/src/main/java/org/apereo/cas/support/oauth/services/OAuthRegisteredService.java
index e2dde16..521956a 100644
--- a/support/cas-server-support-oauth-services/src/main/java/org/apereo/cas/support/oauth/services/OAuthRegisteredService.java
+++ b/support/cas-server-support-oauth-services/src/main/java/org/apereo/cas/support/oauth/services/OAuthRegisteredService.java
@@ -45,11 +45,11 @@
 
     @Lob
     @Column(name = "supported_grants", length = Integer.MAX_VALUE)
-    private Set<String> supportedGrantTypes = new HashSet<>();
+    private HashSet<String> supportedGrantTypes = new HashSet<>();
 
     @Lob
     @Column(name = "supported_responses", length = Integer.MAX_VALUE)
-    private Set<String> supportedResponseTypes = new HashSet<>();
+    private HashSet<String> supportedResponseTypes = new HashSet<>();
 
     public String getClientId() {
         return this.clientId;
@@ -96,7 +96,7 @@
     }
 
     public void setSupportedGrantTypes(final Set<String> supportedGrantTypes) {
-        this.supportedGrantTypes = supportedGrantTypes;
+        this.supportedGrantTypes = new HashSet<>(supportedGrantTypes);
     }
 
     public Set<String> getSupportedResponseTypes() {
@@ -104,7 +104,7 @@
     }
 
     public void setSupportedResponseTypes(final Set<String> supportedResponseTypes) {
-        this.supportedResponseTypes = supportedResponseTypes;
+        this.supportedResponseTypes = new HashSet<>(supportedResponseTypes);
     }
 
     @Override
