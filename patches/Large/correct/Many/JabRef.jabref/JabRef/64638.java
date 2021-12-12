diff --git a/src/main/java/net/sf/jabref/JabRef.java b/src/main/java/net/sf/jabref/JabRef.java
index 9907cd5..9751ed5 100644
--- a/src/main/java/net/sf/jabref/JabRef.java
+++ b/src/main/java/net/sf/jabref/JabRef.java
@@ -395,7 +395,7 @@
                     boolean notSavedMsg = false;
 
                     // write an output, if something could be resolved
-                    if ((newBase != null) && !newBase.isEmpty()) {
+                    if ((newBase != null) && !newBase.hasNoEntries()) {
                         String subName = StringUtil.getCorrectFileName(data[1], "bib");
 
                         try {
