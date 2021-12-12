diff --git a/appcode-reveal/src/org/jetbrains/appcode/reveal/RefreshRevealAction.java b/appcode-reveal/src/org/jetbrains/appcode/reveal/RefreshRevealAction.java
index 67e57dd..b83c212 100644
--- a/appcode-reveal/src/org/jetbrains/appcode/reveal/RefreshRevealAction.java
+++ b/appcode-reveal/src/org/jetbrains/appcode/reveal/RefreshRevealAction.java
@@ -57,7 +57,7 @@
     boolean compatible = false;
 
     File appBundle = Reveal.getDefaultRevealApplicationBundle();
-    if (appBundle.exists()) {
+    if (appBundle != null && appBundle.exists()) {
       lib = Reveal.getRevealLib(appBundle, sdk);
       compatible = Reveal.isCompatible(appBundle);
 
@@ -108,7 +108,7 @@
     }
 
     File appBundle = Reveal.getDefaultRevealApplicationBundle();
-    if (appBundle.exists() == false) return;
+    if (appBundle != null && appBundle.exists() == false) return;
 
     String displayName = myDestination.isSimulator() ? null : myDestination.getDisplayName();
 
