diff --git a/src/main/java/org/web3j/console/ConsoleDevice.java b/src/main/java/org/web3j/console/ConsoleDevice.java
index de091c1..74af8aa 100644
--- a/src/main/java/org/web3j/console/ConsoleDevice.java
+++ b/src/main/java/org/web3j/console/ConsoleDevice.java
@@ -21,6 +21,6 @@
 
     @Override
     public char[] readPassword(String fmt, Object... args) {
-        return console.readPassword();
+        return console.readPassword(fmt, args);
     }
 }
