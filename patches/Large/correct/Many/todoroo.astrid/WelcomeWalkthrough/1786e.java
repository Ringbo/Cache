diff --git a/astrid/src/com/todoroo/astrid/welcome/tutorial/WelcomeWalkthrough.java b/astrid/src/com/todoroo/astrid/welcome/tutorial/WelcomeWalkthrough.java
index 7593ed5..3acd33d 100644
--- a/astrid/src/com/todoroo/astrid/welcome/tutorial/WelcomeWalkthrough.java
+++ b/astrid/src/com/todoroo/astrid/welcome/tutorial/WelcomeWalkthrough.java
@@ -23,7 +23,7 @@
 
 public class WelcomeWalkthrough extends ActFmLoginActivity {
     private ViewPager mPager;
-    private ViewPagerAdapter mAdapter;
+    private WelcomePagerAdapter mAdapter;
     private PageIndicator mIndicator;
     private View currentView;
     private int currentPage;
@@ -37,7 +37,7 @@
         requestWindowFeature(Window.FEATURE_NO_TITLE);
         super.onCreate(savedInstanceState);
 
-        mAdapter = new ViewPagerAdapter(this, getIntent().hasExtra(TOKEN_MANUAL_SHOW));
+        mAdapter = new WelcomePagerAdapter(this, getIntent().hasExtra(TOKEN_MANUAL_SHOW));
         mAdapter.parent = this;
 
         mPager = (ViewPager)findViewById(R.id.pager);
