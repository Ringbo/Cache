diff --git a/test/org/apache/tomcat/util/net/openssl/ciphers/TestCipher.java b/test/org/apache/tomcat/util/net/openssl/ciphers/TestCipher.java
index 985b012..fd680ba 100644
--- a/test/org/apache/tomcat/util/net/openssl/ciphers/TestCipher.java
+++ b/test/org/apache/tomcat/util/net/openssl/ciphers/TestCipher.java
@@ -90,7 +90,7 @@
         Set<String> unavailableCipherSuites = new HashSet<>();
         unavailableCipherSuites.addAll(expectedCipherSuites);
         unavailableCipherSuites.removeAll(availableCipherSuites);
-        StringBuilder unavailableList = new StringBuilder();
+        StringBuilder unavailableList = new StringBuilder("Unavailable cipher suites: ");
         for (String cipher : unavailableCipherSuites) {
             unavailableList.append(cipher);
             unavailableList.append(' ');
@@ -100,7 +100,7 @@
         Set<String> unexpectedCipherSuites = new HashSet<>();
         unexpectedCipherSuites.addAll(availableCipherSuites);
         unexpectedCipherSuites.removeAll(expectedCipherSuites);
-        StringBuilder unexpectedList = new StringBuilder();
+        StringBuilder unexpectedList = new StringBuilder("Unexpected cipher suites: ");
         for (String cipher : unexpectedCipherSuites) {
             unexpectedList.append(cipher);
             unexpectedList.append(' ');
