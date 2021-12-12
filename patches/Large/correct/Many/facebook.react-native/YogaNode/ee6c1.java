diff --git a/ReactAndroid/src/main/java/com/facebook/yoga/YogaNode.java b/ReactAndroid/src/main/java/com/facebook/yoga/YogaNode.java
index e266701..0022bad 100644
--- a/ReactAndroid/src/main/java/com/facebook/yoga/YogaNode.java
+++ b/ReactAndroid/src/main/java/com/facebook/yoga/YogaNode.java
@@ -117,7 +117,7 @@
     }
   }
 
-  private native void jni_YGNodeReset(long nativePointer);
+  private static native void jni_YGNodeReset(long nativePointer);
   public void reset() {
     mEdgeSetFlag = 0;
     mHasSetPosition = false;
@@ -160,7 +160,7 @@
     return mChildren.get(i);
   }
 
-  private native void jni_YGNodeInsertChild(long nativePointer, long childPointer, int index);
+  private static native void jni_YGNodeInsertChild(long nativePointer, long childPointer, int index);
   public void addChildAt(YogaNode child, int i) {
     if (child.mOwner != null) {
       throw new IllegalStateException("Child already has a parent, it must be removed first.");
@@ -174,7 +174,7 @@
     jni_YGNodeInsertChild(mNativePointer, child.mNativePointer, i);
   }
 
-  private native void jni_YGNodeInsertSharedChild(long nativePointer, long childPointer, int index);
+  private static native void jni_YGNodeInsertSharedChild(long nativePointer, long childPointer, int index);
 
   public void addSharedChildAt(YogaNode child, int i) {
     if (mChildren == null) {
@@ -185,7 +185,7 @@
     jni_YGNodeInsertSharedChild(mNativePointer, child.mNativePointer, i);
   }
 
-  private native void jni_YGNodeSetOwner(long nativePointer, long newOwnerNativePointer);
+  private static native void jni_YGNodeSetOwner(long nativePointer, long newOwnerNativePointer);
 
   private native long jni_YGNodeClone(long nativePointer, Object newNode);
 
@@ -197,7 +197,7 @@
 
       if (mChildren != null) {
         for (YogaNode child : mChildren) {
-          child.jni_YGNodeSetOwner(child.mNativePointer, 0);
+          YogaNode.jni_YGNodeSetOwner(child.mNativePointer, 0);
           child.mOwner = null;
         }
       }
@@ -232,14 +232,14 @@
     }
   }
 
-  private native void jni_YGNodeClearChildren(long nativePointer);
+  private static native void jni_YGNodeClearChildren(long nativePointer);
 
   private void clearChildren() {
     mChildren = null;
     jni_YGNodeClearChildren(mNativePointer);
   }
 
-  private native void jni_YGNodeRemoveChild(long nativePointer, long childPointer);
+  private static native void jni_YGNodeRemoveChild(long nativePointer, long childPointer);
   public YogaNode removeChildAt(int i) {
     if (mChildren == null) {
       throw new IllegalStateException(
@@ -275,7 +275,7 @@
     return mChildren == null ? -1 : mChildren.indexOf(child);
   }
 
-  private native void jni_YGNodeCalculateLayout(long nativePointer, float width, float height);
+  private static native void jni_YGNodeCalculateLayout(long nativePointer, float width, float height);
   public void calculateLayout(float width, float height) {
     jni_YGNodeCalculateLayout(mNativePointer, width, height);
   }
@@ -284,23 +284,23 @@
     return mHasNewLayout;
   }
 
-  private native void jni_YGNodeMarkDirty(long nativePointer);
+  private static native void jni_YGNodeMarkDirty(long nativePointer);
   public void dirty() {
     jni_YGNodeMarkDirty(mNativePointer);
   }
 
-  private native void jni_YGNodeMarkDirtyAndPropogateToDescendants(long nativePointer);
+  private static native void jni_YGNodeMarkDirtyAndPropogateToDescendants(long nativePointer);
 
   public void dirtyAllDescendants() {
     jni_YGNodeMarkDirtyAndPropogateToDescendants(mNativePointer);
   }
 
-  private native boolean jni_YGNodeIsDirty(long nativePointer);
+  private static native boolean jni_YGNodeIsDirty(long nativePointer);
   public boolean isDirty() {
     return jni_YGNodeIsDirty(mNativePointer);
   }
 
-  private native void jni_YGNodeCopyStyle(long dstNativePointer, long srcNativePointer);
+  private static native void jni_YGNodeCopyStyle(long dstNativePointer, long srcNativePointer);
   public void copyStyle(YogaNode srcNode) {
     jni_YGNodeCopyStyle(mNativePointer, srcNode.mNativePointer);
   }
@@ -309,147 +309,147 @@
     mHasNewLayout = false;
   }
 
