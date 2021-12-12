diff --git a/litho-widget/src/main/java/com/facebook/litho/widget/TextSpec.java b/litho-widget/src/main/java/com/facebook/litho/widget/TextSpec.java
index e345489..8f30468 100644
--- a/litho-widget/src/main/java/com/facebook/litho/widget/TextSpec.java
+++ b/litho-widget/src/main/java/com/facebook/litho/widget/TextSpec.java
@@ -282,9 +282,9 @@
       } else if (attr == R.styleable.Text_android_maxEms) {
         maxEms.set(a.getInteger(attr, DEFAULT_EMS));
       } else if (attr == R.styleable.Text_android_minWidth) {
-        minWidth.set(a.getInteger(attr, DEFAULT_MIN_WIDTH));
+        minWidth.set(a.getDimensionPixelSize(attr, DEFAULT_MIN_WIDTH));
       } else if (attr == R.styleable.Text_android_maxWidth) {
-        maxWidth.set(a.getInteger(attr, DEFAULT_MAX_WIDTH));
+        maxWidth.set(a.getDimensionPixelSize(attr, DEFAULT_MAX_WIDTH));
       }
     }
   }
@@ -303,8 +303,8 @@
       @Prop(optional = true, resType = ResType.INT) int maxLines,
       @Prop(optional = true, resType = ResType.INT) int minEms,
       @Prop(optional = true, resType = ResType.INT) int maxEms,
-      @Prop(optional = true, resType = ResType.INT) int minWidth,
-      @Prop(optional = true, resType = ResType.INT) int maxWidth,
+      @Prop(optional = true, resType = ResType.DIMEN_SIZE) int minWidth,
+      @Prop(optional = true, resType = ResType.DIMEN_SIZE) int maxWidth,
       @Prop(optional = true, resType = ResType.DIMEN_OFFSET) float shadowRadius,
       @Prop(optional = true, resType = ResType.DIMEN_OFFSET) float shadowDx,
       @Prop(optional = true, resType = ResType.DIMEN_OFFSET) float shadowDy,
@@ -515,8 +515,8 @@
       @Prop(optional = true, resType = ResType.INT) int maxLines,
       @Prop(optional = true, resType = ResType.INT) int minEms,
       @Prop(optional = true, resType = ResType.INT) int maxEms,
-      @Prop(optional = true, resType = ResType.INT) int minWidth,
-      @Prop(optional = true, resType = ResType.INT) int maxWidth,
+      @Prop(optional = true, resType = ResType.DIMEN_SIZE) int minWidth,
+      @Prop(optional = true, resType = ResType.DIMEN_SIZE) int maxWidth,
       @Prop(optional = true, resType = ResType.DIMEN_OFFSET) float shadowRadius,
       @Prop(optional = true, resType = ResType.DIMEN_OFFSET) float shadowDx,
       @Prop(optional = true, resType = ResType.DIMEN_OFFSET) float shadowDy,
