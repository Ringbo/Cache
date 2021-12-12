diff --git a/subprojects/wrapper/src/main/java/org/gradle/wrapper/Download.java b/subprojects/wrapper/src/main/java/org/gradle/wrapper/Download.java
index f5760ca..db06741 100644
--- a/subprojects/wrapper/src/main/java/org/gradle/wrapper/Download.java
+++ b/subprojects/wrapper/src/main/java/org/gradle/wrapper/Download.java
@@ -114,9 +114,9 @@
      *
      * @param userInfo user info
      * @return Base64 encoded user info
-     * @throws IOException if no public Base64 encoder is available on this JVM
+     * @throws RuntimeException if no public Base64 encoder is available on this JVM
      */
-    private String base64EncodeForBasicAuthentication(String userInfo) throws IOException {
+    private String base64EncodeForBasicAuthentication(String userInfo) {
         try {
             Class<?> datatypeConverter = getClass().getClassLoader().loadClass("javax.xml.bind.DatatypeConverter");
             Method base64Encode = datatypeConverter.getMethod("printBase64Binary", byte[].class);