-  private native int jni_YGNodeStyleGetDirection(long nativePointer);
+  private static native int jni_YGNodeStyleGetDirection(long nativePointer);
   public YogaDirection getStyleDirection() {
     return YogaDirection.fromInt(jni_YGNodeStyleGetDirection(mNativePointer));
   }
 
-  private native void jni_YGNodeStyleSetDirection(long nativePointer, int direction);
+  private static native void jni_YGNodeStyleSetDirection(long nativePointer, int direction);
   public void setDirection(YogaDirection direction) {
     jni_YGNodeStyleSetDirection(mNativePointer, direction.intValue());
   }
 
-  private native int jni_YGNodeStyleGetFlexDirection(long nativePointer);
+  private static native int jni_YGNodeStyleGetFlexDirection(long nativePointer);
   public YogaFlexDirection getFlexDirection() {
     return YogaFlexDirection.fromInt(jni_YGNodeStyleGetFlexDirection(mNativePointer));
   }
 
-  private native void jni_YGNodeStyleSetFlexDirection(long nativePointer, int flexDirection);
+  private static native void jni_YGNodeStyleSetFlexDirection(long nativePointer, int flexDirection);
   public void setFlexDirection(YogaFlexDirection flexDirection) {
     jni_YGNodeStyleSetFlexDirection(mNativePointer, flexDirection.intValue());
   }
 
-  private native int jni_YGNodeStyleGetJustifyContent(long nativePointer);
+  private static native int jni_YGNodeStyleGetJustifyContent(long nativePointer);
   public YogaJustify getJustifyContent() {
     return YogaJustify.fromInt(jni_YGNodeStyleGetJustifyContent(mNativePointer));
   }
 
-  private native void jni_YGNodeStyleSetJustifyContent(long nativePointer, int justifyContent);
+  private static native void jni_YGNodeStyleSetJustifyContent(long nativePointer, int justifyContent);
   public void setJustifyContent(YogaJustify justifyContent) {
     jni_YGNodeStyleSetJustifyContent(mNativePointer, justifyContent.intValue());
   }
 
-  private native int jni_YGNodeStyleGetAlignItems(long nativePointer);
+  private static native int jni_YGNodeStyleGetAlignItems(long nativePointer);
   public YogaAlign getAlignItems() {
     return YogaAlign.fromInt(jni_YGNodeStyleGetAlignItems(mNativePointer));
   }
 
-  private native void jni_YGNodeStyleSetAlignItems(long nativePointer, int alignItems);
+  private static native void jni_YGNodeStyleSetAlignItems(long nativePointer, int alignItems);
   public void setAlignItems(YogaAlign alignItems) {
     jni_YGNodeStyleSetAlignItems(mNativePointer, alignItems.intValue());
   }
 
-  private native int jni_YGNodeStyleGetAlignSelf(long nativePointer);
+  private static native int jni_YGNodeStyleGetAlignSelf(long nativePointer);
   public YogaAlign getAlignSelf() {
     return YogaAlign.fromInt(jni_YGNodeStyleGetAlignSelf(mNativePointer));
   }
 
