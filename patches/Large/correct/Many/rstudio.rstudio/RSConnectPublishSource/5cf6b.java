diff --git a/src/gwt/src/org/rstudio/studio/client/rsconnect/model/RSConnectPublishSource.java b/src/gwt/src/org/rstudio/studio/client/rsconnect/model/RSConnectPublishSource.java
index ca37d25..4bf93f0 100644
--- a/src/gwt/src/org/rstudio/studio/client/rsconnect/model/RSConnectPublishSource.java
+++ b/src/gwt/src/org/rstudio/studio/client/rsconnect/model/RSConnectPublishSource.java
@@ -105,7 +105,7 @@
       isShiny_ = isShiny;
       isSingleFileShiny_ = false;
       description_ = description;
-      contentCategory_ = StringUtil.isNullOrEmpty(websiteDir) ? 
+      contentCategory_ = !StringUtil.isNullOrEmpty(websiteDir) ? 
             RSConnect.CONTENT_CATEGORY_SITE : null;
    }
    
