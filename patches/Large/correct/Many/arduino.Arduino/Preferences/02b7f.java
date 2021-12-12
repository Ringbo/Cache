diff --git a/app/src/processing/app/Preferences.java b/app/src/processing/app/Preferences.java
index 0acd3b5..50cab76 100644
--- a/app/src/processing/app/Preferences.java
+++ b/app/src/processing/app/Preferences.java
@@ -737,9 +737,9 @@
     } catch (NumberFormatException e) {
       Preferences.remove("proxy.http.port");
     }
-    Preferences.set("proxy.https.server", proxyHTTPServer.getText());
+    Preferences.set("proxy.https.server", proxyHTTPSServer.getText());
     try {
-      Preferences.set("proxy.https.port", Integer.valueOf(proxyHTTPPort.getText()).toString());
+      Preferences.set("proxy.https.port", Integer.valueOf(proxyHTTPSPort.getText()).toString());
     } catch (NumberFormatException e) {
       Preferences.remove("proxy.https.port");
     }
@@ -783,11 +783,11 @@
     } catch (NumberFormatException e) {
       proxyHTTPPort.setText("");
     }
-    proxyHTTPServer.setText(Preferences.get("proxy.https.server"));
+    proxyHTTPSServer.setText(Preferences.get("proxy.https.server"));
     try {
-      proxyHTTPPort.setText(Integer.toString(Preferences.getInteger("proxy.https.port", 8443)));
+      proxyHTTPSPort.setText(Integer.toString(Preferences.getInteger("proxy.https.port", 8443)));
     } catch (NumberFormatException e) {
-      proxyHTTPPort.setText("");
+      proxyHTTPSPort.setText("");
     }
     proxyUser.setText(Preferences.get("proxy.user"));
     proxyPassword.setText(Preferences.get("proxy.password"));
