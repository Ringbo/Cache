diff --git a/src/main/java/net/sf/jabref/gui/PreviewPanel.java b/src/main/java/net/sf/jabref/gui/PreviewPanel.java
index e6b56c0..0615264 100644
--- a/src/main/java/net/sf/jabref/gui/PreviewPanel.java
+++ b/src/main/java/net/sf/jabref/gui/PreviewPanel.java
@@ -222,7 +222,7 @@
     }
 
     public void setLayout(Layout layout) {
-        this.layout = Optional.of(layout);
+        this.layout = Optional.ofNullable(layout);
     }
 
     public void setEntry(BibEntry newEntry) {
