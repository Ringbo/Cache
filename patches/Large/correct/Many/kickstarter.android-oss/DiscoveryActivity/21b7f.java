diff --git a/app/src/main/java/com/kickstarter/ui/activities/DiscoveryActivity.java b/app/src/main/java/com/kickstarter/ui/activities/DiscoveryActivity.java
index 41e0cb1..a7622b5 100644
--- a/app/src/main/java/com/kickstarter/ui/activities/DiscoveryActivity.java
+++ b/app/src/main/java/com/kickstarter/ui/activities/DiscoveryActivity.java
@@ -60,7 +60,7 @@
 
   protected @BindString(R.string.A_newer_build_is_available) String aNewerBuildIsAvailableString;
   protected @BindString(R.string.Upgrade_app) String upgradeAppString;
-  protected @BindString(R.string.Home) String homeString;
+  protected @BindString(R.string.discovery_sort_types_magic) String magicString;
   protected @BindString(R.string.Popular) String popularString;
   protected @BindString(R.string.discovery_sort_types_newest) String newestString;
   protected @BindString(R.string.Ending_soon) String endingSoonString;
@@ -80,7 +80,7 @@
     this.drawerRecyclerView.setAdapter(this.drawerAdapter);
 
     final List<String> viewPagerTitles = Arrays.asList(
-      this.homeString, this.popularString, this.newestString, this.endingSoonString, this.mostFundedString
+      this.magicString, this.popularString, this.newestString, this.endingSoonString, this.mostFundedString
     );
 
     this.pagerAdapter = new DiscoveryPagerAdapter(
