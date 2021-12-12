diff --git a/src/de/danoeh/antennapod/activity/FeedItemlistActivity.java b/src/de/danoeh/antennapod/activity/FeedItemlistActivity.java
index 52142d4..1be29dd 100644
--- a/src/de/danoeh/antennapod/activity/FeedItemlistActivity.java
+++ b/src/de/danoeh/antennapod/activity/FeedItemlistActivity.java
@@ -63,7 +63,7 @@
 		FragmentTransaction fT = fragmentManager.beginTransaction();
 
 		filf = ItemlistFragment.newInstance(feed.getId());
-		fT.add(R.id.feeditemlistFragment, filf);
+		fT.replace(R.id.feeditemlistFragment, filf);
 
 		externalPlayerFragment = new ExternalPlayerFragment();
 		fT.replace(R.id.playerFragment, externalPlayerFragment);
