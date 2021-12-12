diff --git a/src/gwt/src/org/rstudio/core/client/events/UpdateTabPanelsEvent.java b/src/gwt/src/org/rstudio/core/client/events/UpdateTabPanelsEvent.java
index f2688ec..0bc0b04 100644
--- a/src/gwt/src/org/rstudio/core/client/events/UpdateTabPanelsEvent.java
+++ b/src/gwt/src/org/rstudio/core/client/events/UpdateTabPanelsEvent.java
@@ -24,7 +24,7 @@
       void onUpdateTabPanels(UpdateTabPanelsEvent event);
    }
 
-   public UpdateTabPanelsEvent(string activeTab)
+   public UpdateTabPanelsEvent(String activeTab)
    {
       activeTab_ = activeTab;
    }
