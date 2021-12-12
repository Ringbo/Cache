diff --git a/twitter4j-core/src/main/java/twitter4j/internal/http/HttpClientImpl.java b/twitter4j-core/src/main/java/twitter4j/internal/http/HttpClientImpl.java
index ab3ef49..b6d5290 100644
--- a/twitter4j-core/src/main/java/twitter4j/internal/http/HttpClientImpl.java
+++ b/twitter4j-core/src/main/java/twitter4j/internal/http/HttpClientImpl.java
@@ -298,7 +298,7 @@
                             }
                         }
                     }
-                    if (responseCode < OK && MULTIPLE_CHOICES <= responseCode) {
+                    if (responseCode < OK || MULTIPLE_CHOICES <= responseCode) {
                         if (responseCode == ENHANCE_YOUR_CLAIM ||
                                 responseCode == SERVICE_UNAVAILABLE ||
                                 responseCode == BAD_REQUEST ||
