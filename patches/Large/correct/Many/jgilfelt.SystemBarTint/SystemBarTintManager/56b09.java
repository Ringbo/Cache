diff --git a/library/src/com/readystatesoftware/systembartint/SystemBarTintManager.java b/library/src/com/readystatesoftware/systembartint/SystemBarTintManager.java
index 66e8087..57697c0 100644
--- a/library/src/com/readystatesoftware/systembartint/SystemBarTintManager.java
+++ b/library/src/com/readystatesoftware/systembartint/SystemBarTintManager.java
@@ -397,7 +397,7 @@
 		 * @return True if navigation should appear at the bottom of the screen, False otherwise.
 		 */
 		public boolean isNavigationAtBottom() {
-			return (mSmallestWidthDp > 600 || mInPortrait);
+			return (mSmallestWidthDp >= 600 || mInPortrait);
 		}
 
 		/**
