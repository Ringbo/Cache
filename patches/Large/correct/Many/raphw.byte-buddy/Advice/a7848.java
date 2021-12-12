diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/asm/Advice.java b/byte-buddy-dep/src/main/java/net/bytebuddy/asm/Advice.java
index b9072c3..e18a952 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/asm/Advice.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/asm/Advice.java
@@ -3607,7 +3607,7 @@
             /**
              * A list of virtual method arguments that are available before the instrumented method is executed.
              */
-            private final TypeList entryTypes;
+            private final TypeList enterTypes;
 
             /**
              * A list of virtual method arguments that are available after the instrumented method has completed.
@@ -3628,12 +3628,12 @@
              * Creates a new default meta data handler that recomputes the space requirements of an instrumented method.
              *
              * @param instrumentedMethod The instrumented method.
-             * @param entryTypes         A list of virtual method arguments that are available before the instrumented method is executed.
+             * @param enterTypes         A list of virtual method arguments that are available before the instrumented method is executed.
              * @param exitTypes          A list of virtual method arguments that are available after the instrumented method has completed.
              */
-            protected Default(MethodDescription instrumentedMethod, TypeList entryTypes, TypeList exitTypes) {
+            protected Default(MethodDescription instrumentedMethod, TypeList enterTypes, TypeList exitTypes) {
                 this.instrumentedMethod = instrumentedMethod;
-                this.entryTypes = entryTypes;
+                this.enterTypes = enterTypes;
                 this.exitTypes = exitTypes;
             }
 
@@ -3641,24 +3641,24 @@
              * Creates a method size handler applicable for the given instrumented method.
              *
              * @param instrumentedMethod The instrumented method.
-             * @param entryTypes         A list of virtual method arguments that are available before the instrumented method is executed.
+             * @param enterTypes         A list of virtual method arguments that are available before the instrumented method is executed.
              * @param exitTypes          A list of virtual method arguments that are available after the instrumented method has completed.
              * @param writerFlags        The flags supplied to the ASM class writer.
              * @return An appropriate method size handler.
              */
             protected static MethodSizeHandler.ForInstrumentedMethod of(MethodDescription instrumentedMethod,
-                                                                        List<? extends TypeDescription> entryTypes,
+                                                                        List<? extends TypeDescription> enterTypes,
                                                                         List<? extends TypeDescription> exitTypes,
                                                                         int writerFlags) {
                 return (writerFlags & (ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES)) != 0
                         ? NoOp.INSTANCE
-                        : new Default(instrumentedMethod, new TypeList.Explicit(entryTypes), new TypeList.Explicit(exitTypes));
+                        : new Default(instrumentedMethod, new TypeList.Explicit(enterTypes), new TypeList.Explicit(exitTypes));
             }
 
             @Override
             public MethodSizeHandler.ForAdvice bindEntry(MethodDescription.InDefinedShape adviceMethod) {
                 stackSize = Math.max(stackSize, adviceMethod.getReturnType().getStackSize().getSize());
-                return new ForAdvice(adviceMethod, new TypeList.Empty(), new TypeList.Explicit(entryTypes));
+                return new ForAdvice(adviceMethod, new TypeList.Empty(), new TypeList.Explicit(enterTypes));
             }
 
             @Override
@@ -3666,7 +3666,7 @@
                 stackSize = Math.max(stackSize, adviceMethod.getReturnType().getStackSize().maximum(skipThrowable
                         ? StackSize.ZERO
                         : StackSize.SINGLE).getSize());
-                return new ForAdvice(adviceMethod, new TypeList.Explicit(CompoundList.of(entryTypes, exitTypes)), new TypeList.Empty());
+                return new ForAdvice(adviceMethod, new TypeList.Explicit(CompoundList.of(enterTypes, exitTypes)), new TypeList.Empty());
             }
 
             @Override
@@ -3677,7 +3677,7 @@
             @Override
             public int compoundLocalVariableLength(int localVariableLength) {
                 return Math.max(this.localVariableLength, localVariableLength
-                        + entryTypes.getStackSize()
+                        + enterTypes.getStackSize()
                         + exitTypes.getStackSize());
             }
 
