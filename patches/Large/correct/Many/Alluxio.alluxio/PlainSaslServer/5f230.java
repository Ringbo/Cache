diff --git a/common/src/main/java/tachyon/security/PlainSaslServer.java b/common/src/main/java/tachyon/security/PlainSaslServer.java
index 5a0bc42..2c013ff 100644
--- a/common/src/main/java/tachyon/security/PlainSaslServer.java
+++ b/common/src/main/java/tachyon/security/PlainSaslServer.java
@@ -72,7 +72,7 @@
       String[] parts = payload.split("\u0000", 3);
       // validate response
       if (parts.length != 3) {
-        throw new IllegalArgumentException("Received corrupt response");
+        throw new IllegalArgumentException("Invalid message format, parts must contain 3 items");
       }
       String authzid = parts[0];
       mAuthcid = parts[1];
@@ -96,12 +96,12 @@
       Callback[] cbList = {nameCallback, passwordCallback, authCallback};
       mHandler.handle(cbList);
       if (!authCallback.isAuthorized()) {
-        throw new SaslException("Authentication failed");
+        throw new SaslException("AuthorizeCallback authorized failure");
       }
     } catch (IOException ioe) {
-      throw new SaslException("Error validating the login", ioe);
+      throw new SaslException("Error validating the response", ioe);
     } catch (UnsupportedCallbackException uce) {
-      throw new SaslException("Error validating the login", uce);
+      throw new SaslException("Error validating the response", uce);
     }
     mCompleted = true;
     return null;
@@ -121,13 +121,13 @@
   @Override
   public byte[] unwrap(byte[] incoming, int offset, int len) {
     throwIfNotComplete();
-    throw new IllegalStateException("PLAIN supports neither integrity nor privacy");
+    throw new UnsupportedOperationException("PLAIN doesn't support wrap or unwrap operation");
   }
 
   @Override
   public byte[] wrap(byte[] outgoing, int offset, int len) {
     throwIfNotComplete();
-    throw new IllegalStateException("PLAIN supports neither integrity nor privacy");
+    throw new UnsupportedOperationException("PLAIN doesn't support wrap or unwrap operation");
   }
 
   @Override
