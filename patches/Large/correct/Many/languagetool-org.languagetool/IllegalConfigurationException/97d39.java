diff --git a/languagetool-server/src/main/java/org/languagetool/server/IllegalConfigurationException.java b/languagetool-server/src/main/java/org/languagetool/server/IllegalConfigurationException.java
index db1f905..4db377d 100644
--- a/languagetool-server/src/main/java/org/languagetool/server/IllegalConfigurationException.java
+++ b/languagetool-server/src/main/java/org/languagetool/server/IllegalConfigurationException.java
@@ -20,7 +20,7 @@
 
 class IllegalConfigurationException extends RuntimeException {
 
-  public IllegalConfigurationException(String message) {
+  IllegalConfigurationException(String message) {
     super(message);
   }
   