-  private native void jni_YGNodeStyleSetAlignSelf(long nativePointer, int alignSelf);
+  private static native void jni_YGNodeStyleSetAlignSelf(long nativePointer, int alignSelf);
   public void setAlignSelf(YogaAlign alignSelf) {
     jni_YGNodeStyleSetAlignSelf(mNativePointer, alignSelf.intValue());
   }
 
-  private native int jni_YGNodeStyleGetAlignContent(long nativePointer);
+  private static native int jni_YGNodeStyleGetAlignContent(long nativePointer);
   public YogaAlign getAlignContent() {
     return YogaAlign.fromInt(jni_YGNodeStyleGetAlignContent(mNativePointer));
   }
 
-  private native void jni_YGNodeStyleSetAlignContent(long nativePointer, int alignContent);
+  private static native void jni_YGNodeStyleSetAlignContent(long nativePointer, int alignContent);
   public void setAlignContent(YogaAlign alignContent) {
     jni_YGNodeStyleSetAlignContent(mNativePointer, alignContent.intValue());
   }
 
-  private native int jni_YGNodeStyleGetPositionType(long nativePointer);
+  private static native int jni_YGNodeStyleGetPositionType(long nativePointer);
   public YogaPositionType getPositionType() {
     return YogaPositionType.fromInt(jni_YGNodeStyleGetPositionType(mNativePointer));
   }
 
-  private native void jni_YGNodeStyleSetPositionType(long nativePointer, int positionType);
+  private static native void jni_YGNodeStyleSetPositionType(long nativePointer, int positionType);
   public void setPositionType(YogaPositionType positionType) {
     jni_YGNodeStyleSetPositionType(mNativePointer, positionType.intValue());
   }
 
-  private native void jni_YGNodeStyleSetFlexWrap(long nativePointer, int wrapType);
+  private static native void jni_YGNodeStyleSetFlexWrap(long nativePointer, int wrapType);
   public void setWrap(YogaWrap flexWrap) {
     jni_YGNodeStyleSetFlexWrap(mNativePointer, flexWrap.intValue());
   }
 
-  private native int jni_YGNodeStyleGetOverflow(long nativePointer);
+  private static native int jni_YGNodeStyleGetOverflow(long nativePointer);
   public YogaOverflow getOverflow() {
     return YogaOverflow.fromInt(jni_YGNodeStyleGetOverflow(mNativePointer));
   }
 
-  private native void jni_YGNodeStyleSetOverflow(long nativePointer, int overflow);
+  private static native void jni_YGNodeStyleSetOverflow(long nativePointer, int overflow);
   public void setOverflow(YogaOverflow overflow) {
     jni_YGNodeStyleSetOverflow(mNativePointer, overflow.intValue());
   }
 
-  private native int jni_YGNodeStyleGetDisplay(long nativePointer);
+  private static native int jni_YGNodeStyleGetDisplay(long nativePointer);
   public YogaDisplay getDisplay() {
     return YogaDisplay.fromInt(jni_YGNodeStyleGetDisplay(mNativePointer));
   }
 
-  private native void jni_YGNodeStyleSetDisplay(long nativePointer, int display);
+  private static native void jni_YGNodeStyleSetDisplay(long nativePointer, int display);
   public void setDisplay(YogaDisplay display) {
     jni_YGNodeStyleSetDisplay(mNativePointer, display.intValue());
   }
 
-  private native void jni_YGNodeStyleSetFlex(long nativePointer, float flex);
+  private static native void jni_YGNodeStyleSetFlex(long nativePointer, float flex);
   public void setFlex(float flex) {
     jni_YGNodeStyleSetFlex(mNativePointer, flex);
   }
 
-  private native float jni_YGNodeStyleGetFlexGrow(long nativePointer);
+  private static native float jni_YGNodeStyleGetFlexGrow(long nativePointer);
   public float getFlexGrow() {
     return jni_YGNodeStyleGetFlexGrow(mNativePointer);
   }
 
