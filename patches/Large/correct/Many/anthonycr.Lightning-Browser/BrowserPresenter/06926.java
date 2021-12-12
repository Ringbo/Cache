diff --git a/app/src/main/java/acr/browser/lightning/browser/BrowserPresenter.java b/app/src/main/java/acr/browser/lightning/browser/BrowserPresenter.java
index 8aa1e5b..5ccfa72 100644
--- a/app/src/main/java/acr/browser/lightning/browser/BrowserPresenter.java
+++ b/app/src/main/java/acr/browser/lightning/browser/BrowserPresenter.java
@@ -165,7 +165,7 @@
         boolean shouldClose = mShouldClose && isShown && tabToDelete.isNewTab();
         final LightningView currentTab = mTabsModel.getCurrentTab();
         if (mTabsModel.size() == 1 && currentTab != null &&
-            (UrlUtils.isSpecialUrl(currentTab.getUrl()) ||
+            (UrlUtils.isStartPageUrl(currentTab.getUrl()) ||
                 currentTab.getUrl().equals(mPreferences.getHomepage()))) {
             mView.closeActivity();
             return;
