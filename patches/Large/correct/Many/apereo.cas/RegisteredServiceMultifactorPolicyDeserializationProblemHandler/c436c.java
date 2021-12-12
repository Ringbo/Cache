diff --git a/core/cas-server-core-services-api/src/main/java/org/apereo/cas/services/util/RegisteredServiceMultifactorPolicyDeserializationProblemHandler.java b/core/cas-server-core-services-api/src/main/java/org/apereo/cas/services/util/RegisteredServiceMultifactorPolicyDeserializationProblemHandler.java
index 68544d4..54de191 100644
--- a/core/cas-server-core-services-api/src/main/java/org/apereo/cas/services/util/RegisteredServiceMultifactorPolicyDeserializationProblemHandler.java
+++ b/core/cas-server-core-services-api/src/main/java/org/apereo/cas/services/util/RegisteredServiceMultifactorPolicyDeserializationProblemHandler.java
@@ -26,7 +26,7 @@
             if (StringUtils.equals("NOT_SET", valueToConvert)) {
                 LOGGER.warn("Found legacy attribute value [{}] which will be converted to [{}] as part of a service multifactor authentication policy."
                         + "The definition SHOULD manually be upgraded to the new supported syntax",
-                    valueToConvert, RegisteredServiceMultifactorPolicy.FailureModes.UNDEFINED, "misagh");
+                    valueToConvert, RegisteredServiceMultifactorPolicy.FailureModes.UNDEFINED);
                 return RegisteredServiceMultifactorPolicy.FailureModes.UNDEFINED;
             }
         }
