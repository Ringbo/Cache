diff --git a/java/compiler/impl/src/com/intellij/compiler/server/BuildManager.java b/java/compiler/impl/src/com/intellij/compiler/server/BuildManager.java
index c817a35..a9c6135 100644
--- a/java/compiler/impl/src/com/intellij/compiler/server/BuildManager.java
+++ b/java/compiler/impl/src/com/intellij/compiler/server/BuildManager.java
@@ -1463,7 +1463,7 @@
       String text;
 
       synchronized (this) {
-        if (myStoredLength > 2048) {
+        if (myStoredLength > 16384) {
           return;
         }
         text = event.getText();
