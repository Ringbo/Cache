diff --git a/Android/DevSample/small/src/main/java/net/wequick/small/Bundle.java b/Android/DevSample/small/src/main/java/net/wequick/small/Bundle.java
index d534688..84eec39 100644
--- a/Android/DevSample/small/src/main/java/net/wequick/small/Bundle.java
+++ b/Android/DevSample/small/src/main/java/net/wequick/small/Bundle.java
@@ -267,7 +267,7 @@
                 e.printStackTrace();
             }
             bundle.prepareForLaunch();
-            bundle.setQuery(uri.getQuery());
+            bundle.setQuery(uri.getEncodedQuery()); // Fix issue #6 from Spring-Xu.
             bundle.mApplicableLauncher = new WebBundleLauncher();
             bundle.mApplicableLauncher.prelaunchBundle(bundle);
             return bundle;