@@ -3699,7 +3699,7 @@
                 /**
                  * A list of virtual method arguments that are available before the instrumented method is executed.
                  */
-                private final TypeList entryTypes;
+                private final TypeList enterTypes;
 
                 /**
                  * A list of virtual method arguments that are available after the instrumented method has completed.
@@ -3715,12 +3715,12 @@
                  * Creates a new method size handler for an advice method.
                  *
                  * @param adviceMethod The advice method.
-                 * @param entryTypes   A list of virtual method arguments that are available before the instrumented method is executed.
+                 * @param enterTypes   A list of virtual method arguments that are available before the instrumented method is executed.
                  * @param exitTypes    A list of virtual method arguments that are available after the instrumented method has completed.
                  */
-                protected ForAdvice(MethodDescription.InDefinedShape adviceMethod, TypeList entryTypes, TypeList exitTypes) {
+                protected ForAdvice(MethodDescription.InDefinedShape adviceMethod, TypeList enterTypes, TypeList exitTypes) {
                     this.adviceMethod = adviceMethod;
-                    this.entryTypes = entryTypes;
+                    this.enterTypes = enterTypes;
                     this.exitTypes = exitTypes;
                     stackSize = Math.max(stackSize, adviceMethod.getReturnType().getStackSize().getSize());
                 }
@@ -3741,7 +3741,7 @@
                     Default.this.localVariableLength = Math.max(Default.this.localVariableLength, localVariableLength
                             - adviceMethod.getStackSize()
                             + instrumentedMethod.getStackSize()
-                            + entryTypes.getStackSize()
+                            + enterTypes.getStackSize()
                             + exitTypes.getStackSize());
                 }
 
@@ -3903,7 +3903,7 @@
             /**
              * A list of virtual method arguments that are available before the instrumented method is executed.
              */
-            protected final TypeList entryTypes;
+            protected final TypeList enterTypes;
 
             /**
              * A list of virtual method arguments that are available after the instrumented method has completed.
@@ -3925,18 +3925,18 @@
              *
              * @param instrumentedType   The instrumented type.
              * @param instrumentedMethod The instrumented method.
-             * @param entryTypes         A list of virtual method arguments that are available before the instrumented method is executed.
+             * @param enterTypes         A list of virtual method arguments that are available before the instrumented method is executed.
              * @param exitTypes          A list of virtual method arguments that are available after the instrumented method has completed.
              * @param expandFrames       {@code true} if the meta data handler is expected to expand its frames.
              */
             protected Default(TypeDescription instrumentedType,
                               MethodDescription instrumentedMethod,
-                              TypeList entryTypes,
+                              TypeList enterTypes,
                               TypeList exitTypes,
                               boolean expandFrames) {
                 this.instrumentedType = instrumentedType;
                 this.instrumentedMethod = instrumentedMethod;
-                this.entryTypes = entryTypes;
+                this.enterTypes = enterTypes;
                 this.exitTypes = exitTypes;
                 this.expandFrames = expandFrames;
             }
@@ -3946,7 +3946,7 @@
              *
              * @param instrumentedType   The instrumented type.
              * @param instrumentedMethod The instrumented method.
-             * @param entryTypes         A list of virtual method arguments that are available before the instrumented method is executed.
+             * @param enterTypes         A list of virtual method arguments that are available before the instrumented method is executed.
              * @param exitTypes          A list of virtual method arguments that are available after the instrumented method has completed.
              * @param classFileVersion   The instrumented type's class file version.
              * @param writerFlags        The flags supplied to the ASM writer.
