diff --git a/api/cas-server-core-api-services/src/main/java/org/apereo/cas/services/RegisteredServiceConsentPolicy.java b/api/cas-server-core-api-services/src/main/java/org/apereo/cas/services/RegisteredServiceConsentPolicy.java
index c004cc8..615efe9 100644
--- a/api/cas-server-core-api-services/src/main/java/org/apereo/cas/services/RegisteredServiceConsentPolicy.java
+++ b/api/cas-server-core-api-services/src/main/java/org/apereo/cas/services/RegisteredServiceConsentPolicy.java
@@ -31,7 +31,7 @@
      * @return the excluded attributes
      */
     default Set<String> getExcludedAttributes() {
-        return new LinkedHashSet<>();
+        return new LinkedHashSet<>(0);
     }
 
     /**
@@ -43,6 +43,6 @@
      * attribute release policy is consulted to determine all of included attributes.
      */
     default Set<String> getIncludeOnlyAttributes() {
-        return new LinkedHashSet<>();
+        return new LinkedHashSet<>(0);
     }
 }
