diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/TabContentLayout.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/TabContentLayout.java
index da26086..3b4347f 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/TabContentLayout.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/TabContentLayout.java
@@ -95,7 +95,7 @@
     ContentManager manager = myUi.myManager;
     LayoutData data = new LayoutData(myUi);
 
-    data.eachX = 8;
+    data.eachX = 4;
     data.eachY = 0;
 
     if (isIdVisible()) {
