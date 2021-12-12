diff --git a/core/java/android/net/Uri.java b/core/java/android/net/Uri.java
index 437153b..0fb84b7 100644
--- a/core/java/android/net/Uri.java
+++ b/core/java/android/net/Uri.java
@@ -384,7 +384,7 @@
         if (scheme != null) {
             if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip")
                     || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto")
-                    || scheme.equalsIgnoreCase("mailto")) {
+                    || scheme.equalsIgnoreCase("mailto") || scheme.equalsIgnoreCase("nfc")) {
                 StringBuilder builder = new StringBuilder(64);
                 builder.append(scheme);
                 builder.append(':');
