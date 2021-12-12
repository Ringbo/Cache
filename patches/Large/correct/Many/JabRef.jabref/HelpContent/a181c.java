diff --git a/src/main/java/net/sf/jabref/gui/help/HelpContent.java b/src/main/java/net/sf/jabref/gui/help/HelpContent.java
index 623d805..230120c 100644
--- a/src/main/java/net/sf/jabref/gui/help/HelpContent.java
+++ b/src/main/java/net/sf/jabref/gui/help/HelpContent.java
@@ -150,7 +150,7 @@
      */
     @Override
     public void setPage(URL url) {
-        if ("file".equals(url.getProtocol())) {
+        if ("file".equals(url.getProtocol()) || "jar".equals(url.getProtocol())) {
             // Creating file by url.toString() and using file.getName() preserves anchors
             File file = new File(url.toString());
             setPage(file.getName(), JabRef.class);
