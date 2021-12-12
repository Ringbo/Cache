diff --git a/src/net/java/sip/communicator/impl/gui/main/chat/ChatConversationPanel.java b/src/net/java/sip/communicator/impl/gui/main/chat/ChatConversationPanel.java
index d66125b..c09a979 100755
--- a/src/net/java/sip/communicator/impl/gui/main/chat/ChatConversationPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/chat/ChatConversationPanel.java
@@ -956,10 +956,10 @@
         if(firstMessageElement == null)
             return new Date(Long.MAX_VALUE);
 
-        Long dateObject = (Long) firstMessageElement
-            .getAttributes().getAttribute("date");
+        String dateObject = firstMessageElement
+            .getAttributes().getAttribute("date").toString();
 
-        return new Date(dateObject);
+        return new Date(Long.parseLong(dateObject));
     }
 
     /**
@@ -988,10 +988,10 @@
         if(lastMessageElement == null)
             return new Date(0);
 
-        Long dateObject = (Long) lastMessageElement
-            .getAttributes().getAttribute("date");
+        String dateObject = lastMessageElement
+            .getAttributes().getAttribute("date").toString();
 
-        return new Date(dateObject);
+        return new Date(Long.parseLong(dateObject));
     }
 
     /**
