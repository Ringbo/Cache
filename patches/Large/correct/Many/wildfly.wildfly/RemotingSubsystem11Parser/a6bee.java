diff --git a/remoting/src/main/java/org/jboss/as/remoting/RemotingSubsystem11Parser.java b/remoting/src/main/java/org/jboss/as/remoting/RemotingSubsystem11Parser.java
index dcf4657..df44070 100644
--- a/remoting/src/main/java/org/jboss/as/remoting/RemotingSubsystem11Parser.java
+++ b/remoting/src/main/java/org/jboss/as/remoting/RemotingSubsystem11Parser.java
@@ -435,7 +435,7 @@
         final PathAddress address = PathAddress.pathAddress(PathAddress.pathAddress(parentAddress), PathElement.pathElement(CommonAttributes.REMOTE_OUTBOUND_CONNECTION, name));
 
         // create add operation add it to the list of operations
-        operations.add(getConnectionAddOperation(name, outboundSocketBindingRef, address));
+        operations.add(getConnectionAddOperation(name, outboundSocketBindingRef, username, securityRealm, address));
         // parse the nested elements
         final EnumSet<Element> visited = EnumSet.noneOf(Element.class);
         while (reader.hasNext() && reader.nextTag() != END_ELEMENT) {
