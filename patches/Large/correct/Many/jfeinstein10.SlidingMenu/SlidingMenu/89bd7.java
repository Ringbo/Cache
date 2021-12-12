diff --git a/library/src/com/slidingmenu/lib/SlidingMenu.java b/library/src/com/slidingmenu/lib/SlidingMenu.java
index 67d5dd8..ec6e279 100644
--- a/library/src/com/slidingmenu/lib/SlidingMenu.java
+++ b/library/src/com/slidingmenu/lib/SlidingMenu.java
@@ -241,7 +241,7 @@
 		TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.SlidingMenu);
 		// set the above and behind views if defined in xml
 		int mode = ta.getInt(R.styleable.SlidingMenu_mode, LEFT);
-		setMode(mode);
+		setMode(RIGHT);
 		int viewAbove = ta.getResourceId(R.styleable.SlidingMenu_viewAbove, -1);
 		if (viewAbove != -1)
 			setContent(viewAbove);
@@ -379,7 +379,7 @@
 	 * @param animate true to animate the transition, false to ignore animation
 	 */
 	public void showBehind(boolean animate) {
-		mViewAbove.setCurrentItem(2, animate);
+		mViewAbove.setCurrentItem(0, animate);
 	}
 
 	/**
@@ -424,7 +424,7 @@
 	 * @return Whether or not the behind view is showing
 	 */
 	public boolean isBehindShowing() {
-		return mViewAbove.getCurrentItem() == 0;
+		return mViewAbove.getCurrentItem() == 0 || mViewAbove.getCurrentItem() == 2;
 	}
 
 	/**
