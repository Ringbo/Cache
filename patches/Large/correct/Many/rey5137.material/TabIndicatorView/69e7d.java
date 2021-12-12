diff --git a/lib/src/main/java/com/rey/material/widget/TabIndicatorView.java b/lib/src/main/java/com/rey/material/widget/TabIndicatorView.java
index f57f7c9..c330df2 100644
--- a/lib/src/main/java/com/rey/material/widget/TabIndicatorView.java
+++ b/lib/src/main/java/com/rey/material/widget/TabIndicatorView.java
@@ -355,17 +355,17 @@
 
         private TabIndicatorView mView;
 
-        abstract int getTabCount();
+        public abstract int getTabCount();
 
-        abstract boolean isIconTab(int position);
+        public abstract boolean isIconTab(int position);
 
-        abstract Drawable getIcon(int position);
+        public abstract Drawable getIcon(int position);
 
-        abstract CharSequence getText(int position);
+        public abstract CharSequence getText(int position);
 
-        abstract void setCurrentTab(int position);
+        public abstract void setCurrentTab(int position);
 
-        abstract int getCurrentTab();
+        public abstract int getCurrentTab();
 
         protected void setTabIndicatorView(TabIndicatorView view){
             mView = view;
@@ -568,32 +568,32 @@
         }
 
         @Override
-        int getTabCount() {
+        public int getTabCount() {
             return mViewPager.getAdapter().getCount();
         }
 
         @Override
-        boolean isIconTab(int position) {
+        public boolean isIconTab(int position) {
             return false;
         }
 
         @Override
-        Drawable getIcon(int position) {
+        public Drawable getIcon(int position) {
             return null;
         }
 
         @Override
-        CharSequence getText(int position) {
+        public CharSequence getText(int position) {
             return mViewPager.getAdapter().getPageTitle(position);
         }
 
         @Override
-        void setCurrentTab(int position) {
+        public void setCurrentTab(int position) {
             mViewPager.setCurrentItem(position, true);
         }
 
         @Override
-        int getCurrentTab() {
+        public int getCurrentTab() {
             return mViewPager.getCurrentItem();
         }
 
