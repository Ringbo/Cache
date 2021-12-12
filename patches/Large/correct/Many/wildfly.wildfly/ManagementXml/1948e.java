diff --git a/domain-management/src/main/java/org/jboss/as/domain/management/parsing/ManagementXml.java b/domain-management/src/main/java/org/jboss/as/domain/management/parsing/ManagementXml.java
index ebf2210..6f6dec7 100644
--- a/domain-management/src/main/java/org/jboss/as/domain/management/parsing/ManagementXml.java
+++ b/domain-management/src/main/java/org/jboss/as/domain/management/parsing/ManagementXml.java
@@ -2922,7 +2922,7 @@
             PropertiesAuthenticationResourceDefinition.PATH.marshallAsAttribute(properties, writer);
             PropertiesAuthenticationResourceDefinition.RELATIVE_TO.marshallAsAttribute(properties, writer);
             PropertiesAuthenticationResourceDefinition.PLAIN_TEXT.marshallAsAttribute(properties, writer);
-        } else if (authentication.hasDefined(USERS)) {
+        } else if (authentication.has(USERS)) {
             ModelNode userDomain = authentication.get(USERS);
             ModelNode users = userDomain.hasDefined(USER) ? userDomain.require(USER) : new ModelNode().setEmptyObject();
             writer.writeStartElement(Element.USERS.getLocalName());
