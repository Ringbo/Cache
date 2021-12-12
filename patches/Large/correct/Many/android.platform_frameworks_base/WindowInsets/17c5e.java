diff --git a/core/java/android/view/WindowInsets.java b/core/java/android/view/WindowInsets.java
index 2160efe..294f472 100644
--- a/core/java/android/view/WindowInsets.java
+++ b/core/java/android/view/WindowInsets.java
@@ -29,7 +29,7 @@
  * @see View.OnApplyWindowInsetsListener
  * @see View#onApplyWindowInsets(WindowInsets)
  */
-public class WindowInsets {
+public final class WindowInsets {
     private Rect mSystemWindowInsets;
     private Rect mWindowDecorInsets;
     private Rect mTempRect;
@@ -151,6 +151,7 @@
      * This can include action bars, title bars, toolbars, etc.</p>
      *
      * @return The left window decor inset
+     * @hide pending API
      */
     public int getWindowDecorInsetLeft() {
         return mWindowDecorInsets.left;
@@ -164,6 +165,7 @@
      * This can include action bars, title bars, toolbars, etc.</p>
      *
      * @return The top window decor inset
+     * @hide pending API
      */
     public int getWindowDecorInsetTop() {
         return mWindowDecorInsets.top;
@@ -177,6 +179,7 @@
      * This can include action bars, title bars, toolbars, etc.</p>
      *
      * @return The right window decor inset
+     * @hide pending API
      */
     public int getWindowDecorInsetRight() {
         return mWindowDecorInsets.right;
@@ -190,6 +193,7 @@
      * This can include action bars, title bars, toolbars, etc.</p>
      *
      * @return The bottom window decor inset
+     * @hide pending API
      */
     public int getWindowDecorInsetBottom() {
         return mWindowDecorInsets.bottom;
@@ -217,6 +221,7 @@
      * This can include action bars, title bars, toolbars, etc.</p>
      *
      * @return true if any of the window decor inset values are nonzero
+     * @hide pending API
      */
     public boolean hasWindowDecorInsets() {
         return mWindowDecorInsets.left != 0 || mWindowDecorInsets.top != 0 ||
@@ -246,13 +251,28 @@
         return mIsRound;
     }
 
-    public WindowInsets cloneWithSystemWindowInsetsConsumed() {
+    /**
+     * Returns a copy of this WindowInsets with the system window insets fully consumed.
+     *
+     * @return A modified copy of this WindowInsets
+     */
+    public WindowInsets consumeSystemWindowInsets() {
         final WindowInsets result = new WindowInsets(this);
         result.mSystemWindowInsets = new Rect(0, 0, 0, 0);
         return result;
     }
 
-    public WindowInsets cloneWithSystemWindowInsetsConsumed(boolean left, boolean top,
+    /**
+     * Returns a copy of this WindowInsets with selected system window insets fully consumed.
+     *
+     * @param left true to consume the left system window inset
+     * @param top true to consume the top system window inset
+     * @param right true to consume the right system window inset
+     * @param bottom true to consume the bottom system window inset
+     * @return A modified copy of this WindowInsets
+     * @hide pending API
+     */
+    public WindowInsets consumeSystemWindowInsets(boolean left, boolean top,
             boolean right, boolean bottom) {
         if (left || top || right || bottom) {
             final WindowInsets result = new WindowInsets(this);
@@ -265,19 +285,36 @@
         return this;
     }
 
-    public WindowInsets cloneWithSystemWindowInsets(int left, int top, int right, int bottom) {
+    /**
+     * Returns a copy of this WindowInsets with selected system window insets replaced
+     * with new values.
+     *
+     * @param left New left inset in pixels
+     * @param top New top inset in pixels
+     * @param right New right inset in pixels
+     * @param bottom New bottom inset in pixels
+     * @return A modified copy of this WindowInsets
+     */
+    public WindowInsets replaceSystemWindowInsets(int left, int top,
+            int right, int bottom) {
         final WindowInsets result = new WindowInsets(this);
         result.mSystemWindowInsets = new Rect(left, top, right, bottom);
         return result;
     }
 
-    public WindowInsets cloneWithWindowDecorInsetsConsumed() {
+    /**
+     * @hide
+     */
+    public WindowInsets consumeWindowDecorInsets() {
         final WindowInsets result = new WindowInsets(this);
         result.mWindowDecorInsets.set(0, 0, 0, 0);
         return result;
     }
 
-    public WindowInsets cloneWithWindowDecorInsetsConsumed(boolean left, boolean top,
+    /**
+     * @hide
+     */
+    public WindowInsets consumeWindowDecorInsets(boolean left, boolean top,
             boolean right, boolean bottom) {
         if (left || top || right || bottom) {
             final WindowInsets result = new WindowInsets(this);
@@ -290,7 +327,10 @@
         return this;
     }
 
-    public WindowInsets cloneWithWindowDecorInsets(int left, int top, int right, int bottom) {
+    /**
+     * @hide
+     */
+    public WindowInsets replaceWindowDecorInsets(int left, int top, int right, int bottom) {
         final WindowInsets result = new WindowInsets(this);
         result.mWindowDecorInsets = new Rect(left, top, right, bottom);
         return result;
