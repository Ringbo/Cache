diff --git a/plugins/git4idea/src/git4idea/commands/GitHttpGuiAuthenticator.java b/plugins/git4idea/src/git4idea/commands/GitHttpGuiAuthenticator.java
index ebbadae..25d75da 100644
--- a/plugins/git4idea/src/git4idea/commands/GitHttpGuiAuthenticator.java
+++ b/plugins/git4idea/src/git4idea/commands/GitHttpGuiAuthenticator.java
@@ -267,7 +267,7 @@
     }
     Couple<String> pair = UriUtil.splitScheme(url);
     String scheme = pair.getFirst();
-    if (StringUtil.isEmpty(scheme)) {
+    if (!StringUtil.isEmpty(scheme)) {
       return scheme + URLUtil.SCHEME_SEPARATOR + login + "@" + pair.getSecond();
     }
     return login + "@" + url;
