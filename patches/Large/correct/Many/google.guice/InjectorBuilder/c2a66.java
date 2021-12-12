diff --git a/src/com/google/inject/InjectorBuilder.java b/src/com/google/inject/InjectorBuilder.java
index 7694094..8a1beef 100644
--- a/src/com/google/inject/InjectorBuilder.java
+++ b/src/com/google/inject/InjectorBuilder.java
@@ -67,25 +67,25 @@
    * 
    * By default, explicit bindings are not required.
    */
-  InjectorBuilder requireExplicitBindings() {
+  public InjectorBuilder requireExplicitBindings() {
     this.jitDisabled = true;
     return this;
   }
 
   /** Adds more modules that will be used when the Injector is created. */
-  InjectorBuilder addModules(Iterable<? extends Module> modules) {
+  public InjectorBuilder addModules(Iterable<? extends Module> modules) {
     creator.addModules(modules);
     return this;
   }
   
   /** Adds more modules that will be used when the Injector is created. */
-  InjectorBuilder addModules(Module... modules) {
+  public InjectorBuilder addModules(Module... modules) {
     creator.addModules(Arrays.asList(modules));
     return this;
   }
 
   /** Builds the injector. */
-  Injector build() {
+  public Injector build() {
     creator.injectorOptions(new InternalInjectorCreator.InjectorOptions(stage, jitDisabled));
     return creator.build();
   }
