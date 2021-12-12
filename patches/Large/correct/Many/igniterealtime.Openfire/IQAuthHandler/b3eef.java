diff --git a/src/java/org/jivesoftware/messenger/handler/IQAuthHandler.java b/src/java/org/jivesoftware/messenger/handler/IQAuthHandler.java
index 8aa691c..97dae2f 100644
--- a/src/java/org/jivesoftware/messenger/handler/IQAuthHandler.java
+++ b/src/java/org/jivesoftware/messenger/handler/IQAuthHandler.java
@@ -104,7 +104,7 @@
                 }
                 // Otherwise set query
                 else {
-                    if (iq.elements().isEmpty()) {
+                    if (query.elements().isEmpty()) {
                         // Anonymous authentication
                         response = anonymousLogin(session, packet);
                     }
