diff --git a/src/net/java/sip/communicator/service/contactlist/event/MetaContactRenamedEvent.java b/src/net/java/sip/communicator/service/contactlist/event/MetaContactRenamedEvent.java
index 606440d..7fb1b57 100644
--- a/src/net/java/sip/communicator/service/contactlist/event/MetaContactRenamedEvent.java
+++ b/src/net/java/sip/communicator/service/contactlist/event/MetaContactRenamedEvent.java
@@ -35,7 +35,7 @@
      */
     public String getNewDisplayName()
     {
-        return (String)getOldValue();
+        return (String)getNewValue();
     }
 
     /**
@@ -45,6 +45,6 @@
      */
     public String getOldDisplayName()
     {
-        return (String)getNewValue();
+        return (String)getOldValue();
     }
 }
