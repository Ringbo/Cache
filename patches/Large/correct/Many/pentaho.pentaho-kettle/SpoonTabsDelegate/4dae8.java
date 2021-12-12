diff --git a/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonTabsDelegate.java b/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonTabsDelegate.java
index f098565..ac26856 100644
--- a/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonTabsDelegate.java
+++ b/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonTabsDelegate.java
@@ -215,7 +215,7 @@
 			if (tabMapEntry == null)
 			{
 				CTabFolder cTabFolder = tabfolder.getSwtTabset();
-				SpoonBrowser browser = new SpoonBrowser(cTabFolder, spoon, urlString, isURL, false, listener);
+				SpoonBrowser browser = new SpoonBrowser(cTabFolder, spoon, urlString, isURL, true, listener);
 				TabItem tabItem = new TabItem(tabfolder, name, name);
 				tabItem.setImage(GUIResource.getInstance().getImageLogoSmall());
 				tabItem.setControl(browser.getComposite());