@@ -3955,14 +3955,14 @@
              */
             protected static ForInstrumentedMethod of(TypeDescription instrumentedType,
                                                       MethodDescription instrumentedMethod,
-                                                      List<? extends TypeDescription> entryTypes,
+                                                      List<? extends TypeDescription> enterTypes,
                                                       List<? extends TypeDescription> exitTypes,
                                                       ClassFileVersion classFileVersion,
                                                       int writerFlags,
                                                       int readerFlags) {
                 return (writerFlags & ClassWriter.COMPUTE_FRAMES) != 0 || classFileVersion.isLessThan(ClassFileVersion.JAVA_V6)
                         ? NoOp.INSTANCE
-                        : new Default(instrumentedType, instrumentedMethod, new TypeList.Explicit(entryTypes), new TypeList.Explicit(exitTypes), (readerFlags & ClassReader.EXPAND_FRAMES) != 0);
+                        : new Default(instrumentedType, instrumentedMethod, new TypeList.Explicit(enterTypes), new TypeList.Explicit(exitTypes), (readerFlags & ClassReader.EXPAND_FRAMES) != 0);
             }
 
             /**
@@ -3991,12 +3991,12 @@
 
             @Override
             public StackMapFrameHandler.ForAdvice bindEntry(MethodDescription.InDefinedShape adviceMethod) {
-                return new ForAdvice(adviceMethod, new TypeList.Empty(), entryTypes, TranslationMode.ENTRY);
+                return new ForAdvice(adviceMethod, new TypeList.Empty(), enterTypes, TranslationMode.ENTRY);
             }
 
             @Override
             public StackMapFrameHandler.ForAdvice bindExit(MethodDescription.InDefinedShape adviceMethod) {
-                return new ForAdvice(adviceMethod, new TypeList.Explicit(CompoundList.of(entryTypes, exitTypes)), new TypeList.Empty(), TranslationMode.EXIT);
+                return new ForAdvice(adviceMethod, new TypeList.Explicit(CompoundList.of(enterTypes, exitTypes)), new TypeList.Empty(), TranslationMode.EXIT);
             }
 
             @Override
@@ -4016,7 +4016,7 @@
                 translateFrame(methodVisitor,
                         TranslationMode.COPY,
                         instrumentedMethod,
-                        entryTypes,
+                        enterTypes,
                         type,
                         localVariableLength,
                         localVariable,
@@ -4112,7 +4112,7 @@
                         methodVisitor.visitFrame(Opcodes.F_SAME1, EMPTY.length, EMPTY, 1, new Object[]{toFrame(instrumentedMethod.getReturnType().asErasure())});
                     }
                 } else {
-                    injectFullFrame(methodVisitor, entryTypes, instrumentedMethod.getReturnType().represents(void.class)
+                    injectFullFrame(methodVisitor, enterTypes, instrumentedMethod.getReturnType().represents(void.class)
                             ? Collections.<TypeDescription>emptyList()
                             : Collections.singletonList(instrumentedMethod.getReturnType().asErasure()));
                 }
@@ -4123,7 +4123,7 @@
                 if (!expandFrames && currentFrameDivergence == 0) {
                     methodVisitor.visitFrame(Opcodes.F_SAME1, EMPTY.length, EMPTY, 1, new Object[]{Type.getInternalName(Throwable.class)});
                 } else {
-                    injectFullFrame(methodVisitor, entryTypes, Collections.singletonList(TypeDescription.THROWABLE));
+                    injectFullFrame(methodVisitor, enterTypes, Collections.singletonList(TypeDescription.THROWABLE));
                 }
             }
 
@@ -4141,7 +4141,7 @@
                         methodVisitor.visitFrame(Opcodes.F_APPEND, local.length, local, EMPTY.length, EMPTY);
                     }
                 } else {
-                    injectFullFrame(methodVisitor, CompoundList.of(entryTypes, exitTypes), Collections.<TypeDescription>emptyList());
+                    injectFullFrame(methodVisitor, CompoundList.of(enterTypes, exitTypes), Collections.<TypeDescription>emptyList());
                 }
             }
 
@@ -4299,7 +4299,7 @@
                 /**
                  * A list of virtual method arguments that are available before the instrumented method is executed.
                  */
