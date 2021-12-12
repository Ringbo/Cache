diff --git a/library/src/com/nineoldandroids/view/animation/AnimatorProxy.java b/library/src/com/nineoldandroids/view/animation/AnimatorProxy.java
index 7ea410c..a041322 100644
--- a/library/src/com/nineoldandroids/view/animation/AnimatorProxy.java
+++ b/library/src/com/nineoldandroids/view/animation/AnimatorProxy.java
@@ -31,7 +31,8 @@
      */
     public static AnimatorProxy wrap(View view) {
         AnimatorProxy proxy = PROXIES.get(view);
-        if (proxy == null) {
+        // This checks if the proxy already exists and whether it still is the animation of the given view
+        if (proxy == null || proxy != view.getAnimation()) {
             proxy = new AnimatorProxy(view);
             PROXIES.put(view, proxy);
         }
