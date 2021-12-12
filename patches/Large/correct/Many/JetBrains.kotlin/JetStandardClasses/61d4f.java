diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/types/lang/JetStandardClasses.java b/compiler/frontend/src/org/jetbrains/jet/lang/types/lang/JetStandardClasses.java
index af503d4..8d057b0 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/types/lang/JetStandardClasses.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/types/lang/JetStandardClasses.java
@@ -172,7 +172,7 @@
                 TypeParameterDescriptor typeParameterDescriptor = TypeParameterDescriptorImpl.createWithDefaultBound(
                         classDescriptor,
                         Collections.<AnnotationDescriptor>emptyList(),
-                        true, Variance.OUT_VARIANCE, Name.identifier("T" + (j + 1)), j);
+                        false, Variance.OUT_VARIANCE, Name.identifier("T" + (j + 1)), j);
                 parameters.add(typeParameterDescriptor);
                 PropertyDescriptor propertyDescriptor = new PropertyDescriptor(classDescriptor, Collections.<AnnotationDescriptor>emptyList(), Modality.FINAL, Visibilities.PUBLIC, false, false, Name.identifier("_" + (j + 1)), CallableMemberDescriptor.Kind.DECLARATION);
                 propertyDescriptor.setType(typeParameterDescriptor.getDefaultType(), Collections.<TypeParameterDescriptorImpl>emptyList(), classDescriptor.getImplicitReceiver(), ReceiverDescriptor.NO_RECEIVER);
@@ -232,7 +232,7 @@
             parameters.add(0, TypeParameterDescriptorImpl.createWithDefaultBound(
                     receiverFunction,
                     Collections.<AnnotationDescriptor>emptyList(),
-                    true, Variance.IN_VARIANCE, Name.identifier("T"), 0));
+                    false, Variance.IN_VARIANCE, Name.identifier("T"), 0));
             RECEIVER_FUNCTION[i] = receiverFunction.initialize(
                     false,
                     parameters,
@@ -255,12 +255,12 @@
             parameters.add(TypeParameterDescriptorImpl.createWithDefaultBound(
                     function,
                     Collections.<AnnotationDescriptor>emptyList(),
-                    true, Variance.IN_VARIANCE, Name.identifier("P" + j), j));
+                    false, Variance.IN_VARIANCE, Name.identifier("P" + j), j));
         }
         parameters.add(TypeParameterDescriptorImpl.createWithDefaultBound(
                 function,
                 Collections.<AnnotationDescriptor>emptyList(),
-                true, Variance.OUT_VARIANCE, Name.identifier("R"), parameterCount + 1));
+                false, Variance.OUT_VARIANCE, Name.identifier("R"), parameterCount + 1));
         return parameters;
     }
 