-                protected final TypeList entryTypes;
+                protected final TypeList enterTypes;
 
                 /**
                  * A list of virtual method arguments that are available after the instrumented method has completed.
@@ -4315,17 +4315,17 @@
                  * Creates a new meta data handler for an advice method.
                  *
                  * @param adviceMethod    The method description for which frames are translated.
-                 * @param entryTypes      A list of virtual method arguments that are available before the instrumented method is executed.
+                 * @param enterTypes      A list of virtual method arguments that are available before the instrumented method is executed.
                  * @param exitTypes       A list of virtual method arguments that are available after the instrumented method has completed.
                  * @param translationMode The translation mode to apply for this advice method. Should be
                  *                        either {@link TranslationMode#ENTRY} or {@link TranslationMode#EXIT}.
                  */
                 protected ForAdvice(MethodDescription.InDefinedShape adviceMethod,
-                                    TypeList entryTypes,
+                                    TypeList enterTypes,
                                     TypeList exitTypes,
                                     TranslationMode translationMode) {
                     this.adviceMethod = adviceMethod;
-                    this.entryTypes = entryTypes;
+                    this.enterTypes = enterTypes;
                     this.exitTypes = exitTypes;
                     this.translationMode = translationMode;
                 }
@@ -4340,7 +4340,7 @@
                     Default.this.translateFrame(methodVisitor,
                             translationMode,
                             adviceMethod,
-                            entryTypes,
+                            enterTypes,
                             type,
                             localVariableLength,
                             localVariable,
@@ -4357,7 +4357,7 @@
                             methodVisitor.visitFrame(Opcodes.F_SAME1, EMPTY.length, EMPTY, 1, new Object[]{toFrame(adviceMethod.getReturnType().asErasure())});
                         }
                     } else {
-                        injectFullFrame(methodVisitor, entryTypes, exitTypes.isEmpty() || adviceMethod.getReturnType().represents(void.class)
+                        injectFullFrame(methodVisitor, enterTypes, exitTypes.isEmpty() || adviceMethod.getReturnType().represents(void.class)
                                 ? Collections.<TypeDescription>emptyList()
                                 : Collections.singletonList(adviceMethod.getReturnType().asErasure()));
                     }
@@ -4368,7 +4368,7 @@
                     if (!expandFrames && currentFrameDivergence == 0) {
                         methodVisitor.visitFrame(Opcodes.F_SAME1, EMPTY.length, EMPTY, 1, new Object[]{Type.getInternalName(Throwable.class)});
                     } else {
-                        injectFullFrame(methodVisitor, entryTypes, Collections.singletonList(TypeDescription.THROWABLE));
+                        injectFullFrame(methodVisitor, enterTypes, Collections.singletonList(TypeDescription.THROWABLE));
                     }
                 }
 
@@ -4386,7 +4386,7 @@
                             methodVisitor.visitFrame(Opcodes.F_APPEND, local.length, local, EMPTY.length, EMPTY);
                         }
                     } else {
-                        injectFullFrame(methodVisitor, CompoundList.of(entryTypes, exitTypes), Collections.<TypeDescription>emptyList());
+                        injectFullFrame(methodVisitor, CompoundList.of(enterTypes, exitTypes), Collections.<TypeDescription>emptyList());
                     }
                 }
             }
@@ -7237,13 +7237,13 @@
             this.methodVisitor = methodVisitor;
             this.instrumentedMethod = instrumentedMethod;
             padding = methodEnter.getEnterType().getStackSize().getSize();
-            List<TypeDescription> entryTypes = methodEnter.getEnterType().represents(void.class)
+            List<TypeDescription> enterTypes = methodEnter.getEnterType().represents(void.class)
                     ? Collections.<TypeDescription>emptyList()
                     : Collections.singletonList(methodEnter.getEnterType().asErasure());
-            methodSizeHandler = MethodSizeHandler.Default.of(instrumentedMethod, entryTypes, exitTypes, writerFlags);
+            methodSizeHandler = MethodSizeHandler.Default.of(instrumentedMethod, enterTypes, exitTypes, writerFlags);
             stackMapFrameHandler = StackMapFrameHandler.Default.of(instrumentedType,
                     instrumentedMethod,
-                    entryTypes,
+                    enterTypes,
                     exitTypes,
                     implementationContext.getClassFileVersion(),
                     writerFlags,
