diff --git a/src/net/java/sip/communicator/impl/gui/main/account/AccountRegFirstPage.java b/src/net/java/sip/communicator/impl/gui/main/account/AccountRegFirstPage.java
index 2c3971f..beb63f1 100644
--- a/src/net/java/sip/communicator/impl/gui/main/account/AccountRegFirstPage.java
+++ b/src/net/java/sip/communicator/impl/gui/main/account/AccountRegFirstPage.java
@@ -64,7 +64,7 @@
         
         this.tableModel = new ExtendedTableModel();
         
-        this.setPreferredSize(new Dimension(500, 350));
+        this.setPreferredSize(new Dimension(500, 400));
         
         this.accountRegsTable.setSelectionMode(
                 ListSelectionModel.SINGLE_SELECTION);
