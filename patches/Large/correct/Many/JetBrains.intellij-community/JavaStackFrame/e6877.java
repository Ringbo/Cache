diff --git a/java/debugger/impl/src/com/intellij/debugger/engine/JavaStackFrame.java b/java/debugger/impl/src/com/intellij/debugger/engine/JavaStackFrame.java
index 0bd8f9a..f0ab097 100644
--- a/java/debugger/impl/src/com/intellij/debugger/engine/JavaStackFrame.java
+++ b/java/debugger/impl/src/com/intellij/debugger/engine/JavaStackFrame.java
@@ -254,7 +254,7 @@
             if (DebuggerUtils.isSynthetic(field) && StringUtil.startsWith(field.name(), FieldDescriptorImpl.OUTER_LOCAL_VAR_FIELD_PREFIX)) {
               final FieldDescriptorImpl fieldDescriptor = myNodeManager.getFieldDescriptor(myDescriptor, thisObjectReference, field);
               children.add(JavaValue.create(fieldDescriptor, evaluationContext, myNodeManager));
-              visibleLocals.add(fieldDescriptor.getName());
+              visibleLocals.add(fieldDescriptor.calcValueName());
             }
           }
         }
