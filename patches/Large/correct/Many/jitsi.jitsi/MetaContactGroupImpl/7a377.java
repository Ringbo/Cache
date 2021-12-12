diff --git a/src/net/java/sip/communicator/impl/contactlist/MetaContactGroupImpl.java b/src/net/java/sip/communicator/impl/contactlist/MetaContactGroupImpl.java
index 64cde35..c17ec9b 100644
--- a/src/net/java/sip/communicator/impl/contactlist/MetaContactGroupImpl.java
+++ b/src/net/java/sip/communicator/impl/contactlist/MetaContactGroupImpl.java
@@ -639,7 +639,7 @@
             MetaContactGroupImpl mcGroup
                 = (MetaContactGroupImpl)groupsIter.next();
 
-            if(mcGroup.getGroupName().equals(groupUID))
+            if(mcGroup.getMetaUID().equals(groupUID))
                 return mcGroup;
         }
 
