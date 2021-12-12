diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/SearchFilter.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/SearchFilter.java
index 29ba4e8..4a0f6da 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/SearchFilter.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/SearchFilter.java
@@ -114,7 +114,7 @@
             if (sourceContactList.getDefaultFilter()
                     .equals(TreeContactList.presenceFilter)
                 && GuiActivator.getConfigurationService().getBoolean(
-                    DISABLE_CALL_HISTORY_SEARCH_PROP, true)
+                    DISABLE_CALL_HISTORY_SEARCH_PROP, false)
                 && filterSource.getContactSourceService().getType()
                     == ContactSourceService.HISTORY_TYPE)
                 continue;
