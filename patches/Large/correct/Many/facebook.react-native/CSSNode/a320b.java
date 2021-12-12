diff --git a/ReactAndroid/src/main/java/com/facebook/csslayout/CSSNode.java b/ReactAndroid/src/main/java/com/facebook/csslayout/CSSNode.java
index b928c21..6d5d61b 100644
--- a/ReactAndroid/src/main/java/com/facebook/csslayout/CSSNode.java
+++ b/ReactAndroid/src/main/java/com/facebook/csslayout/CSSNode.java
@@ -494,8 +494,13 @@
     jni_CSSNodeSetHasMeasureFunc(mNativePointer, measureFunction != null);
   }
 
+  // Implementation Note: Why this method needs to stay final
+  //
+  // We cache the jmethodid for this method in CSSLayout code. This means that even if a subclass
+  // were to override measure, we'd still call this implementation from layout code since the
+  // overriding method will have a different jmethodid. This is final to prevent that mistake.
   @DoNotStrip
-  public long measure(float width, int widthMode, float height, int heightMode) {
+  public final long measure(float width, int widthMode, float height, int heightMode) {
     if (!isMeasureDefined()) {
       throw new RuntimeException("Measure function isn't defined!");
     }
