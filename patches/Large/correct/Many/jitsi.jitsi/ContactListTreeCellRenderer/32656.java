diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
index 978cdef..bad9e92 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
@@ -267,7 +267,7 @@
                             else if (providersCount > 1)
                                 chooseAccountDialog
                                     = new ChooseCallAccountPopupMenu(
-                                        tree, providers);
+                                        tree, detail.getAddress(), providers);
                         }
                     }
                     else if (telephonyContacts.size() > 1)
