diff --git a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java
index 17b0eb6..bcd08eb4 100644
--- a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java
+++ b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java
@@ -290,7 +290,7 @@
                     TypedValue out = new TypedValue();
                     if (ResourceHelper.parseFloatAttribute("textSize", textSize.getValue(), out,
                             true /*requireUnit*/)) {
-                        textView.setTextSize(
+                        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                                 out.getDimension(bridgeContext.getResources().getDisplayMetrics()));
                     }
                 }
