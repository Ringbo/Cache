diff --git a/stetho/src/main/java/com/facebook/stetho/inspector/protocol/module/CSS.java b/stetho/src/main/java/com/facebook/stetho/inspector/protocol/module/CSS.java
index e55f153..b21d275 100755
--- a/stetho/src/main/java/com/facebook/stetho/inspector/protocol/module/CSS.java
+++ b/stetho/src/main/java/com/facebook/stetho/inspector/protocol/module/CSS.java
@@ -201,7 +201,7 @@
           return;
         }
 
-        if (key == null) {
+        if (key != null) {
           mDocument.setElementStyle(elementForNodeId, ruleName, key, value);
         }
 
