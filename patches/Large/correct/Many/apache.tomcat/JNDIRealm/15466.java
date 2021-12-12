diff --git a/java/org/apache/catalina/realm/JNDIRealm.java b/java/org/apache/catalina/realm/JNDIRealm.java
index cf96a05..0494d48 100644
--- a/java/org/apache/catalina/realm/JNDIRealm.java
+++ b/java/org/apache/catalina/realm/JNDIRealm.java
@@ -1553,9 +1553,9 @@
                     password = password.substring(5);
                     md.reset();
                     md.update(credentials.getBytes(B2CConverter.ISO_8859_1));
-                    byte[] decoded = Base64.decodeBase64(md.digest());
+                    byte[] encoded = Base64.encodeBase64(md.digest());
                     String digestedPassword =
-                            new String(decoded, B2CConverter.ISO_8859_1);
+                            new String(encoded, B2CConverter.ISO_8859_1);
                     validated = password.equals(digestedPassword);
                 }
             } else if (password.startsWith("{SSHA}")) {
