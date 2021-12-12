diff --git a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java
index ea9d8d9..99dc5ad 100644
--- a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java
+++ b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/CustomBar.java
@@ -274,7 +274,7 @@
                     TypedValue out = new TypedValue();
                     if (ResourceHelper.parseFloatAttribute("textSize", textSize.getValue(), out,
                             true /*requireUnit*/)) {
-                        textView.setTextSize(
+                        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                                 out.getDimension(bridgeContext.getResources().getDisplayMetrics()));
                     }
                 }