-  private native void jni_YGNodeStyleSetFlexGrow(long nativePointer, float flexGrow);
+  private static native void jni_YGNodeStyleSetFlexGrow(long nativePointer, float flexGrow);
   public void setFlexGrow(float flexGrow) {
     jni_YGNodeStyleSetFlexGrow(mNativePointer, flexGrow);
   }
 
-  private native float jni_YGNodeStyleGetFlexShrink(long nativePointer);
+  private static native float jni_YGNodeStyleGetFlexShrink(long nativePointer);
   public float getFlexShrink() {
     return jni_YGNodeStyleGetFlexShrink(mNativePointer);
   }
 
-  private native void jni_YGNodeStyleSetFlexShrink(long nativePointer, float flexShrink);
+  private static native void jni_YGNodeStyleSetFlexShrink(long nativePointer, float flexShrink);
   public void setFlexShrink(float flexShrink) {
     jni_YGNodeStyleSetFlexShrink(mNativePointer, flexShrink);
   }
 
-  private native Object jni_YGNodeStyleGetFlexBasis(long nativePointer);
+  private static native Object jni_YGNodeStyleGetFlexBasis(long nativePointer);
   public YogaValue getFlexBasis() {
     return (YogaValue) jni_YGNodeStyleGetFlexBasis(mNativePointer);
   }
 
-  private native void jni_YGNodeStyleSetFlexBasis(long nativePointer, float flexBasis);
+  private static native void jni_YGNodeStyleSetFlexBasis(long nativePointer, float flexBasis);
   public void setFlexBasis(float flexBasis) {
     jni_YGNodeStyleSetFlexBasis(mNativePointer, flexBasis);
   }
 
-  private native void jni_YGNodeStyleSetFlexBasisPercent(long nativePointer, float percent);
+  private static native void jni_YGNodeStyleSetFlexBasisPercent(long nativePointer, float percent);
   public void setFlexBasisPercent(float percent) {
     jni_YGNodeStyleSetFlexBasisPercent(mNativePointer, percent);
   }
 
-  private native void jni_YGNodeStyleSetFlexBasisAuto(long nativePointer);
+  private static native void jni_YGNodeStyleSetFlexBasisAuto(long nativePointer);
   public void setFlexBasisAuto() {
     jni_YGNodeStyleSetFlexBasisAuto(mNativePointer);
   }
 
