diff --git a/host-controller/src/main/java/org/jboss/as/domain/controller/transformers/JSFSubsystemTransformers.java b/host-controller/src/main/java/org/jboss/as/domain/controller/transformers/JSFSubsystemTransformers.java
index 348e4a5..ddd7622 100644
--- a/host-controller/src/main/java/org/jboss/as/domain/controller/transformers/JSFSubsystemTransformers.java
+++ b/host-controller/src/main/java/org/jboss/as/domain/controller/transformers/JSFSubsystemTransformers.java
@@ -67,7 +67,7 @@
                 if (model.hasDefined(SLOT_ATTRIBUTE_NAME)) {
                     ModelNode slot = model.get(SLOT_ATTRIBUTE_NAME);
                     if (!SLOT_DEFAULT_VALUE.equals(slot.asString())) {
-                        context.getLogger().logAttributeWarning(address, SLOT_ATTRIBUTE_NAME, MESSAGES.invalidJSFSlotValue(slot.asString()));
+                        context.getLogger().logAttributeWarning(address, MESSAGES.invalidJSFSlotValue(slot.asString()), SLOT_ATTRIBUTE_NAME);
                     }
                 }
                 Set<String> attributes = new HashSet<String>();
