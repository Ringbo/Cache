diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/control/CookieManager.java b/src/protocol/http/org/apache/jmeter/protocol/http/control/CookieManager.java
index 576c895..abafd3e 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/control/CookieManager.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/control/CookieManager.java
@@ -119,11 +119,11 @@
     }
 
     public String getPolicy() {
-        return getPropertyAsString(POLICY);
+        return getPropertyAsString(POLICY, HC4CookieHandler.DEFAULT_POLICY_NAME);
     }
 
     public void setCookiePolicy(String policy){
-        setProperty(POLICY, policy);
+        setProperty(POLICY, policy, HC4CookieHandler.DEFAULT_POLICY_NAME);
     }
 
     public CollectionProperty getCookies() {
@@ -143,11 +143,11 @@
     }
 
     public String getImplementation() {
-        return getPropertyAsString(IMPLEMENTATION);
+        return getPropertyAsString(IMPLEMENTATION, DEFAULT_IMPLEMENTATION);
     }
 
     public void setImplementation(String implementation){
-        setProperty(IMPLEMENTATION, implementation);
+        setProperty(IMPLEMENTATION, implementation, DEFAULT_IMPLEMENTATION);
     }
 
     /**
