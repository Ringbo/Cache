diff --git a/src/java/org/jivesoftware/messenger/IQRouter.java b/src/java/org/jivesoftware/messenger/IQRouter.java
index 05a9948..6cb2898 100644
--- a/src/java/org/jivesoftware/messenger/IQRouter.java
+++ b/src/java/org/jivesoftware/messenger/IQRouter.java
@@ -1,5 +1,5 @@
 /**
- * $RCSfile$
+ * $RCSfile: IQRouter.java,v $
  * $Revision$
  * $Date$
  *
@@ -75,7 +75,7 @@
         else {
             IQ reply = IQ.createResultIQ(packet);
             reply.setChildElement(packet.getChildElement().createCopy());
-            packet.setError(PacketError.Condition.not_authorized);
+            reply.setError(PacketError.Condition.not_authorized);
             sessionManager.getSession(packet.getFrom()).process(reply);
         }
     }