-  private native Object jni_YGNodeStyleGetMargin(long nativePointer, int edge);
+  private static native Object jni_YGNodeStyleGetMargin(long nativePointer, int edge);
   public YogaValue getMargin(YogaEdge edge) {
     if (!((mEdgeSetFlag & MARGIN) == MARGIN)) {
       return YogaValue.UNDEFINED;
@@ -457,25 +457,25 @@
     return (YogaValue) jni_YGNodeStyleGetMargin(mNativePointer, edge.intValue());
   }
 
-  private native void jni_YGNodeStyleSetMargin(long nativePointer, int edge, float margin);
+  private static native void jni_YGNodeStyleSetMargin(long nativePointer, int edge, float margin);
   public void setMargin(YogaEdge edge, float margin) {
     mEdgeSetFlag |= MARGIN;
     jni_YGNodeStyleSetMargin(mNativePointer, edge.intValue(), margin);
   }
 
-  private native void jni_YGNodeStyleSetMarginPercent(long nativePointer, int edge, float percent);
+  private static native void jni_YGNodeStyleSetMarginPercent(long nativePointer, int edge, float percent);
   public void setMarginPercent(YogaEdge edge, float percent) {
     mEdgeSetFlag |= MARGIN;
     jni_YGNodeStyleSetMarginPercent(mNativePointer, edge.intValue(), percent);
   }
 
-  private native void jni_YGNodeStyleSetMarginAuto(long nativePointer, int edge);
+  private static native void jni_YGNodeStyleSetMarginAuto(long nativePointer, int edge);
   public void setMarginAuto(YogaEdge edge) {
     mEdgeSetFlag |= MARGIN;
     jni_YGNodeStyleSetMarginAuto(mNativePointer, edge.intValue());
   }
 
-  private native Object jni_YGNodeStyleGetPadding(long nativePointer, int edge);
+  private static native Object jni_YGNodeStyleGetPadding(long nativePointer, int edge);
   public YogaValue getPadding(YogaEdge edge) {
     if (!((mEdgeSetFlag & PADDING) == PADDING)) {
       return YogaValue.UNDEFINED;
@@ -483,19 +483,19 @@
     return (YogaValue) jni_YGNodeStyleGetPadding(mNativePointer, edge.intValue());
   }
 
-  private native void jni_YGNodeStyleSetPadding(long nativePointer, int edge, float padding);
+  private static native void jni_YGNodeStyleSetPadding(long nativePointer, int edge, float padding);
   public void setPadding(YogaEdge edge, float padding) {
     mEdgeSetFlag |= PADDING;
     jni_YGNodeStyleSetPadding(mNativePointer, edge.intValue(), padding);
   }
 
-  private native void jni_YGNodeStyleSetPaddingPercent(long nativePointer, int edge, float percent);
+  private static native void jni_YGNodeStyleSetPaddingPercent(long nativePointer, int edge, float percent);
   public void setPaddingPercent(YogaEdge edge, float percent) {
     mEdgeSetFlag |= PADDING;
     jni_YGNodeStyleSetPaddingPercent(mNativePointer, edge.intValue(), percent);
   }
 
-  private native float jni_YGNodeStyleGetBorder(long nativePointer, int edge);
+  private static native float jni_YGNodeStyleGetBorder(long nativePointer, int edge);
   public float getBorder(YogaEdge edge) {
     if (!((mEdgeSetFlag & BORDER) == BORDER)) {
       return YogaConstants.UNDEFINED;
@@ -503,13 +503,13 @@
     return jni_YGNodeStyleGetBorder(mNativePointer, edge.intValue());
   }
 
-  private native void jni_YGNodeStyleSetBorder(long nativePointer, int edge, float border);
+  private static native void jni_YGNodeStyleSetBorder(long nativePointer, int edge, float border);
   public void setBorder(YogaEdge edge, float border) {
     mEdgeSetFlag |= BORDER;
     jni_YGNodeStyleSetBorder(mNativePointer, edge.intValue(), border);
   }
 
-  private native Object jni_YGNodeStyleGetPosition(long nativePointer, int edge);
+  private static native Object jni_YGNodeStyleGetPosition(long nativePointer, int edge);
   public YogaValue getPosition(YogaEdge edge) {
     if (!mHasSetPosition) {
       return YogaValue.UNDEFINED;
@@ -517,124 +517,124 @@
     return (YogaValue) jni_YGNodeStyleGetPosition(mNativePointer, edge.intValue());
   }
 
-  private native void jni_YGNodeStyleSetPosition(long nativePointer, int edge, float position);
+  private static native void jni_YGNodeStyleSetPosition(long nativePointer, int edge, float position);
   public void setPosition(YogaEdge edge, float position) {
     mHasSetPosition = true;
     jni_YGNodeStyleSetPosition(mNativePointer, edge.intValue(), position);
   }
 
-  private native void jni_YGNodeStyleSetPositionPercent(long nativePointer, int edge, float percent);
+  private static native void jni_YGNodeStyleSetPositionPercent(long nativePointer, int edge, float percent);
   public void setPositionPercent(YogaEdge edge, float percent) {
     mHasSetPosition = true;
     jni_YGNodeStyleSetPositionPercent(mNativePointer, edge.intValue(), percent);
   }
 
-  private native Object jni_YGNodeStyleGetWidth(long nativePointer);
+  private static native Object jni_YGNodeStyleGetWidth(long nativePointer);
   public YogaValue getWidth() {
     return (YogaValue) jni_YGNodeStyleGetWidth(mNativePointer);
   }
 
-  private native void jni_YGNodeStyleSetWidth(long nativePointer, float width);
+  private static native void jni_YGNodeStyleSetWidth(long nativePointer, float width);
   public void setWidth(float width) {
     jni_YGNodeStyleSetWidth(mNativePointer, width);
   }
 
-  private native void jni_YGNodeStyleSetWidthPercent(long nativePointer, float percent);
+  private static native void jni_YGNodeStyleSetWidthPercent(long nativePointer, float percent);
   public void setWidthPercent(float percent) {
     jni_YGNodeStyleSetWidthPercent(mNativePointer, percent);
   }
 
-  private native void jni_YGNodeStyleSetWidthAuto(long nativePointer);
+  private static native void jni_YGNodeStyleSetWidthAuto(long nativePointer);
   public void setWidthAuto() {
     jni_YGNodeStyleSetWidthAuto(mNativePointer);
   }
 
-  private native Object jni_YGNodeStyleGetHeight(long nativePointer);
+  private static native Object jni_YGNodeStyleGetHeight(long nativePointer);
   public YogaValue getHeight() {
     return (YogaValue) jni_YGNodeStyleGetHeight(mNativePointer);
   }
 
-  private native void jni_YGNodeStyleSetHeight(long nativePointer, float height);
+  private static native void jni_YGNodeStyleSetHeight(long nativePointer, float height);
   public void setHeight(float height) {
     jni_YGNodeStyleSetHeight(mNativePointer, height);
   }
 
-  private native void jni_YGNodeStyleSetHeightPercent(long nativePointer, float percent);
+  private static native void jni_YGNodeStyleSetHeightPercent(long nativePointer, float percent);
   public void setHeightPercent(float percent) {
     jni_YGNodeStyleSetHeightPercent(mNativePointer, percent);
   }
 
-  private native void jni_YGNodeStyleSetHeightAuto(long nativePointer);
+  private static native void jni_YGNodeStyleSetHeightAuto(long nativePointer);
   public void setHeightAuto() {
     jni_YGNodeStyleSetHeightAuto(mNativePointer);
   }
 
-  private native Object jni_YGNodeStyleGetMinWidth(long nativePointer);
+  private static native Object jni_YGNodeStyleGetMinWidth(long nativePointer);
   public YogaValue getMinWidth() {
     return (YogaValue) jni_YGNodeStyleGetMinWidth(mNativePointer);
   }
 
-  private native void jni_YGNodeStyleSetMinWidth(long nativePointer, float minWidth);
+  private static native void jni_YGNodeStyleSetMinWidth(long nativePointer, float minWidth);
   public void setMinWidth(float minWidth) {
     jni_YGNodeStyleSetMinWidth(mNativePointer, minWidth);
   }
 
-  private native void jni_YGNodeStyleSetMinWidthPercent(long nativePointer, float percent);
+  private static native void jni_YGNodeStyleSetMinWidthPercent(long nativePointer, float percent);
   public void setMinWidthPercent(float percent) {
     jni_YGNodeStyleSetMinWidthPercent(mNativePointer, percent);
   }
 
-  private native Object jni_YGNodeStyleGetMinHeight(long nativePointer);
+  private static native Object jni_YGNodeStyleGetMinHeight(long nativePointer);
   public YogaValue getMinHeight() {
     return (YogaValue) jni_YGNodeStyleGetMinHeight(mNativePointer);
   }
 
-  private native void jni_YGNodeStyleSetMinHeight(long nativePointer, float minHeight);
+  private static native void jni_YGNodeStyleSetMinHeight(long nativePointer, float minHeight);
   public void setMinHeight(float minHeight) {
     jni_YGNodeStyleSetMinHeight(mNativePointer, minHeight);
   }
 
-  private native void jni_YGNodeStyleSetMinHeightPercent(long nativePointer, float percent);
+  private static native void jni_YGNodeStyleSetMinHeightPercent(long nativePointer, float percent);
   public void setMinHeightPercent(float percent) {
     jni_YGNodeStyleSetMinHeightPercent(mNativePointer, percent);
   }
 
-  private native Object jni_YGNodeStyleGetMaxWidth(long nativePointer);
+  private static native Object jni_YGNodeStyleGetMaxWidth(long nativePointer);
   public YogaValue getMaxWidth() {
     return (YogaValue) jni_YGNodeStyleGetMaxWidth(mNativePointer);
   }
 
-  private native void jni_YGNodeStyleSetMaxWidth(long nativePointer, float maxWidth);
+  private static native void jni_YGNodeStyleSetMaxWidth(long nativePointer, float maxWidth);
   public void setMaxWidth(float maxWidth) {
     jni_YGNodeStyleSetMaxWidth(mNativePointer, maxWidth);
   }
 
-  private native void jni_YGNodeStyleSetMaxWidthPercent(long nativePointer, float percent);
+  private static native void jni_YGNodeStyleSetMaxWidthPercent(long nativePointer, float percent);
   public void setMaxWidthPercent(float percent) {
     jni_YGNodeStyleSetMaxWidthPercent(mNativePointer, percent);
   }
 
-  private native Object jni_YGNodeStyleGetMaxHeight(long nativePointer);
+  private static native Object jni_YGNodeStyleGetMaxHeight(long nativePointer);
   public YogaValue getMaxHeight() {
     return (YogaValue) jni_YGNodeStyleGetMaxHeight(mNativePointer);
   }
 
-  private native void jni_YGNodeStyleSetMaxHeight(long nativePointer, float maxheight);
+  private static native void jni_YGNodeStyleSetMaxHeight(long nativePointer, float maxheight);
   public void setMaxHeight(float maxheight) {
     jni_YGNodeStyleSetMaxHeight(mNativePointer, maxheight);
   }
 
-  private native void jni_YGNodeStyleSetMaxHeightPercent(long nativePointer, float percent);
+  private static native void jni_YGNodeStyleSetMaxHeightPercent(long nativePointer, float percent);
   public void setMaxHeightPercent(float percent) {
     jni_YGNodeStyleSetMaxHeightPercent(mNativePointer, percent);
   }
 
-  private native float jni_YGNodeStyleGetAspectRatio(long nativePointer);
+  private static native float jni_YGNodeStyleGetAspectRatio(long nativePointer);
   public float getAspectRatio() {
     return jni_YGNodeStyleGetAspectRatio(mNativePointer);
   }
 
-  private native void jni_YGNodeStyleSetAspectRatio(long nativePointer, float aspectRatio);
+  private static native void jni_YGNodeStyleSetAspectRatio(long nativePointer, float aspectRatio);
   public void setAspectRatio(float aspectRatio) {
     jni_YGNodeStyleSetAspectRatio(mNativePointer, aspectRatio);
   }
@@ -720,7 +720,7 @@
     return YogaDirection.fromInt(mLayoutDirection);
   }
 
-  private native void jni_YGNodeSetHasMeasureFunc(long nativePointer, boolean hasMeasureFunc);
+  private static native void jni_YGNodeSetHasMeasureFunc(long nativePointer, boolean hasMeasureFunc);
   public void setMeasureFunction(YogaMeasureFunction measureFunction) {
     mMeasureFunction = measureFunction;
     jni_YGNodeSetHasMeasureFunc(mNativePointer, measureFunction != null);
@@ -745,7 +745,7 @@
         YogaMeasureMode.fromInt(heightMode));
   }
 
-  private native void jni_YGNodeSetHasBaselineFunc(long nativePointer, boolean hasMeasureFunc);
+  private static native void jni_YGNodeSetHasBaselineFunc(long nativePointer, boolean hasMeasureFunc);
   public void setBaselineFunction(YogaBaselineFunction baselineFunction) {
     mBaselineFunction = baselineFunction;
     jni_YGNodeSetHasBaselineFunc(mNativePointer, baselineFunction != null);
@@ -768,7 +768,7 @@
     return mData;
   }
 
-  private native void jni_YGNodePrint(long nativePointer);
+  private static native void jni_YGNodePrint(long nativePointer);
 
   /**
    * Use the set logger (defaults to adb log) to print out the styles, children, and computed
