diff --git a/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java b/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
index 306418e..cc4fbfd 100644
--- a/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
+++ b/xml/xml-psi-impl/src/com/intellij/xml/impl/schema/XmlNSDescriptorImpl.java
@@ -389,7 +389,7 @@
                 return new CachedValueProvider.Result<>(null, PsiModificationTracker.MODIFICATION_COUNT);
               }
               final XmlElementDescriptor xmlElementDescriptor = createElementDescriptor(tag);
-              return new CachedValueProvider.Result<>(xmlElementDescriptor, this.getDependencies());
+              return new CachedValueProvider.Result<>(xmlElementDescriptor, xmlElementDescriptor.getDependencies());
             }, false);
             myDescriptorsMap.put(pair, cachedValue);
             return cachedValue.getValue();
