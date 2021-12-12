diff --git a/ReactAndroid/src/main/java/com/facebook/react/views/text/ReactTextShadowNode.java b/ReactAndroid/src/main/java/com/facebook/react/views/text/ReactTextShadowNode.java
index dbdcc29..97408da 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/views/text/ReactTextShadowNode.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/views/text/ReactTextShadowNode.java
@@ -339,7 +339,7 @@
   protected int mNumberOfLines = UNSET;
   protected int mFontSize = UNSET;
   protected float mFontSizeInput = UNSET;
-  protected int mLineHeightInput = UNSET;
+  protected float mLineHeightInput = UNSET;
   protected int mTextAlign = Gravity.NO_GRAVITY;
   protected int mTextBreakStrategy = (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) ?
       0 : Layout.BREAK_STRATEGY_HIGH_QUALITY;
@@ -441,8 +441,8 @@
     markUpdated();
   }
 
-  @ReactProp(name = ViewProps.LINE_HEIGHT, defaultInt = UNSET)
-  public void setLineHeight(int lineHeight) {
+  @ReactProp(name = ViewProps.LINE_HEIGHT, defaultFloat = UNSET)
+  public void setLineHeight(float lineHeight) {
     mLineHeightInput = lineHeight;
     if (lineHeight == UNSET) {
       mLineHeight = Float.NaN;
