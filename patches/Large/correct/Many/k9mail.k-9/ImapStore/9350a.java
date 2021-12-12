diff --git a/src/com/fsck/k9/mail/store/ImapStore.java b/src/com/fsck/k9/mail/store/ImapStore.java
index d4cc67e..b9e9007 100644
--- a/src/com/fsck/k9/mail/store/ImapStore.java
+++ b/src/com/fsck/k9/mail/store/ImapStore.java
@@ -280,9 +280,9 @@
         String userInfo = authType.toString() + ":" + userEnc + ":" + passwordEnc;
         try {
             Map<String, String> extra = server.getExtra();
-            String prefix = (extra != null) ? extra.get(ImapStoreSettings.PATH_PREFIX_KEY) : null;
+            String path = (extra != null) ? "/" + extra.get(ImapStoreSettings.PATH_PREFIX_KEY) : null;
             return new URI(scheme, userInfo, server.host, server.port,
-                prefix,
+                path,
                 null, null).toString();
         } catch (URISyntaxException e) {
             throw new IllegalArgumentException("Can't create ImapStore URI", e);
