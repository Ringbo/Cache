diff --git a/src/net/java/sip/communicator/impl/gui/customcontrols/SCScrollPane.java b/src/net/java/sip/communicator/impl/gui/customcontrols/SCScrollPane.java
index f3b3eaa..63edd13 100644
--- a/src/net/java/sip/communicator/impl/gui/customcontrols/SCScrollPane.java
+++ b/src/net/java/sip/communicator/impl/gui/customcontrols/SCScrollPane.java
@@ -46,7 +46,7 @@
     public void setViewportView(JComponent view)
     {
         view.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
-        this.setOpaque(false);
+        view.setOpaque(false);
 
         super.setViewportView(view);
     }
