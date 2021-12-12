diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/component/EJBUtilities.java b/ejb3/src/main/java/org/jboss/as/ejb3/component/EJBUtilities.java
index 592b13c..091c608 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/component/EJBUtilities.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/component/EJBUtilities.java
@@ -92,7 +92,7 @@
             // now get the message listeners for this specific ra identifier
             final List<MessageListener> messageListeners = resourceAdapterRepository.getMessageListeners(raIdentifier);
             if (messageListeners == null || messageListeners.isEmpty()) {
-                throw MESSAGES.unknownMessageListenerType(resourceAdapterName, messageListenerInterface.getName());
+                throw MESSAGES.unknownMessageListenerType(messageListenerInterface.getName(), resourceAdapterName);
             }
             MessageListener requiredMessageListener = null;
             // now find the expected message listener from the list of message listeners for this resource adapter
@@ -103,7 +103,7 @@
                 }
             }
             if (requiredMessageListener == null) {
-                throw MESSAGES.unknownMessageListenerType(resourceAdapterName, messageListenerInterface.getName());
+                throw MESSAGES.unknownMessageListenerType(messageListenerInterface.getName(), resourceAdapterName);
             }
             // found the message listener, now finally create the activation spec
             final Activation activation = requiredMessageListener.getActivation();
