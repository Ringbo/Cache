diff --git a/rt/transports/http/src/main/java/org/apache/cxf/transport/http/auth/HttpAuthHeader.java b/rt/transports/http/src/main/java/org/apache/cxf/transport/http/auth/HttpAuthHeader.java
index b1c1a25..7178a54 100644
--- a/rt/transports/http/src/main/java/org/apache/cxf/transport/http/auth/HttpAuthHeader.java
+++ b/rt/transports/http/src/main/java/org/apache/cxf/transport/http/auth/HttpAuthHeader.java
@@ -157,7 +157,7 @@
     }
 
     public boolean authTypeIsNegotiate() {
-        return AUTH_TYPE_DIGEST.equals(this.authType);
+        return AUTH_TYPE_NEGOTIATE.equals(this.authType);
     }
 
     public String getAuthType() {
