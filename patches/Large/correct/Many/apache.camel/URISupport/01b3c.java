diff --git a/camel-core/src/main/java/org/apache/camel/util/URISupport.java b/camel-core/src/main/java/org/apache/camel/util/URISupport.java
index 4b06a13..0f37a2c 100644
--- a/camel-core/src/main/java/org/apache/camel/util/URISupport.java
+++ b/camel-core/src/main/java/org/apache/camel/util/URISupport.java
@@ -155,7 +155,7 @@
                 char ch = uri.charAt(i);
                 // look ahead of the next char
                 char next;
-                if (i < uri.length() - 2) {
+                if (i <= uri.length() - 2) {
                     next = uri.charAt(i + 1);
                 } else {
                     next = '\u0000';
