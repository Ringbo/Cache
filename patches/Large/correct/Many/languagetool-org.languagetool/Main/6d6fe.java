diff --git a/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java b/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java
index f958e0e..5059324 100644
--- a/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java
+++ b/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java
@@ -113,7 +113,7 @@
     }
   }
 
-  private void changeContext(XComponentContext xCompContext) {
+  void changeContext(XComponentContext xCompContext) {
     xContext = xCompContext;
   }
 
@@ -300,7 +300,7 @@
     return getServiceNames();
   }
 
-  private static String[] getServiceNames() {
+  static String[] getServiceNames() {
     return SERVICE_NAMES;
   }
 
