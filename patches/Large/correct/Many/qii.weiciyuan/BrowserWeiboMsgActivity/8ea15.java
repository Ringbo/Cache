diff --git a/src/org/qii/weiciyuan/ui/browser/BrowserWeiboMsgActivity.java b/src/org/qii/weiciyuan/ui/browser/BrowserWeiboMsgActivity.java
index 314e1fa..c9455f4 100644
--- a/src/org/qii/weiciyuan/ui/browser/BrowserWeiboMsgActivity.java
+++ b/src/org/qii/weiciyuan/ui/browser/BrowserWeiboMsgActivity.java
@@ -54,7 +54,7 @@
     private void buildViewPager() {
         mViewPager = (ViewPager) findViewById(R.id.viewpager);
         adapter = new TimeLinePagerAdapter(getSupportFragmentManager());
-        mViewPager.setOffscreenPageLimit(2);
+        mViewPager.setOffscreenPageLimit(3);
         mViewPager.setAdapter(adapter);
         mViewPager.setOnPageChangeListener(onPageChangeListener);
 
