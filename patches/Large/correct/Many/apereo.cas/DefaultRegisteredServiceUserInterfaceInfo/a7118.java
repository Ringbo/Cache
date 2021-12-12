diff --git a/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/services/DefaultRegisteredServiceUserInterfaceInfo.java b/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/services/DefaultRegisteredServiceUserInterfaceInfo.java
index b2d6ed9..62c4581 100644
--- a/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/services/DefaultRegisteredServiceUserInterfaceInfo.java
+++ b/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/services/DefaultRegisteredServiceUserInterfaceInfo.java
@@ -61,11 +61,11 @@
      * @return the descriptions
      */
     public Collection<String> getDescriptions() {
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     public Collection<String> getDisplayNames() {
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     /**
@@ -87,7 +87,7 @@
      * @return the information uR ls
      */
     public Collection<String> getInformationURLs() {
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
 
@@ -110,7 +110,7 @@
      * @return the privacy statement uR ls
      */
     public Collection<String> getPrivacyStatementURLs() {
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     /**
@@ -170,7 +170,7 @@
      * @return the logo urls
      */
     public Collection<Logo> getLogoUrls() {
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     /**
